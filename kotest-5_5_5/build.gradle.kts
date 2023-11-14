plugins {
    id("org.gradle.test-retry") version "1.5.6"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("io.kotest:kotest-bom:5.5.5"))
    testImplementation("io.kotest:kotest-runner-junit5")
    testImplementation("io.kotest:kotest-assertions-core")
    testImplementation("io.kotest:kotest-assertions-json")
}

tasks {
    test {
        useJUnitPlatform()
        retry {
            failOnPassedAfterRetry.set(false)
            maxRetries.set(1)
        }
    }
}
