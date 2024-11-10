plugins {
    //alias(libs.plugins.android.application)
    //id("kotlin-kapt")
    id ("com.android.application")
    id ("kotlin-android")
    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.demo.sampleweatherapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.demo.sampleweatherapp"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled=true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField( "String", "BASE_URL", "https://openweathermap.org/")
        }


        debug {
            buildConfigField ("String", "BASE_URL", "\"https://openweathermap.org/\"")
        }


    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // adding dagger-hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)

    //Adding Retrofit and latest Gson converter with it...
    implementation (libs.retrofit)
    implementation (libs.squareup.converter.gson)
    implementation(libs.logging.interceptor)


    //Image Library
    implementation (libs.glide)
    ksp (libs.compiler)
}

