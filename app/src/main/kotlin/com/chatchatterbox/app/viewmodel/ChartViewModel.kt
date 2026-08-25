package com.chatchatterbox.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chatchatterbox.app.data.ChatMessage
import com.chatchatterbox.app.network.ApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ChartViewModel : ViewModel() {
    private val apiService = ApiService()

    private val _messages = MutableStateFlow<List<ChatMessage>>(emptyList())
    val messages: StateFlow<List<ChatMessage>> = _messages

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    init {
        addMessage(
            ChatMessage(
                text = "👋 Hello! I'm Chart Chatterbox. Upload or describe a chart, and I'll help you analyze it!",
                isUser = false
            )
        )
    }

    fun sendMessage(userMessage: String) {
        addMessage(ChatMessage(text = userMessage, isUser = true))
        _isLoading.value = true

        viewModelScope.launch {
            try {
                val response = apiService.analyzeChart(userMessage)
                addMessage(
                    ChatMessage(
                        text = response.analysis,
                        isUser = false
                    )
                )
            } catch (e: Exception) {
                addMessage(
                    ChatMessage(
                        text = "Sorry, I encountered an error: ${e.message}",
                        isUser = false
                    )
                )
            } finally {
                _isLoading.value = false
            }
        }
    }

    private fun addMessage(message: ChatMessage) {
        val currentMessages = _messages.value.toMutableList()
        currentMessages.add(message)
        _messages.value = currentMessages
    }
}
