// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        mavenCentral()

    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.7.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.51.1")


        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

plugins {
    id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
}


