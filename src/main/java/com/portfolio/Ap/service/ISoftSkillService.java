/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.SoftSkill;

import java.util.List;

public interface ISoftSkillService {
    
    /* get list */
    public List<SoftSkill> getSoftSkills();
    
    /*get one*/
    public SoftSkill getSoftSkillById(Long id);
        
    /*update */
    public void editSoftSkill(SoftSkill sof);    
}
