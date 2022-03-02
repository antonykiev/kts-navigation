buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(utils.BuildPlugins.gradle)
        classpath(utils.BuildPlugins.kotlin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}