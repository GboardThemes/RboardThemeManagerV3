@file:Suppress("UNUSED_VARIABLE")

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.0-alpha05")
        //noinspection DifferentKotlinGradleVersion
        classpath(kotlin("gradle-plugin", version = "1.7.0"))
        classpath("com.google.gms:google-services:4.3.10")
        //classpath("com.google.protobuf:protobuf-gradle-plugin:0.8.10")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven ("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}