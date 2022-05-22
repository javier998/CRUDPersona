/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.personas.service;

import com.crud.personas.entity.models.Persona;
import java.util.List;

/**
 *
 * @author javi_
 */
public interface IPersonaService {
    public Persona get(String cedula);
    public List<Persona> getAll();
    public void post(Persona persona);
    public void put (Persona persona, String cedula);
    public void delete(String cedula);
}
