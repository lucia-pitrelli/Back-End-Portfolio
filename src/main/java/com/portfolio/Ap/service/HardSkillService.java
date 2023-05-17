/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.HardSkill;
import com.portfolio.Ap.repository.HardSkillRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements IHardSkillService{
    
    @Autowired
    public HardSkillRepository harRepo;

    /*list*/
    @Override
    public List<HardSkill> getHardSkills() {
        return harRepo.findAll();
    }

    /*get one*/
    @Override
    public HardSkill getHardSkillById(Long id) {
        return harRepo.findById(id).orElse(null);
    }

    /*update*/
    @Override
    public void editHardSkill(HardSkill har) {
        harRepo.save(har);
    }

    /*create*/
    @Override
    public void createHardSkill(HardSkill har) {
        harRepo.save(har);
    }

    /*delete one*/
    @Override
    public void deleteHardSkill(Long id) {
        harRepo.deleteById(id);
    }
}
