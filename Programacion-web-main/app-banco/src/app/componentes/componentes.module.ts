import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TablaTransferenciasComponent } from './tabla-transferencias/tabla-transferencias.component';



@NgModule({
  // componentes que pertenecen al módulo
  declarations: [
    TablaTransferenciasComponent
  ],
  // cosas que necesitamos en este módulo
  imports: [
    CommonModule
  ],
  // cosas declaradas en el módulo que se pueden usar fuera
  exports: [
    TablaTransferenciasComponent
  ]
})
export class ComponentesModule { }
