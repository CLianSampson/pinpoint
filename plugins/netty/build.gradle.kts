/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java8-toolchain")
}

dependencies {
    compileOnly(project(":pinpoint-bootstrap-core"))
    compileOnly("io.netty:netty-all")
}

description = "pinpoint-netty-plugin"

tasks.withType<JavaCompile>().configureEach {
    sourceCompatibility = "1.7"
    targetCompatibility = "1.7"
}