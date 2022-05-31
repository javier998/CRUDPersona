import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearPersonaComponent } from './crear-persona/crear-persona.component';
import { DetallePersonaComponent } from './detalle-persona/detalle-persona.component';
import { PersonaListaComponent } from './persona-lista/persona-lista.component';
import { UpdatePersonaComponent } from './update-persona/update-persona.component';

const routes: Routes = [
  {path: "personas", component:PersonaListaComponent},
  {path:"", redirectTo:"personas", pathMatch:"full"},
  {path:"crear-persona", component:CrearPersonaComponent},
  {path: "update-persona/:id", component:UpdatePersonaComponent},
  {path: "detalle-persona/:id", component:DetallePersonaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
