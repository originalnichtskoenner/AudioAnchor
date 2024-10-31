plugins {
    id("com.android.application")
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.prangesoftwaresolutions.audioanchor"
        minSdk = 21
        targetSdk = 29
        versionCode = 29
        versionName = "2.3.3"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }

        debug {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-DEBUG"
            isDebuggable = true
        }
    }
    compileOptions {
        encoding = "UTF-8"
        sourceCompatibility(JavaVersion.VERSION_17)
        targetCompatibility(JavaVersion.VERSION_17)
    }
    packagingOptions {
        jniLibs {
            excludes += "/META-INF/*"
        }
        resources {
            excludes += "/META-INF/*"
        }
    }
    namespace = "com.prangesoftwaresolutions.audioanchor"
}

dependencies {
// AndroidX
    implementation("androidx.annotation:annotation:1.9.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("androidx.core:core:1.13.1")
    implementation("androidx.media:media:1.7.0")
    implementation("androidx.preference:preference:1.2.1")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("com.google.android.material:material:1.12.0")

// Other
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.nambimobile.widgets:expandable-fab:1.2.1")
}
