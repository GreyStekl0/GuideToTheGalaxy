plugins {
    kotlin("jvm") version "2.1.0"
}

group = "org.stekl0"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.fleeksoft.ksoup:ksoup:0.2.2")
    implementation("com.fleeksoft.ksoup:ksoup-network:0.2.2")
    implementation("org.slf4j:slf4j-simple:2.0.16")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}
