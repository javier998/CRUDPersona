/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.personas.dao;

import com.crud.personas.entity.models.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author javi_
 */
public interface IPersonaDao extends CrudRepository<Persona, String>{
    
}
