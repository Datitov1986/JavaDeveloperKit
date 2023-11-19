plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("com.google.collections:google-collections:1.0")
    implementation("org.apache.commons:commons-lang3:3.9")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}