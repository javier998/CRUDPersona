import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from './persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  private baseURL= "http://localhost:8080/personas";
  private baseURLP= "http://localhost:8080/persona";
  
  constructor(private httpCliente: HttpClient) { }

  getpersonasList(): Observable<Persona[]>{
    return this.httpCliente.get<Persona[]>(`${this.baseURL}`);
  }

  crearPersona(persona: Persona): Observable<any>{
    const headers = { 'content-type': 'application/json'};  
    const body=JSON.stringify(persona);
    console.log(body);
    return this.httpCliente.post(`${this.baseURLP}`, persona);
    
  }

  obtenerPersonaPorId(cedula: Text | undefined):Observable<Persona>{
    return this.httpCliente.get<Persona>(`${this.baseURLP}/${cedula}`)
  }

  actualizarPersonaPorId(cedula:Text | undefined, persona: Persona): Observable<Object>{
    return this.httpCliente.put<Persona>(`${this.baseURLP}/${cedula}`,persona);
  }

  eliminarersonaPorId(cedula: Text | undefined):Observable<Persona>{
    return this.httpCliente.delete<Persona>(`${this.baseURLP}/${cedula}`)
  }
}
