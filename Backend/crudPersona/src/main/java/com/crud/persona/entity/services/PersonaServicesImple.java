package com.crud.persona.entity.services;

import com.crud.perona.entity.models.Persona;
import com.crud.persona.entity.dao.IPersonaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javi_
 */

@Service
public class PersonaServicesImple implements IPersonaService{

    @Autowired
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
    public void put(Persona persona, String cedula) {
        objIPersonaDao.findById(cedula).ifPresent((x)->{persona.setCedula(cedula);
        objIPersonaDao.save(persona);
        });
    }

    @Override
    public void post(Persona persona) {
        objIPersonaDao.save(persona);
    }

    @Override
    public void delete(String cedula) {
        objIPersonaDao.deleteById(cedula);
    }
    
}
