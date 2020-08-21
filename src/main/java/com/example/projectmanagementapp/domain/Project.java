package com.example.projectmanagementapp.domain;

import org.springframework.data.annotation.Id;
import java.util.*;
import javax.persistence.*;

// Defines as entity object to create a table with attributes
@Entity
public class Project {

    // ID Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Project attributes
    private Long id;
    private String projectName;
    // Adds custom identifiers, name "project_id" already used by JPA
    private String projectIdentifier;
    private String projectDescription;

    private Date startDate;
    private Date endDate;
    private Date createdAt;
    private Date updatedAt;

    public Project() {

    }

    // GETTERS
    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist
    protected void onCreate() {
        // Current date
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate() {
        // Current date
        this.updatedAt = new Date();
    }

}