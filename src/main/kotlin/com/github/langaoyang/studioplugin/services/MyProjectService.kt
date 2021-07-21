package com.github.langaoyang.studioplugin.services

import com.github.langaoyang.studioplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
