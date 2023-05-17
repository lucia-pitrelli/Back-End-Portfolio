/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.AboutMe;

import com.portfolio.Ap.repository.AboutMeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AboutMeService implements IAboutMeService{
    @Autowired
    public AboutMeRepository aboutRepo;

    
    @Override
    public List<AboutMe> getAbouts() {
        return aboutRepo.findAll();
    }

    @Override
    public AboutMe getAboutMeById(Long id) {
       return aboutRepo.findById(id).orElse(null);
    }

    @Override
    public void editAboutMe(AboutMe abo) {
       aboutRepo.save(abo);
    }
    
}
