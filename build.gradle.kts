import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id("com.android.application") apply false
    id("com.google.devtools.ksp") version "2.1.20-2.0.1" apply false
    id("com.android.library") apply false
    kotlin("android") apply false
    alias(libs.plugins.compose.compiler) apply false
    // alias(libs.plugins.detekt)
    alias(libs.plugins.versions)
    base
}

allprojects {
    group = PUBLISHING_GROUP
}

// val detektFormatting = libs.detekt.formatting

subprojects {
    // apply {
    //     plugin("io.gitlab.arturbosch.detekt")
    // }

    // detekt {
    //     config.from(rootProject.files("config/detekt/detekt.yml"))
    // }

    // dependencies {
    //     detektPlugins(detektFormatting)
    // }
}

tasks {
    withType<DependencyUpdatesTask>().configureEach {
        rejectVersionIf {
            candidate.version.isStableVersion().not()
        }
    }
}
