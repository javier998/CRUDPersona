import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearPersonaComponent } from './crear-persona/crear-persona.component';
import { PersonaListaComponent } from './persona-lista/persona-lista.component';

const routes: Routes = [
  {path: "personas", component:PersonaListaComponent},
  {path:"", redirectTo:"personas", pathMatch:"full"},
  {path:"crear-persona", component:CrearPersonaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
