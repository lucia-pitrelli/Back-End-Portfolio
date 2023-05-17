/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;


import com.portfolio.Ap.models.AboutMe;
import com.portfolio.Ap.service.IAboutMeService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/abouts")

public class AboutMeController {
    
    @Autowired
    private IAboutMeService aboServ;
   
    /*list*/
    @GetMapping("/list")
    @ResponseBody
    public List<AboutMe> getAbouts(){
        return aboServ.getAbouts();
    }    
    
    /*get one*/
    @GetMapping("/id/{id}")
    public AboutMe getAbout(@PathVariable Long id){
        return aboServ.getAboutMeById(id);
    }
     
    /*update*/
     @PutMapping("/update")
     public ResponseEntity<List<AboutMe>> editAboutMe(@RequestBody AboutMe abo){
         aboServ.editAboutMe(abo);
         return new ResponseEntity(HttpStatus.OK);
    }
}
