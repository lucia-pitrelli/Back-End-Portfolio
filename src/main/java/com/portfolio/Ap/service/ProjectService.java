/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.Project;
import com.portfolio.Ap.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService{

    @Autowired
    public ProjectRepository proRepo;
        
        
    @Override
    public List<Project> getProjects() {
     return proRepo.findAll();
    }

    @Override
    public Project getProjectById(Long id) {
       return proRepo.findById(id).orElse(null);
    }

    @Override
    public void editProject(Project pro) {
       proRepo.save(pro);
    }

    @Override
    public void createProject(Project pro) {
         proRepo.save(pro);
    }

    @Override
    public void deleteProject(Long id) {
        proRepo.deleteById(id);
    }
    
}
