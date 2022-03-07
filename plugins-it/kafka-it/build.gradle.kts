/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    implementation(project(":pinpoint-plugin-it-utils"))
    testImplementation(project(":pinpoint-kafka-plugin"))
    testImplementation("org.apache.kafka:kafka-clients:0.11.0.1")
    testImplementation("log4j:log4j:1.2.17")
    testImplementation("org.apache.kafka:kafka_2.12:2.6.0")
    testImplementation("commons-io:commons-io:2.6")
}

description = "pinpoint-kafka-plugin-it"
