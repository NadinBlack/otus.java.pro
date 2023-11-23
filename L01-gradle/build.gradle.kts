import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id ("com.github.johnrengelman.shadow")
}

dependencies {
    implementation ("com.google.guava:guava")
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("L01-gradle")
        archiveVersion.set("1.0-SNAPSHOT")
        archiveClassifier.set("")
        manifest {
            attributes(mapOf("Main-Class" to "otus.java.pro.HelloOtus"))
        }
    }

    build {
        dependsOn(shadowJar)
    }
}