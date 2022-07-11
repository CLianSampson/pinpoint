plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    compileOnlyApi(project(":pinpoint-bootstrap-core"))
    compileOnlyApi("org.apache.hbase:hbase-shaded-client:1.2.12")
    compileOnly(libs.commons.logging)
}

description = "pinpoint-hbase-plugin"
