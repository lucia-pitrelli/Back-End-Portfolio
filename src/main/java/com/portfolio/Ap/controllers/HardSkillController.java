/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hardskills")
public class HardSkillController {
    
    @CrossOrigin(origins = "http://localhost:4200")

    
    @GetMapping
    public String getHardSkills(){
        return "Petition Get a list of Hard Skills";
    }    
    
    @GetMapping("/{id}")
    public String getHardSkill(@PathVariable Long id){
        return "Petition Get a Hard Skill number:" + id;
    }
    
    @PostMapping
    public String postHardSkill(@RequestBody String body){
        return "Petition Post:" + body;
    }  
    
    @PutMapping("/{id}")
        public String changeHardSkill(@PathVariable Long id){
        return "Petition Put a Hard Skill number:" + id;
    }
    
    @DeleteMapping("/{id}")
    public String deleteHardSkill(@PathVariable Long id){
        return "Do you want to delete a Hard Skills number:" + id;
    }
}
