/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/personas")
public class PersonaController {
  /*tengo una sola id*/
    @GetMapping
    public String getPersonas(){
        return "Petition Get a list of Personas";
    }    
    
    @GetMapping("/{id}")
    public String getPersona(@PathVariable Long id){
        return "Petition Get a Persona number:" + id;
    }
     
}
