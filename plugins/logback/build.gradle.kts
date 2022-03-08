/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    compileOnly(project(":pinpoint-bootstrap-core"))
    compileOnly("org.slf4j:slf4j-api:1.7.30")
    compileOnly("ch.qos.logback:logback-core:1.2.5")
}

description = "pinpoint-logback-plugin"