import { Component, OnInit } from '@angular/core';
import {Persona} from "../persona";
import { PersonaService } from '../persona.service';
@Component({
  selector: 'app-persona-lista',
  templateUrl: './persona-lista.component.html',
  styleUrls: ['./persona-lista.component.css']
})
export class PersonaListaComponent implements OnInit {

  personas: Persona[] | undefined;

  constructor(private personaService: PersonaService) { }

  ngOnInit(): void {

    this.getPersonas();
  }

  private getPersonas(){
    this.personaService.getpersonasList().subscribe(data =>{
      this.personas = data;
    });
  }
}
