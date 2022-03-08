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
    testImplementation("org.elasticsearch.client:elasticsearch-rest-high-level-client:7.3.0")
    testImplementation("pl.allegro.tech:embedded-elasticsearch:2.10.0")
    testImplementation(project(":pinpoint-elasticsearch-plugin"))
}

description = "pinpoint-elasticsearch-plugin-it"