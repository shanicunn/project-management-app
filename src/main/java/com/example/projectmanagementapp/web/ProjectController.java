package com.example.projectmanagementapp.web;

import com.example.projectmanagementapp.domain.Project;
import com.example.projectmanagementapp.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// API Creation
@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    // Route to create a new project
    @PostMapping("")
    // Method: Create new project
    public ResponseEntity<Project> createNewProject(@RequestBody Project project) {

        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }

}