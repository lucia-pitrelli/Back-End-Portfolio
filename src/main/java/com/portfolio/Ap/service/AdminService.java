/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.Admin;

import com.portfolio.Ap.repository.AdminRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class AdminService implements IAdminService{

    @Autowired
    public AdminRepository admRepo;
    
    /*list*/
    @Override
    public List<Admin> getAdmins() {
      return admRepo.findAll();
    }

    /*one admin*/
    @Override
    public Admin getAdminById(Long id) {
       return admRepo.findById(id).orElse(null);
    }
    
}
