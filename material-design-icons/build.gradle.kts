@file:Suppress("OPT_IN_USAGE")

import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.kotlinComposeCompiler)
    alias(libs.plugins.vanniktech.mavenPublish)
}

group = "org.nnstd.compose.icons"

val ghRef = System.getenv("GITHUB_REF")?.takeIf(String::isNotBlank)

logger.warn("GITHUB_REF: $ghRef")

version = ghRef
    ?.removePrefix("refs/tags/")
    ?.removePrefix("refs/heads/")
    ?.removeSuffix("-SNAPSHOT")
    ?.removePrefix("v")
    ?.takeIf(String::isNotBlank)
    ?: "1.0.0-SNAPSHOT"

logger.warn("Using version: $version")

val ghToken = System.getenv("GITHUB_TOKEN")?.takeIf(String::isNotBlank)
val ghActor = System.getenv("GITHUB_ACTOR")?.takeIf(String::isNotBlank)


if (ghToken == null) {
    logger.warn("GITHUB_TOKEN is not set, using local maven repository for publishing.")
} else {
    logger.warn("GITHUB_TOKEN is: ${ghToken.take(4)}${"*".repeat((ghToken.length - 4).coerceAtLeast(0))}")
}

if (ghActor == null) {
    logger.warn("GITHUB_ACTOR is not set, using anonymous credentials for publishing.")
} else {
    logger.warn("GITHUB_ACTOR is: $ghActor")
}

kotlin {
    jvm()

    androidTarget {
        publishLibraryVariants("release")
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    macosX64()
    wasmJs { browser() }
    js() { browser() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.ui)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }
}

android {
    namespace = "org.nnstd.compose.icons"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

publishing {
    repositories {
        maven {
            name = "githubPackages"
            url = uri("https://maven.pkg.github.com/nnstd/compose-icons")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

mavenPublishing {
    coordinates(group.toString(), "material-design-icons", version.toString())

    pom {
        name = "Material Design Icons for Compose"
        description = "Port of MDI icons for Compose Multiplatform, with support for Android, iOS, macOS, and Linux."
        inceptionYear = "2025"
        url = "https://pictogrammers.com/library/mdi/"
    }
}
