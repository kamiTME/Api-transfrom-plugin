package com.github.kamitme.apitransfromplugin.services

import com.intellij.openapi.project.Project
import com.github.kamitme.apitransfromplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
