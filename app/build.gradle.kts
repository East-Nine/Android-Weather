plugins {
    androidApp()
    kotlinAndroid()
    kotlinParcelize()
    kotlinKapt()
    daggerHilt()
}

android {
    setAndroidExtention(rootProject.rootDir.absolutePath)

    defaultConfig {
        applicationId = "com.eastnine.weather"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(project(":domain"))
    implementation(project(":data"))

    kotlin()
    androidX()
    activity()
    fragment()
    view()
    lifeCycle()
    hilt()
    retrofit2()
    okHttp3()
    glide()
    gson()

    test()
}