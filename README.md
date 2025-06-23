# 🚌 Bus Schedule App

Welcome to the Bus Schedule App! This project demonstrates a simple Android application built with Kotlin, Jetpack Compose, and Room database. The app displays a list of bus stops and their arrival times. Tapping a bus stop shows all arrival times for that stop.

---

## 📋 Features
- View a list of bus stops and their next arrival times
- Tap a stop to see all scheduled arrivals
- Data stored locally using Room database
- Modern UI with Jetpack Compose

---

## 🛠️ Prerequisites
- Android Studio (latest stable version recommended)
- Basic knowledge of:
  - Kotlin syntax
  - Jetpack Compose
  - SQL databases and queries
  - Running Android projects

---

## 🚀 Getting Started

### 1. Clone or Download the Project
- Clone this repository or download the ZIP file and extract it.

### 2. Open in Android Studio
- Launch Android Studio.
- Select **File > Open** and choose the project folder.

### 3. Build the Project
- Let Gradle sync and download dependencies (this may take a few minutes).
- If prompted, update any required SDKs or plugins.

### 4. Run the App
- Connect an Android device or start an emulator.
- Click the **Run** button (green triangle) or use `Shift + F10`.

---

## 📂 Project Structure
- `app/src/main/java/` - Kotlin source code
- `app/src/main/res/` - Resources (layouts, strings, etc.)
- `app/src/main/assets/` - Database assets (if any)
- `app/src/main/AndroidManifest.xml` - App manifest

---

## 🏗️ How It Works
- **Room Database** stores bus stop and schedule data.
- **ScheduleDao** provides queries for accessing schedules.
- **ViewModel** fetches and formats data for the UI.
- **Jetpack Compose** builds the UI for listing stops and times.

---

## 🧑‍💻 Customization & Development
- Modify the Room database or DAO to change data structure or queries.
- Update Compose UI files for new features or design changes.
- Add new screens or navigation as needed.

---

## ❓ Troubleshooting
- If Gradle sync fails, try **File > Sync Project with Gradle Files**.
- Ensure your Android SDK and build tools are up to date.
- Clean and rebuild the project if you encounter build errors.

---

## 📜 License
This project is licensed under the [Apache 2.0 License](LICENSE).

---

Enjoy exploring and learning with the Bus Schedule App!
