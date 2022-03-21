/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java7-conventions")
}

dependencies {
    api(project(":pinpoint-commons"))
    api(project(":pinpoint-annotations"))
    api(project(":pinpoint-bootstrap-core"))
    testImplementation("org.apache.logging.log4j:log4j-api:2.12.4")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.4")
    testImplementation("org.apache.logging.log4j:log4j-core:2.12.4")
    testImplementation("commons-io:commons-io:2.6")
}

description = "pinpoint-bootstrap"
