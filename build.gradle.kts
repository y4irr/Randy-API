import org.jetbrains.kotlin.resolve.calls.tower.getResultApplicability

plugins {
    kotlin("jvm") version "1.8.22"
    application
}

group = "dev.y4irr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("org.slf4j:slf4j-simple:2.0.12")

    // REST API
    implementation("com.sparkjava:spark-core:2.9.4")

    // GSON
    implementation("com.google.code.gson:gson:2.10.1")

    // RETROFIT & OKHTTP
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")


}

sourceSets {
    main {
        kotlin {
            srcDir("src/main/kotlin")
        }
    }
}

application {
    mainClass.set("dev.y4irr.RandyAPI")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "dev.y4irr.RandyAPI"
        )
    }
}


kotlin {
    jvmToolchain(17)
}

