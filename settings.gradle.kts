pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = ("batterychargingtracker")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    "app",
)
