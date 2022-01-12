object Apps {
    const val compileSdk = 32
    const val minSdk = 21
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val jvmVersion = "1.8"
}

object Versions {
    const val gradle = "7.0.4"
}

object Kotlin {
    const val version = "1.6.10"

    const val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"

    object Coroutine {
        private const val coroutinesVersion = "1.5.2"
        private const val group = "org.jetbrains.kotlinx"

        const val core = "$group:kotlinx-coroutines-core:$coroutinesVersion"
        const val android = "$group:kotlinx-coroutines-android:$coroutinesVersion"
        const val test = "$group:kotlinx-coroutines-test:$coroutinesVersion"
    }
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:1.4.0"
    const val core = "androidx.core:core-ktx:1.7.0"
    
    object Activity {
        private const val version = "1.4.0"
        const val activityKtx = "androidx.activity:activity-ktx:$version"
    }
    
    object Fragment {
        private const val version = "1.4.0"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:$version"
    }
    
    object View {
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.2"
        const val recyclerview = "androidx.recyclerview:recyclerview:1.2.0"
        const val material = "com.google.android.material:material:1.5.0-rc01"
    }
    
    object Lifecycle {
        private const val group = "androidx.lifecycle"
        private const val version = "2.2.0"

        const val viewModelKtx = "$group:lifecycle-viewmodel-ktx:$version"
        const val liveDataKtx = "$group:lifecycle-livedata-ktx:$version"
        const val lifeCycleExtension = "$group:lifecycle-extensions:$version"
        const val LifecycleScope = "$group:lifecycle-runtime-ktx:$version"
    }
}

object Hilt {
    private const val group = "com.google.dagger"
    const val version = "2.39.1"
    
    const val hiltAndroid = "$group:hilt-android:$version"
    const val hiltCompiler = "$group:hilt-android-compiler:$version"
}

object Retrofit2 {
    private const val version = "2.9.0"
    private const val group = "com.squareup.retrofit2"

    const val retrofit = "$group:retrofit:$version"
    const val retrofitGson = "$group:converter-gson:$version"
}

object OkHttp3 {
    private const val version = "4.9.2"
    private const val group = "com.squareup.okhttp3"

    const val okHttp3 = "$group:okhttp:$version"
    const val loggingInterceptor = "$group:logging-interceptor:$version"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:4.11.0"
}

object Gson {
    const val gson = "com.google.code.gson:gson:2.8.6"
}

object Test {
    const val junit = "junit:junit:4.13"
    const val extJunit = "androidx.test.ext:junit:1.1.2"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
}