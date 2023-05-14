/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.Education;
import com.portfolio.Ap.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository eduRepo;

    @Override
    public List<Education> getEducations() {
        return eduRepo.findAll();
    }

    @Override
    public Education getEducation(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void editEducation(Education edu) {
         eduRepo.save(edu);
    }

    @Override
    public void createEducation(Education edu) {
         eduRepo.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
    }
    
}
