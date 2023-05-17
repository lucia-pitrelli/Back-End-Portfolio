/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;


import com.portfolio.Ap.models.SoftSkill;
import com.portfolio.Ap.service.ISoftSkillService;

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
@RequestMapping("/softskills")
public class SoftSkillController {
    
@Autowired
private ISoftSkillService sofServ;

    /*list*/
    @GetMapping("/list")
    @ResponseBody
    public List<SoftSkill> getSoftSkills(){
        return sofServ.getSoftSkills();
    }    
    
    /*get one*/
    @GetMapping("/id/{id}")
    public SoftSkill getSoftSkillById(@PathVariable Long id){
        return sofServ.getSoftSkillById(id);
    }
     
    /*update*/
    @PutMapping("/update")
     public ResponseEntity<List<SoftSkill>> editSoftSkill(@RequestBody SoftSkill sof){
         sofServ.editSoftSkill(sof);
         return new ResponseEntity(HttpStatus.OK);
    }
    
}
