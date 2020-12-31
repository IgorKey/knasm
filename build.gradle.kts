plugins {
    id("org.jetbrains.kotlin.multiplatform")
    `maven-publish`
}

val scriptUrl: String by extra

apply(from = "$scriptUrl/git-version.gradle.kts")


repositories {
    mavenLocal()
    apply(from = "$scriptUrl/maven-repo.gradle.kts")
    jcenter()
}

kotlin {
    mingwX64()
    linuxX64()
    macosX64()

    sourceSets {
        val linuxX64Main by getting
        val macosX64Main by getting
        val mingwX64Main by getting
        val commonNative by creating {
            linuxX64Main.dependsOn(this)
            macosX64Main.dependsOn(this)
            mingwX64Main.dependsOn(this)
        }
        val linuxX64Test by getting
        val macosX64Test by getting
        val mingwX64Test by getting
        val commonNativeTest by creating {
            dependsOn(commonNative)
            linuxX64Test.dependsOn(this)
            macosX64Test.dependsOn(this)
            mingwX64Test.dependsOn(this)
        }
        logger.debug("common sourceSet $commonNative created")
        logger.debug("common test sourceSet $commonNativeTest created")
    }
}
publishing {
    repositories {
        maven {
            url = uri("https://oss.jfrog.org/oss-release-local")
            credentials {
                username =
                    if (project.hasProperty("bintrayUser"))
                        project.property("bintrayUser").toString()
                    else System.getenv("BINTRAY_USER")
                password =
                    if (project.hasProperty("bintrayApiKey"))
                        project.property("bintrayApiKey").toString()
                    else System.getenv("BINTRAY_API_KEY")
            }
        }
    }
}
