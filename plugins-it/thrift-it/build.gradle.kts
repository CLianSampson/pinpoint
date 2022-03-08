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
    testImplementation("org.apache.thrift:libthrift:0.12.0")
    testImplementation("org.eclipse.jetty:jetty-server:9.2.11.v20150529")
}

description = "pinpoint-thrift-plugin-it"