package com.example.projectmanagementapp.services;

import com.example.projectmanagementapp.domain.Project;
import com.example.projectmanagementapp.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Method: Save Projects
    public Project saveOrUpdateProj(Project project) {
        // Method logic
        return projectRepository.save(project);
    }
}
