/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.controllers;


import com.portfolio.Ap.models.Admin;

import com.portfolio.Ap.service.IAdminService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admins")
public class AdminController {
    
    @Autowired
    private IAdminService admServ;
    
    /*list*/
    @GetMapping("/list")
    @ResponseBody
    public List<Admin> getAdmins(){
        return admServ.getAdmins();
    }    
    
    /*one admn*/
    @GetMapping("/id/{id}")
    public Admin getAdmin(@PathVariable Long id){
        return admServ.getAdminById(id);
    }
    
}
