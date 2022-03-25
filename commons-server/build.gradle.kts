/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java11-conventions")
    id("pinpoint.grpc-conventions")
    id("pinpoint.hbase-conventions")
}

dependencies {
    api(project(":pinpoint-commons"))
    api(project(":pinpoint-commons-profiler"))
    api(project(":pinpoint-commons-hbase"))
    api(project(":pinpoint-plugins-loader"))
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("org.springframework:spring-core:${Versions.spring}")
    implementation("org.springframework:spring-context:${Versions.spring}")
    implementation("org.springframework.boot:spring-boot:${Versions.springBoot}")
    implementation("org.apache.commons:commons-lang3:3.8.1")
    implementation("org.apache.thrift:libthrift:0.12.0")
    implementation("org.apache.logging.log4j:log4j-api:${Versions.log4jJDK7}")
    runtimeOnly("org.slf4j:slf4j-api:1.7.30")
    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:${Versions.log4jJDK8}")
    runtimeOnly("org.apache.logging.log4j:log4j-core:${Versions.log4jJDK8}")
    runtimeOnly("org.apache.logging.log4j:log4j-jcl:${Versions.log4jJDK8}")
    testImplementation("org.awaitility:awaitility:3.1.5")
    testImplementation("org.springframework:spring-test:${Versions.spring}")
    compileOnlyApi(project(":pinpoint-thrift"))
    compileOnlyApi(project(":pinpoint-grpc"))
}

description = "pinpoint-commons-server"
