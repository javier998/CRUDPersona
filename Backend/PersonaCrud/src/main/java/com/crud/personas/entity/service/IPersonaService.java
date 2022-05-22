package com.crud.personas.entity.service;

import com.crud.personas.entity.models.Persona;
import java.util.List;

/**
 *
 * @author javi_
 */

//Iterfza con los metodos para el crud de la tabla de persono
public interface IPersonaService {
    //Obtiene un persona con el id dicho
    public Persona get(String cedula);
    
    //Obtiene todas las personas
    public List<Persona> getAll();
    
    //Agregra una nueva persona
    public void post(Persona persona);
    
    //Actualiza una persona segun la cedula dicha
    public void put (Persona persona, String cedula);
    
    //Elimina una persona segun la cedula
    public void delete(String cedula);
}
