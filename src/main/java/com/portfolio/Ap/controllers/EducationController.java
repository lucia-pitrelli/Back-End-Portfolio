/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;


import com.portfolio.Ap.models.Education;
import com.portfolio.Ap.service.IEducationService;

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
@RequestMapping("/educations")
public class EducationController {
    
@Autowired
private IEducationService eduServ;

/*get a list of educations*/
    @GetMapping("/list")
    @ResponseBody
    public List<Education> getEducations(){
        return eduServ.getEducations();
    }    
    
    /*get an education*/
    @GetMapping("/id/{id}")
    public Education getEducationById(@PathVariable Long id){
        return eduServ.getEducationById(id);
    }
    
    /*update an education*/
     @PutMapping("/update")
     public ResponseEntity<List<Education>> editEducation(@RequestBody Education edu){
         eduServ.editEducation(edu);
         return new ResponseEntity(HttpStatus.OK);
    }

   /*create a new education*/             
    @PostMapping("/create")
    public void createEducation(@RequestBody Education edu){
        eduServ.createEducation(edu);
      
    }  
       
    /*delete one education*/
    @DeleteMapping("/delete/{id}")
    public void deleteEducation(@PathVariable Long id){
        eduServ.deleteEducation(id);
      
    }
}
