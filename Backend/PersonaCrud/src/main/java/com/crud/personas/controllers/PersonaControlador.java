package com.crud.personas.controllers;

import com.crud.personas.entity.models.Persona;
import com.crud.personas.entity.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javi_
 */

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PersonaControlador {

    //Inyeccion
    @Autowired
    IPersonaService objIPersonaService;
      
    //obtencion de todas las personas con la URI
    @GetMapping("/personas")
    public List<Persona> getAllPersona(){
        return objIPersonaService.getAll();
    }
    
    //Obtencion de una persona con la URI + varibale "cedula"
    @GetMapping("/persona/{cedula}")
    public Persona getOne(@PathVariable(value = "cedula") String cedula){
        return objIPersonaService.get(cedula);
    }
    
    //Agregar un objeto de tipo pesona con la uri
    @PostMapping("/persona")
    public void add(@RequestBody Persona persona){
        System.out.println(persona.toString());
        objIPersonaService.post(persona);
    }
    
    
    //Actulizacion de una persona con la uri + variable "cedula"
    @PutMapping("/persona/{cedula}")
    public void update(@RequestBody Persona persona,@PathVariable(value = "cedula") String cedula){
        objIPersonaService.put(persona,cedula);
    }
    
    //Eliminacion de una persona con la uri + variable "cedula"
    @DeleteMapping("/persona/{cedula}")
    public void update(@PathVariable(value = "cedula") String cedula){
        objIPersonaService.delete(cedula);
    }
    
    
}
