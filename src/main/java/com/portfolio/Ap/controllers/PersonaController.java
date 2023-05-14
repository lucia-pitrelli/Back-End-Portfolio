/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;


import com.portfolio.Ap.models.Persona;
import com.portfolio.Ap.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping("/api/personas")
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;

  /*List of persona users*/
    @GetMapping
    public List<Persona> getPersonas(){
        return persoServ.getPersonas();
    }    
    
    /*one persona user*/
    @GetMapping("/{id}")
    public String getPersona(@PathVariable Long id){
        return "Petition Get a Persona number:" + id;
    }
    
    /*update persona*/
    @PutMapping
    public ResponseEntity<List<Persona>> editPersona(@RequestBody Persona per){
        persoServ.editPersona(per);
         return new ResponseEntity(HttpStatus.OK);
    }
     
}
