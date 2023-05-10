/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    
    @GetMapping
    public String getListProjects(){
        return "Peticion Get the Projects";
    }    
    
    @GetMapping("/{id}")
    public String getProject(@PathVariable Long id){
        return "Peticion Get a Project number:" + id;
    }
    
    @PostMapping
    public String postProjects(@RequestBody String body){
        return "Peticion Post:" + body;
    }  
    
    @PutMapping("/{id}")
        public String changeProject(@PathVariable Long id){
        return "Peticion Put a Project number:" + id;
    }
    
    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable Long id){
        return "Do you want to delete a Project number:" + id;
    }
}
