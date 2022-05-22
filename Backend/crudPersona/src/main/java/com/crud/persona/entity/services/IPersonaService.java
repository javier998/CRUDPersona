/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.persona.entity.services;

import com.crud.perona.entity.models.Persona;
import java.util.List;

/**
 *
 * @author javi_
 */
public interface IPersonaService {
    public Persona get(String cedula);
    public List<Persona> getAll();
    public void put(Persona persona, String cedula);
    public void post (Persona persona);
    public void delete (String cedula);
    
}
