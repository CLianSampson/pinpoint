/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java7-toolchain")
}

dependencies {
    api(project(":pinpoint-plugin-it-utils"))
    testImplementation("net.sf.json-lib:json-lib:2.3:jdk15")
}

description = "pinpoint-json-lib-plugin-it"
