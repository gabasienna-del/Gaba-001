plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("dev.rikka.tools.refine")
}

android {
    namespace = "com.gabasienna.module"
    compileSdk = 34

    defaultConfig {
        minSdk = 30
        targetSdk = 34
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    compileOnly("de.robv.android.xposed:api:82")
    compileOnly("org.lsposed.hiddenapibypass:hiddenapibypass:4.3")
    implementation("androidx.core:core-ktx:1.12.0")
}
