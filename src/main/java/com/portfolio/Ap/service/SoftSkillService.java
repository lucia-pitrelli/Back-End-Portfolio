/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.SoftSkill;
import com.portfolio.Ap.repository.SoftSkillRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class SoftSkillService implements ISoftSkillService{
    
    @Autowired
    public SoftSkillRepository sofRepo;

    @Override
    public List<SoftSkill> getSoftSkills() {
        return sofRepo.findAll();
    }

    @Override
    public SoftSkill getSoftSkillById(Long id) {
         return sofRepo.findById(id).orElse(null);
    }

    @Override
    public void editSoftSkill(SoftSkill sof) {
          sofRepo.save(sof);
    }
    
}
