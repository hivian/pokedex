object Plugins {
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlin = "kotlin"
    const val kotlinAndroid = "android"
    const val kotlinExtensions = "android.extensions"
    const val kapt = "kapt"
    const val detekt = "io.gitlab.arturbosch.detekt"
    const val crashlytics = "io.fabric"
    // Dsl
    const val androidLibraryCommon = "commons.android-library"
    const val kotlinLibraryCommon = "commons.kotlin-library"
    const val featureLibraryCommon = "commons.feature-library"
}

object ApplicationId {
    val id = "com.hivian.pokedex"
}

object Modules {
    val app = ":app"

    val navigation = ":navigation"

    val common = ":common"
    val commonTest = ":common_test"

    val local = ":data:local"
    val remote = ":data:remote"
    val model = ":data:model"
    val repository = ":data:repository"

    val featureHome = ":features:home"
    val featureDetail = ":features:detail"
}

object Versions {
    val kotlin = "1.3.71"
    val gradle = "3.6.2"
    val detekt = "1.6.0"
    val anko = "0.10.8"
    val appCompat = "1.1.0"
    val fragment= "1.3.0-alpha05"
    val coreKtx = "1.2.0"
    val swipeRefreshLayout = "1.0.0"
    val paging = "2.1.2"
    val constraintLayout = "1.1.3"
    val junit = "4.12"
    val androidTestRunner = "1.2.0"
    val espressoCore = "3.2.0"
    val retrofit = "2.8.1"
    val retrofitCoroutines = "0.9.2"
    val retrofitGson = "2.6.0"
    val gson = "2.8.6"
    val okHttp = "4.4.1"
    val coroutines = "1.3.5"
    val material = "1.2.0-alpha05"
    val koin = "2.1.5"
    val timberKt = "1.5.1"
    val lifecycle = "2.2.0"
    val nav = "2.2.1"
    val room = "2.2.5"
    val recyclerview = "1.1.0"
    val preferences = "1.1.0"
    val safeArgs = "2.1.0-alpha01"
    val glide = "4.11.0"
    val mockwebserver = "4.4.0"
    val archCoreTest = "2.1.0"
    val androidJunit = "1.1.1"
    val mockk = "1.10.0"
    val fragmentTest = "1.2.4"
    val databinding = "3.3.2"
    val roboelectric = "4.3.1"
    val mockitoKotlin = "2.2.0"
}

object Libraries {

    // KOIN
    val koin = "org.koin:koin-android:${Versions.koin}"
    val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"

    // ROOM
    val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    val roomRunTime = "androidx.room:room-runtime:${Versions.room}"
    val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    // RETROFIT
    val retrofitCoroutineAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
    val retrofitMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofitGson}"
    val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    // GLIDE
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    // TIMBER
    val timberKt = "com.github.ajalt:timberkt:${Versions.timberKt}"
}

object KotlinLibraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val kotlinCoroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    val anko = "org.jetbrains.anko:anko:${Versions.anko}"
}

object AndroidLibraries {

    // KOTLIN
    val kotlinCoroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // ANDROID
    val material = "com.google.android.material:material:${Versions.material}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"
    val paging = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    val preferences = "androidx.preference:preference-ktx:${Versions.preferences}"
}

object TestLibraries {

    // ANDROID TEST
    val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
    val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCoreTest}"
    val junit = "androidx.test.ext:junit:${Versions.androidJunit}"
    val fragmentNav = "androidx.fragment:fragment-testing:${Versions.fragmentTest}"
    val roboelectric = "org.robolectric:robolectric:${Versions.roboelectric}"
    val room = "androidx.room:room-testing:${Versions.room}"
    val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"

    // KOIN
    val koin = "org.koin:koin-test:${Versions.koin}"

    // MOCK WEBSERVER
    val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockwebserver}"

    // MOCK
    val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
    val mockk = "io.mockk:mockk:${Versions.mockk}"

    // COROUTINES
    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"

    // DATA BINDING
    val databinding = "androidx.databinding:databinding-compiler:${Versions.databinding}"
}