/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Ap.service;

import com.portfolio.Ap.models.Persona;
import com.portfolio.Ap.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*Tiene la implementacion de todos los metodos que se declara en la interfaz Ipersona*/

@Service
@Transactional
public class PersonaService implements IPersonaService{

  /*intermediario de base de datos con el repositorio, se inyecta con la anotacion autowired*/
    
    @Autowired
    public PersonaRepository persoRepo;
    
    /*buscar lista de personas*/
    @Override
    public List<Persona> getPersonas() {
       return persoRepo.findAll();
    }

    /*buscar una persona*/
    @Override
    public Persona getPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
    
    /*crear una persona VER UPDATE*/

    @Override
    public void createPersona(Persona per) {
      persoRepo.save(per);
    }
    
}