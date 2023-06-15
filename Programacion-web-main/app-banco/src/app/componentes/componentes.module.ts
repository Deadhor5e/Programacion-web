import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TablaTransferenciasComponent } from './tabla-transferencias/tabla-transferencias.component';



@NgModule({
  //componentes que pertenecen al modulo
  declarations: [
    TablaTransferenciasComponent
  ],
  //cosas que ncesitamos en este modilo
  imports: [
    CommonModule
  ],
  //cosas declaradas en el modulo que se pueden usar fuera
  exports: [
    TablaTransferenciasComponent
  ]
})
export class ComponentesModule { }
