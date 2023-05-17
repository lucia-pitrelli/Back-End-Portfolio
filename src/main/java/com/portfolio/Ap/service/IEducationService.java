/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.Education;

import java.util.List;


public interface IEducationService {
    
    /* get list of Education*/
    public List<Education> getEducations();
    
    /*get one Education*/
    public Education getEducationById(Long id);
        
    /*update Education*/
    public void editEducation(Education edu);
     
    /*create one Education*/
    public void createEducation(Education edu);
    
    /*delete one Education*/
    public void deleteEducation(Long id);
    
}
