/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.Persona;
import java.util.List;

/*
capa de servicio se encarga de la logica y funciones que se obtienen los datos
procesamiento logico d ela aplicacion que se muestra al usuario
 */
public interface IPersonaService {
    
    /* get list of personas*/
    public List<Persona> getPersonas();
    
    /*get one persona*/
    public Persona getPersona(Long id);
        
    /*update*/
    public void editPersona(Persona per);

}
