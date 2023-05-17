/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.AboutMe;
import java.util.List;


public interface IAboutMeService {
    /* get list */
    public List<AboutMe> getAbouts();
    
    /*get one */
    public AboutMe getAboutMeById(Long id);
        
    /*update*/
    public void editAboutMe(AboutMe abo);
}
