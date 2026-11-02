subprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")


    extensions.configure<PublishingExtension> {
        publications {
            create<MavenPublication>("maven") {
                artifactId = project.name
                version = project.version.toString()
                from(components["java"])
            }
        }
    }
}