import { Component, OnInit } from '@angular/core';
import { transferenciasRecibidas } from 'src/app/datos/transferencias-ejemplo';

@Component({
  selector: 'app-transferencias-recibidas',
  templateUrl: './transferencias-recibidas.component.html',
  styleUrls: ['./transferencias-recibidas.component.css']
})
export class TransferenciasRecibidasComponent {

transferencias: any[] = transferenciasRecibidas;



}
