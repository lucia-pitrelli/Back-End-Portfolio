/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/presentation")
public class PresentationController {
    
        /*tengo una sola id*/
     @GetMapping
       public String getPresentations(){
        return "Petition Get a list of presentation";
    }    
    
    @GetMapping("/{id}")
    public String getPresentation(@PathVariable Long id){
        return "Petition Get a presentation number:" + id;
    }
     
    
    @PutMapping("/{id}")
        public String changePresentation(@PathVariable Long id){
        return "Petition Put a Presentation number:" + id;
    }
}
