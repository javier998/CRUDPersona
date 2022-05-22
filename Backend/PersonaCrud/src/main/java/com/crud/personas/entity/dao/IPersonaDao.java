package com.crud.personas.entity.dao;

import com.crud.personas.entity.models.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author javi_
 */

//Interfaz implementada con libreria de spring boot
public interface IPersonaDao extends CrudRepository<Persona, String>{
    
}
