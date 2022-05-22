/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.personas.service;

import com.crud.personas.entity.models.Persona;
import com.crud.personas.dao.IPersonaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javi_
 */

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired(required = true)
    private IPersonaDao objIPersonaDao;
    
    @Override
    public Persona get(String cedula) {
        return objIPersonaDao.findById(cedula).get();
    }

    @Override
    public List<Persona> getAll() {
        return (List<Persona>) objIPersonaDao.findAll();
    }

    @Override
    public void post(Persona persona) {
        objIPersonaDao.save(persona);
    }

    @Override
    public void put(Persona persona, String cedula) {
       objIPersonaDao.findById(cedula).ifPresent((x)->{
       persona.setCedula(cedula);
       objIPersonaDao.save(persona);
       });
    }

    @Override
    public void delete(String cedula) {
        objIPersonaDao.deleteById(cedula);
    }
    
}
