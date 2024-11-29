pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidDemo"

val localProperties = java.util.Properties().apply {
    print("1111111")
    file("local.properties").takeIf { it.exists() }?.let {
        load(java.io.FileInputStream(it))
    }
}

if (localProperties.contains("include.build.dir")) {
    print("2222222")
    val includeBuildDir = localProperties["include.build.dir"].toString()
    if (includeBuildDir.isNotBlank()) {
        print("333333")
        includeBuildDir.split(",").forEach {
            print("444444")
            if (it.isNotBlank()) {
                includeBuild(it)
                print("includeBuild $it")
            }
        }
    }
}
include(":app")
include(":moduleA", ":moduleB")

project(":moduleA").projectDir = file("../dependences/moduleA")
project(":moduleB").projectDir = file("../dependences/moduleB")