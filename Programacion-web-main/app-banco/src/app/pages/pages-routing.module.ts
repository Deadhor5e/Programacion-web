import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { TransferenciasRecibidasComponent } from './transferencias-recibidas/transferencias-recibidas.component';
import { TransferenciasEnviadasComponent } from './transferencias-enviadas/transferencias-enviadas.component';
import { TransferenciasComponent } from './transferencias/transferencias.component';
import { NuevaTransferenciaComponent } from './nueva-transferencia/nueva-transferencia.component';
import { TransferenciaCompletaComponent } from './transferencia-completa/transferencia-completa.component';
import { MiCuentaComponent } from './mi-cuenta/mi-cuenta.component';

const routes: Routes = [
  { path: 'dashboard', component: DashboardComponent },
  { path: 'transferencias-recibidas', component: TransferenciasRecibidasComponent },
  { path: 'transferencias-enviadas', component: TransferenciasEnviadasComponent },
  { path: 'transferencias', component: TransferenciasComponent },
  { path: 'nueva-transferencia', component: NuevaTransferenciaComponent},
  {path:"transferencia-completa", component: TransferenciaCompletaComponent},
  {path:"mi-cuenta", component: MiCuentaComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PagesRoutingModule { }
