import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0-Beta"
    id("org.jetbrains.intellij") version "1.14.0"
}

intellij {
    // See https://jb.gg/android-studio-releases-list.xml
    version.set("2022.3.1.18") // Giraffe
    type.set("AI")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}