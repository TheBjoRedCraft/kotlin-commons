pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")


rootProject.name = "kotlin-commons"
include("kcoms-plugin")
include("kcoms-api:kcoms-api-common")
include("kcoms-api:kcoms-api-paper")
include("kcoms-api:kcoms-api-minestom")
include("kcoms-api:kcoms-api-velocity")