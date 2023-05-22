/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;

import com.portfolio.Ap.models.HardSkill;
import com.portfolio.Ap.service.IHardSkillService;
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
@RequestMapping("/hardskills")
public class HardSkillController {
    
    @Autowired
    private IHardSkillService harServ;

    /*list*/
    @GetMapping("/list")
    @ResponseBody
    public List<HardSkill> getHardSkills(){
        return harServ.getHardSkills();
    }    
    
    /*get one*/
    @GetMapping("/id/{id}")
    public HardSkill getHardSkillById(@PathVariable Long id){
        return harServ.getHardSkillById(id);
    }
    
    /*create*/
    @PostMapping("/create")
    public void createHardSkill(@RequestBody HardSkill har){
        harServ.createHardSkill(har);
    }  
    
    /*update*/
    @PutMapping("/update")
    public ResponseEntity<List<HardSkill>> editHardSkill(@RequestBody HardSkill har){
        harServ.editHardSkill(har);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    /*delete*/
    @DeleteMapping("/delete/{id}")
    public void deleteHardSkill(@PathVariable Long id){
        harServ.deleteHardSkill(id);
    }
}
