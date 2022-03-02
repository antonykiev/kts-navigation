import utils.*

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(Base.currentSDK)
    defaultConfig {
        minSdkVersion(Base.minSDK)
        targetSdkVersion(Base.currentSDK)
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    api(project(Modules.Layer.baseUi))
}
