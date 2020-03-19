plugins {
    id("org.jetbrains.kotlin.multiplatform") version ("1.3.70")
    id("com.epam.drill.cross-compilation") version "0.16.0"
    `maven-publish`
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}
kotlin {

    targets {
        crossCompilation({ })
        mingwX64()
        linuxX64()
        macosX64()
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