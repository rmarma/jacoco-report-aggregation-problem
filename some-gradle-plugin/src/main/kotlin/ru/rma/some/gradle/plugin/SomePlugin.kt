package ru.rma.some.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SomePlugin : Plugin<Project> {

    override fun apply(target: Project) {}
}
