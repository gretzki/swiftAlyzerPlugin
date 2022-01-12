package com.github.gretzki.swiftalyzerplugin.services

import com.intellij.openapi.project.Project
import com.github.gretzki.swiftalyzerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
