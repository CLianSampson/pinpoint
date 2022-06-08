/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    implementation(libs.spring.boot.starter.web)
    implementation(libs.spring.boot.starter.logging)
    implementation(libs.spring.boot.starter.actuator)
    implementation("org.springdoc:springdoc-openapi-ui:1.4.4")
    implementation("org.apache.dubbo:dubbo:2.7.7")
    implementation("org.apache.dubbo:dubbo-dependencies-zookeeper:2.7.7")
    compileOnly(libs.spring.boot.starter.tomcat)
}

description = "pinpoint-dubbo-plugin-testweb"
