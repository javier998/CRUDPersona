import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from '../persona';
import { PersonaService } from '../persona.service';

@Component({
  selector: 'app-crear-persona',
  templateUrl: './crear-persona.component.html',
  styleUrls: ['./crear-persona.component.css']
})
export class CrearPersonaComponent implements OnInit {

  persona : Persona = new Persona();

  constructor(private personaService: PersonaService, private router:Router) { }

  ngOnInit(): void {
  }

  guardarPersona(){
    this.personaService.crearPersona(this.persona).subscribe(data =>{
      this.irPersonaLista();
      console.log(data);
    });
  }

  irPersonaLista(){
    this.router.navigate(['/personas']);
  }
  onSubmit(){
    console.log(this.persona);
    this.guardarPersona();
    
  }
}
