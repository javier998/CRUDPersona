package com.crud.personas.entity.service;

import com.crud.personas.entity.models.Persona;
import com.crud.personas.entity.dao.IPersonaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javi_
 */

//Implementacion de los metodos abstractos de la interfaz IPersonaService

@Service
public class PersonaServiceImpl implements IPersonaService{

    //Inyeccion
    @Autowired(required = true)
    private IPersonaDao objIPersonaDao;
    
    //Retorna un objeto de tipo de persona
    @Override
    public Persona get(String cedula) {
        return objIPersonaDao.findById(cedula).get();
    }

    //Retorna una lista de todas las personas
    @Override
    public List<Persona> getAll() {
        return (List<Persona>) objIPersonaDao.findAll();
    }

    //Agrega un onjetos de tipo persona
    @Override
    public void post(Persona persona) {
        System.out.println("implementado: "+ persona.toString());
        objIPersonaDao.save(persona);
    }

    //Actualiza un objeto de tipo persona segun la cedula
    @Override
    public void put(Persona persona, String cedula) {
       objIPersonaDao.findById(cedula).ifPresent((x)->{
       persona.setCedula(cedula);
       objIPersonaDao.save(persona);
       });
    }

    //Elimina un objeto de tipo persona segun la cedula
    @Override
    public void delete(String cedula) {
        objIPersonaDao.deleteById(cedula);
    }
    
}
