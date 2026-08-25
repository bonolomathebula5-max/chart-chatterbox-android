package com.chatchatterbox.app.network

import com.google.gson.annotations.SerializedName
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

data class ChartAnalysisRequest(
    val message: String
)

data class ChartAnalysisResponse(
    @SerializedName("analysis")
    val analysis: String
)

interface ChartApiInterface {
    @POST("/analyze")
    suspend fun analyzeChart(@Body request: ChartAnalysisRequest): ChartAnalysisResponse
}

class ApiService {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.chatchatterbox.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiInterface = retrofit.create(ChartApiInterface::class.java)

    suspend fun analyzeChart(message: String): ChartAnalysisResponse {
        return apiInterface.analyzeChart(ChartAnalysisRequest(message))
    }
}
