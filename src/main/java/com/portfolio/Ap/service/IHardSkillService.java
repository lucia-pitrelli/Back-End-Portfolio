/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.HardSkill;

import java.util.List;

public interface IHardSkillService {
    
    /* get list */
    public List<HardSkill> getHardSkills();
    
    /*get one */
    public HardSkill getHardSkillById(Long id);
        
    /*update*/
    public void editHardSkill(HardSkill har);
     
    /*create */
    public void createHardSkill(HardSkill har);
    
    /*delete*/
    public void deleteHardSkill(Long id);
    
}
