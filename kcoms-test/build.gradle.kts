plugins {
    kotlin("jvm") version "2.4.20"
}

group = "dev.thebjoredcraft.kcoms"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.thebjoredcraft:kotlin-commons:1.0.1")
}