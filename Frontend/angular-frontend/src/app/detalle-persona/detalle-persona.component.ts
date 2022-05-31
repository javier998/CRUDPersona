import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Persona } from '../persona';
import { PersonaService } from '../persona.service';

@Component({
  selector: 'app-detalle-persona',
  templateUrl: './detalle-persona.component.html',
  styleUrls: ['./detalle-persona.component.css']
})
export class DetallePersonaComponent implements OnInit {
  
  cedula: Text | undefined;
  persona : Persona = new Persona();

  constructor(private personaService: PersonaService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.cedula = this.route.snapshot.params[`id`];
    this.personaService.obtenerPersonaPorId(this.cedula).subscribe(data =>{
      this.persona = data;
    });
  }

}
