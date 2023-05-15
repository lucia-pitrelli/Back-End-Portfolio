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
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/abouts")

public class AboutMeController {
   
    /*tengo una sola id*/
    @GetMapping
    public String getAbouts(){
        return "Petition Get a list of Abouts";
    }    
    
    @GetMapping("/{id}")
    public String getAbout(@PathVariable Long id){
        return "Petition Get an About Me number:" + id;
    }
     
    
    @PutMapping("/{id}")
        public String changeAbout(@PathVariable Long id){
        return "Petition Put an About me number:" + id;
    }
}
