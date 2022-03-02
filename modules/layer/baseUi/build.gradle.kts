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
    api(Dependencies.kotlin)
    api(Dependencies.Ktx.core)
    api(Dependencies.Androidx.appCompat)
    api(Dependencies.Androidx.material)
    api(Dependencies.Androidx.constraintLayout)

    /**
     * Android navigation
     * https://developer.android.com/guide/navigation
     */
    api(Dependencies.Navigation.navigationFragmentKtx)
    api(Dependencies.Navigation.navigationRuntimeKtx)
    api(Dependencies.Navigation.navigationUiKtx)
}
