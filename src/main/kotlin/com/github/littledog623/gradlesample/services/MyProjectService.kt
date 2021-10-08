package com.github.littledog623.gradlesample.services

import com.intellij.openapi.project.Project
import com.github.littledog623.gradlesample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
