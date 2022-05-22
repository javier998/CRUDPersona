/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.personas.controllers;

import com.crud.personas.entity.models.Persona;
import com.crud.personas.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javi_
 */

@RestController
public class PersonaControlador {

    @Autowired
    IPersonaService objIPersonaService;
        
    @GetMapping("/personas")
    public List<Persona> getAllPersona(){
        return objIPersonaService.getAll();
    }
    
    @GetMapping("/persona/{cedula}")
    public Persona getOne(@PathVariable(value = "cedula") String cedula){
        return objIPersonaService.get(cedula);
    }
    
    @PostMapping("/persona")
    public void add(Persona persona){
        objIPersonaService.post(persona);
    }
    
    @PutMapping("/persona")
    public void update(Persona persona, String cedula){
        objIPersonaService.put(persona,cedula);
    }
    
    @DeleteMapping("/persona/{cedula}")
    public void update(@PathVariable(value = "cedula") String cedula){
        objIPersonaService.delete(cedula);
    }
    
    
}
