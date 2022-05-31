import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonaListaComponent } from './persona-lista/persona-lista.component';
import { CrearPersonaComponent } from './crear-persona/crear-persona.component';
import {FormsModule} from '@angular/forms';
import { UpdatePersonaComponent } from './update-persona/update-persona.component';
import { DetallePersonaComponent } from './detalle-persona/detalle-persona.component'

@NgModule({
  declarations: [
    AppComponent,
    PersonaListaComponent,
    CrearPersonaComponent,
    UpdatePersonaComponent,
    DetallePersonaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
