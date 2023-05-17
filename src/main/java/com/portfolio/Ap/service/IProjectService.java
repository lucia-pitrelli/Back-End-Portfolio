/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.Project;
import java.util.List;

public interface IProjectService {
   
    /* get list */
    public List<Project> getProjects();
    
    /*get one */
    public Project getProjectById(Long id);
        
    /*update */
    public void editProject(Project pro);
     
    /*create */
    public void createProject(Project pro);
    
    /*delete */
    public void deleteProject(Long id);
    
}
