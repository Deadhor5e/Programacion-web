import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { MicuentaComponent } from './pages/micuenta/micuenta.component';
import { NuevaTransferenciaComponent } from './pages/nueva-transferencia/nueva-transferencia.component';
import { TransferenciasEnviadasComponent } from './pages/transferencias-enviadas/transferencias-enviadas.component';
import { TransferenciasRecibidasComponent } from './pages/transferencias-recibidas/transferencias-recibidas.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';

const routes: Routes = [

  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'dashboard', component: DashboardComponent},
  { path: 'micuenta', component: MicuentaComponent},
  { path: 'nueva-transferencia', component: NuevaTransferenciaComponent},
  { path: 'transferencias-enviadas', component: TransferenciasEnviadasComponent},
  { path: 'transferencias-recibidas', component: TransferenciasRecibidasComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [
  LoginComponent,
  DashboardComponent,
  MicuentaComponent,
  NuevaTransferenciaComponent,
  TransferenciasEnviadasComponent,
  TransferenciasRecibidasComponent
]