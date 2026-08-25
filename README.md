# Chart Chatterbox - Android App

A React Native Android application for AI-powered chart analysis and data visualization chatbot.

## Features

✨ **Interactive Chat Interface** - Real-time conversation with AI assistant
📊 **Chart Analysis** - Upload and analyze charts and data visualizations
🎨 **Modern UI** - Beautiful Material Design 3 interface
🔄 **Real-time Updates** - Instant responses and message streaming
📱 **Mobile Optimized** - Touch-friendly interface for Android devices

## Requirements

- Android SDK 24 or higher
- Android Studio Flamingo or newer
- Kotlin 1.9+
- Gradle 8.1+

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/bonolomathebula5-max/chart-chatterbox-android.git
cd chart-chatterbox-android
```

### 2. Open in Android Studio

1. Open Android Studio
2. Select "File" → "Open"
3. Navigate to the cloned directory
4. Click "OK"

### 3. Install Dependencies

Android Studio will automatically download and install dependencies. If not:

```bash
./gradlew build
```

### 4. Connect an Android Device or Emulator

**Using a Physical Device:**
- Enable USB Debugging on your Android device
- Connect via USB

**Using an Emulator:**
- Open AVD Manager in Android Studio
- Create or select an emulator
- Start the emulator

### 5. Build and Run

```bash
./gradlew installDebug
```

Or click the "Run" button in Android Studio.

## Building APK for Installation

### Debug APK

```bash
./gradlew assembleDebug
```

The APK will be generated at: `app/build/outputs/apk/debug/app-debug.apk`

### Release APK (Optimized)

```bash
./gradlew assembleRelease
```

The APK will be generated at: `app/build/outputs/apk/release/app-release.apk`

## Installing APK on Android Phone

### Method 1: Using ADB (Recommended)

```bash
# For debug APK
adb install app/build/outputs/apk/debug/app-debug.apk

# For release APK
adb install app/build/outputs/apk/release/app-release.apk
```

### Method 2: Direct Installation

1. Transfer the APK file to your Android device
2. Open a file manager on your phone
3. Navigate to the APK file
4. Tap to install
5. Grant necessary permissions

### Method 3: Using Android Studio

1. Click "Build" → "Build Bundle(s)/APK(s)" → "Build APK(s)"
2. Once built, click "Locate" to open the APK folder
3. Transfer to your device or use adb install

## Project Structure

```
app/
├── src/main/
│   ├── kotlin/com/chatchatterbox/app/
│   │   ├── MainActivity.kt              # Main activity entry point
│   │   ├── ui/
│   │   │   ├── screens/                # UI screens
│   │   │   │   └── ChartChatterboxApp.kt
│   │   │   └── theme/                  # Material Design theme
│   │   ├── viewmodel/                  # ViewModel for state management
│   │   ├── data/                       # Data models
│   │   └── network/                    # API client & networking
│   ├── res/                            # Resources (strings, themes, etc.)
│   └── AndroidManifest.xml             # App manifest
├── build.gradle                         # App-level build configuration
└── proguard-rules.pro                  # Proguard rules for release
```

## Configuration

### API Endpoint

Update the API base URL in `app/src/main/kotlin/com/chatchatterbox/app/network/ApiService.kt`:

```kotlin
.baseUrl("https://your-api-endpoint.com/")
```

## Troubleshooting

### Build Issues

**Error: "Could not find tools.jar"**
- Ensure Android SDK is properly installed
- Go to File → Settings → Appearance & Behavior → System Settings → Android SDK
- Verify SDK tools are installed

**Error: "Gradle sync failed"**
- Click "File" → "Sync Now"
- Clear cache: Build → Clean Project

### Installation Issues

**APK Won't Install**
- Uninstall previous version: `adb uninstall com.chatchatterbox.app`
- Ensure device has enough storage
- Check device API level (minimum 24)

**Device Not Recognized**
- Install ADB drivers for your device
- Enable USB Debugging on device
- Try different USB port or cable

## Permissions

The app requests the following permissions:
- `INTERNET` - For API communication
- `ACCESS_NETWORK_STATE` - To check network connectivity
- `READ_EXTERNAL_STORAGE` - To upload chart images
- `WRITE_EXTERNAL_STORAGE` - To save analysis results

## Dependencies

- **Jetpack Compose** - Modern UI toolkit
- **Material 3** - Latest Material Design
- **Retrofit** - HTTP client
- **OkHttp** - Network layer
- **Gson** - JSON serialization
- **MPAndroidChart** - Chart visualization
- **Coil** - Image loading

## Development

### Running Tests

```bash
./gradlew test                    # Unit tests
./gradlew connectedAndroidTest    # Instrumented tests
```

### Code Quality

The project uses Android best practices:
- MVVM architecture
- Coroutines for async operations
- StateFlow for reactive state management
- Material Design 3 components

## Contributing

Contributions are welcome! Please:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For issues, questions, or suggestions:
- Open an issue on GitHub
- Contact: support@chatchatterbox.com

## Changelog

### Version 1.0 (Initial Release)
- ✅ Basic chat interface
- ✅ Message history
- ✅ Real-time API integration
- ✅ Material Design 3 UI
- ✅ Dark mode support

## Roadmap

- 📷 Image upload and chart recognition
- 📊 Advanced data visualization
- 💾 Chat history persistence
- 🔐 User authentication
- 🌐 Multi-language support
- 🎨 Customizable themes

---

**Made with ❤️ by Chart Chatterbox Team**
