import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.kotlin() {
    implementation(Kotlin.kotlinStdlibJdk8)
    implementation(Kotlin.Coroutine.android)
    implementation(Kotlin.Coroutine.core)
}

fun DependencyHandlerScope.androidX() {
    implementation(AndroidX.appcompat)
    implementation(AndroidX.core)
}

fun DependencyHandlerScope.activity() {
    implementation(AndroidX.Activity.activityKtx)
}

fun DependencyHandlerScope.fragment() {
    implementation(AndroidX.Fragment.fragmentKtx)
}

fun DependencyHandlerScope.view() {
    implementation(AndroidX.View.constraintLayout)
    implementation(AndroidX.View.recyclerview)
    implementation(AndroidX.View.material)
}

fun DependencyHandlerScope.lifeCycle() {
    implementation(AndroidX.Lifecycle.viewModelKtx)
    implementation(AndroidX.Lifecycle.liveDataKtx)
    implementation(AndroidX.Lifecycle.lifeCycleExtension)
    implementation(AndroidX.Lifecycle.LifecycleScope)
}

fun DependencyHandlerScope.hilt() {
    implementation(Hilt.hiltAndroid)
    kapt(Hilt.hiltCompiler)
}


fun DependencyHandlerScope.retrofit2() {
    implementation(Retrofit2.retrofit)
    implementation(Retrofit2.retrofitGson)
}

fun DependencyHandlerScope.okHttp3() {
    implementation(OkHttp3.okHttp3)
    implementation(OkHttp3.loggingInterceptor)
}

fun DependencyHandlerScope.glide() {
    implementation(Glide.glide)
}

fun DependencyHandlerScope.gson() {
    implementation(Gson.gson)
}

fun DependencyHandlerScope.test() {
    testImplementation(Test.junit)
    androidTestImplementation(Test.extJunit)
    androidTestImplementation(Test.espresso)
}

private fun DependencyHandler.implementation(depName: String) =
    add("implementation", depName)

private fun DependencyHandler.kapt(depName: String) =
    add("kapt", depName)

private fun DependencyHandler.testImplementation(depName: String) =
    add("testImplementation", depName)

private fun DependencyHandler.androidTestImplementation(depName: String) =
    add("androidTestImplementation", depName)