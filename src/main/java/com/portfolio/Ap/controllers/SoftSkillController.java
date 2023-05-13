/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/softskills")
public class SoftSkillController {
    
    @CrossOrigin(origins = "http://localhost:4200")

    
    /*tengo una sola id*/
    @GetMapping
    public String getSoftSkills(){
        return "Petition Get a list of Soft Skills";
    }    
    
    @GetMapping("/{id}")
    public String getSoftSkill(@PathVariable Long id){
        return "Petition Get a Soft Skill number:" + id;
    }
     
    
    @PutMapping("/{id}")
    public String changeSoftSkill(@PathVariable Long id){
        return "Petition Put a Soft Skills number:" + id;
    }
    
}
