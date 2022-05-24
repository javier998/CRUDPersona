import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from './persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  private baseURL= "http://localhost:8080/personas";
  
  constructor(private httpCliente: HttpClient) { }

  getpersonasList(): Observable<Persona[]>{
    return this.httpCliente.get<Persona[]>(`${this.baseURL}`);
  }
}
