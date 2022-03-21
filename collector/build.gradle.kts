/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java11-conventions")
    id("pinpoint.plugins-assembly-conventions")
}

dependencies {
    api(project(":pinpoint-commons"))
    api(project(":pinpoint-commons-buffer"))
    api(project(":pinpoint-commons-profiler"))
    api(project(":pinpoint-commons-server"))
    api(project(":pinpoint-commons-server-cluster"))
    api(project(":pinpoint-commons-hbase"))
    api(project(":pinpoint-rpc"))
    api(project(":pinpoint-thrift"))
    api(project(":pinpoint-grpc"))
    implementation("org.apache.zookeeper:zookeeper:3.4.14")
    api(project(":pinpoint-profiler"))
    implementation("com.google.guava:guava:30.1-jre")
    implementation("io.netty:netty:${Versions.netty3}")
    implementation("org.apache.commons:commons-lang3:3.8.1")
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("org.apache.thrift:libthrift:0.15.0")
    implementation("com.fasterxml.jackson.core:jackson-core:2.12.5")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.12.5")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.5")
    implementation("org.slf4j:slf4j-api:1.7.30")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.17.1")
    implementation("org.springframework:spring-core:5.3.13")
    implementation("org.springframework:spring-context:5.3.13")
    implementation("org.springframework:spring-orm:5.3.13")
    implementation("org.springframework:spring-web:5.3.13")
    implementation("org.springframework:spring-webmvc:5.3.13")
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.7")
    implementation("org.springframework.boot:spring-boot-starter-log4j2:2.5.7")
    implementation("io.dropwizard.metrics:metrics-core:3.2.6")
    implementation("io.dropwizard.metrics:metrics-jvm:3.2.6")
    implementation("io.dropwizard.metrics:metrics-servlets:3.2.6")
    runtimeOnly("commons-lang:commons-lang:2.6")
    runtimeOnly("org.apache.logging.log4j:log4j-jcl:2.17.1")
    runtimeOnly("org.apache.logging.log4j:log4j-core:2.17.1")
    testImplementation("org.springframework:spring-test:5.3.13")
    testImplementation("org.springframework.boot:spring-boot-test:2.5.7")
    testImplementation("org.awaitility:awaitility:3.1.5")
    testImplementation(project(":pinpoint-rpc"))
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
}

description = "pinpoint-collector"
