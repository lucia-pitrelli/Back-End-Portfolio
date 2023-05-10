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
@RequestMapping("/api/educations")
public class EducationController {
    
     @GetMapping
    public String getEducations(){
        return "Petition Get a list of Educations";
    }    
    
    @GetMapping("/{id}")
    public String getEducation(@PathVariable Long id){
        return "Petition Get an Education number:" + id;
    }
    
    @PostMapping
    public String postEducation(@RequestBody String body){
        return "Petition Post:" + body;
    }  
    
    @PutMapping("/{id}")
        public String changeEducation(@PathVariable Long id){
        return "Petition Put an Education number:" + id;
    }
    
    @DeleteMapping("/{id}")
    public String deleteEducation(@PathVariable Long id){
        return "Do you want to delete an Education number:" + id;
    }
}
