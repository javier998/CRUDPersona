import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {Persona} from "../persona";
import { PersonaService } from '../persona.service';
@Component({
  selector: 'app-persona-lista',
  templateUrl: './persona-lista.component.html',
  styleUrls: ['./persona-lista.component.css']
})
export class PersonaListaComponent implements OnInit {

  personas: Persona[] | undefined;

  constructor(private personaService: PersonaService, private router:Router) { }

  ngOnInit(): void {

    this.getPersonas();
  }

  private getPersonas(){
    this.personaService.getpersonasList().subscribe(data =>{
      this.personas = data;
      console.log(data);
    });
  }

  updatePersona(cedula: Text | undefined){
    this.router.navigate(['update-persona', cedula]);
  }

  eliminarPersona(cedula : Text | undefined){
    this.personaService.eliminarersonaPorId(cedula).subscribe(data =>{
      this.getPersonas();
    });
  }

  detallaPersona(cedula: Text | undefined ){
    this.router.navigate(['detalle-persona', cedula]);
  }
}
