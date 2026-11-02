plugins {
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.24" apply false
    `java-library`
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://repo.wyck.dev/snapshots/")
        maven("https://repo.papermc.io/repository/maven-public/")
    }

    version = findProperty("version") as String
    group = "dev.thebjoredcraft.kcoms"

    configurations.all {
        if (name == "compileOnly") {
            return@all
        }

        dependencies.remove(project.dependencies.gradleApi())
        dependencies.remove(project.dependencies.gradleTestKit())
    }
}