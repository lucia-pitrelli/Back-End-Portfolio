/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;


import com.portfolio.Ap.models.Project;
import com.portfolio.Ap.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = {"https://portfolio-front-pitrelli.web.app"})
@RequestMapping("/projects")
public class ProjectController {
    
@Autowired
private IProjectService proServ;
    
    /*list*/
    @GetMapping("/list")
    @ResponseBody
    public List<Project> getProjects(){
        return proServ.getProjects();
    }    
    
    /*get one*/
    @GetMapping("/id/{id}")
    public Project getProjectById(@PathVariable Long id){
        return proServ.getProjectById(id);
    }
    
    /*create*/
    @PostMapping("/create")
    public void createProject(@RequestBody Project pro){
        proServ.createProject(pro);
    }  
    
    /*update*/
    @PutMapping("/update")
        public ResponseEntity<List<Project>> editProject(@RequestBody Project pro){
         proServ.editProject(pro);
          return new ResponseEntity(HttpStatus.OK);
    }
    
    /*delete*/
    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable Long id){
        proServ.deleteProject(id);
    }
}
