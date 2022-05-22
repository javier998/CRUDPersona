import { Component, OnInit } from '@angular/core';
import {Persona} from "../persona";
@Component({
  selector: 'app-persona-lista',
  templateUrl: './persona-lista.component.html',
  styleUrls: ['./persona-lista.component.css']
})
export class PersonaListaComponent implements OnInit {

  personas: Persona[] | undefined;

  constructor() { }

  ngOnInit(): void {

    this.personas=[
      {"cedula": "0106640345",
        "nombres":"Wilson Javier",
        "apellidos":"Chimbo Chimbo",
      "email":"javier@@@",
      "telefono":12345678
      },
      {"cedula": "0106640346",
        "nombres":"Juam pablo",
        "apellidos":"Chimbo Chimbo",
        "email":"pablo@@@",
       "telefono":12345678
      },
      {"cedula": "0106640347",
        "nombres":"john paul",
        "apellidos":"Chimbo Chimbo",
        "email":"johm@@@",
       "telefono":12345678
      }
    ];
  }

}
