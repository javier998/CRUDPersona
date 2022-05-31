import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Persona } from '../persona';
import { PersonaService } from '../persona.service';

@Component({
  selector: 'app-update-persona',
  templateUrl: './update-persona.component.html',
  styleUrls: ['./update-persona.component.css']
})
export class UpdatePersonaComponent implements OnInit {
  cedula: Text | undefined;
  persona : Persona = new Persona();
  constructor(private personaService: PersonaService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.cedula = this.route.snapshot.params[`id`];
    this.personaService.obtenerPersonaPorId(this.cedula).subscribe(data => {
      this.persona = data;

    }, error =>  console.log(error));
    
  }

  onSubmit(){
    this.personaService.actualizarPersonaPorId(this.cedula, this.persona).subscribe(data => {
      this.irPersonaLista();
    },error => console.log(error));
    
  }

  irPersonaLista(){
    this.router.navigate(['/personas']);
  }
}
