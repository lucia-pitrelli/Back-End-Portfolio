/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;


import com.portfolio.Ap.models.Education;
import com.portfolio.Ap.service.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    
@Autowired
private IEducationService eduServ;

    @GetMapping
    public List<Education> getEducations(){
        return eduServ.getEducations();
    }    
    
    @GetMapping("/{id}")
    public String getEducation(@PathVariable Long id){
        return "Petition Get an Education number:" + id;
    }
    
    
        @PutMapping("/{id}")
        public String changeEducation(@PathVariable Long id){
        return "Petition Put an Education number:" + id;
    }
        
        
        
    
    @PostMapping
    public String postEducation(@RequestBody String body){
        return "Petition Post:" + body;
    }  
    

    
    @DeleteMapping("/{id}")
    public String deleteEducation(@PathVariable Long id){
        return "Do you want to delete an Education number:" + id;
    }
}
