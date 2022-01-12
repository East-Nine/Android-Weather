plugins {
    androidLibrary()
    kotlinAndroid()
    kotlinParcelize()
    kotlinKapt()
    daggerHilt()
}

android {
    setAndroidExtention(rootProject.rootDir.absolutePath)

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    kotlin()
    hilt()
    retrofit2()
    okHttp3()
    gson()

    test()
}