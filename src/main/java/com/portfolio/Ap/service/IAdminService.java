/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.Admin;

import java.util.List;


public interface IAdminService {
    
    /* get a list*/
    public List<Admin> getAdmins();
    
    /*get one*/
    public Admin getAdminById(Long id);
        
    
}
