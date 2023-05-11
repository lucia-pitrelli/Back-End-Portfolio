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
@RequestMapping("/api/admins")
public class AdminController {
    /*tengo una sola id*/
    @GetMapping
    public String getAdmins(){
        return "Petition Get a list of Admins";
    }    
    
    @GetMapping("/{id}")
    public String getAdmin(@PathVariable Long id){
        return "Petition Get an Admin number:" + id;
    }
}
