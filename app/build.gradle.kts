import utils.*

plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(Base.currentSDK)

    defaultConfig {
        applicationId = Base.applicationId
        minSdkVersion(Base.minSDK)
        targetSdkVersion(Base.currentSDK)
        versionCode = Base.versionCode
        versionName = Base.versionName
    }

    buildTypes {

        getByName(BuildTypes.DEBUG) {
            applicationIdSuffix = ".${this.name}"
        }
        getByName(BuildTypes.RELEASE) {
            val proguardFile = getDefaultProguardFile(Proguard.proguardFileName)

            isMinifyEnabled = true
            proguardFiles(proguardFile, Proguard.proguardRulesFileName)
        }
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

    implementation(project(Modules.Feature.home))
    implementation(project(Modules.Feature.form))
    implementation(project(Modules.Feature.list))

    implementation(project(Modules.Layer.baseUi))

}