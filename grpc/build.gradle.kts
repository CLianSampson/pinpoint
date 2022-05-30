import com.google.protobuf.gradle.*

plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java7")
    id("com.navercorp.pinpoint.gradle.plugins.bom.grpc")
    id("com.google.protobuf") version Versions.protobufPlugin
}

dependencies {
    api(project(":pinpoint-commons"))
    api(project(":pinpoint-bootstrap-core"))
    api(project(":pinpoint-commons-profiler"))
    implementation(libs.log4j.slf4j.impl.jdk7)
    implementation(libs.log4j.core.jdk7)
    implementation(libs.commons.lang3)
    runtimeOnly("io.netty:netty-tcnative-boringssl-static:2.0.38.Final")
    runtimeOnly(libs.slf4j.api)
    testImplementation("io.grpc:grpc-testing:${Versions.grpc}")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}

sourceSets {
    main {
        proto {
            srcDir("grpc-idl/proto")
        }
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${Versions.protoc}"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:${Versions.grpc}"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                // Apply the "grpc" plugin whose spec is defined above, without options.
                id("grpc")
            }
        }
    }
}

description = "pinpoint-grpc"
