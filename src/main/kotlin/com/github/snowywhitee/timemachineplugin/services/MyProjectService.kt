package com.github.snowywhitee.timemachineplugin.services

import com.github.snowywhitee.timemachineplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
