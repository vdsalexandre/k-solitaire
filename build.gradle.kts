import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val assertkVersion: String = "0.25"

plugins {
    kotlin("jvm") version "1.8.10"
}

group = "vds.org"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:$assertkVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}