/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Ap.repository;

import com.portfolio.Ap.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*interface repositorio que utiliza JPA para metodos create...*/
/*se coloca la clase persona y el long que proviene del id*/
@Repository
public interface PersonaRepository  extends JpaRepository<Persona, Long>{
    
}
