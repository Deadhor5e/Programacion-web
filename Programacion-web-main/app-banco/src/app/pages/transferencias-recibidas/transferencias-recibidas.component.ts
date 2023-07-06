import { Component, OnInit } from '@angular/core';
import { transferenciasRecibidas } from 'src/app/datos/transferencias-ejemplo';
import { TransferenciaService } from 'src/app/services/transferencia/transferencia.service';

@Component({
  selector: 'app-transferencias-recibidas',
  templateUrl: './transferencias-recibidas.component.html',
  styleUrls: ['./transferencias-recibidas.component.css']
})
export class TransferenciasRecibidasComponent {

  transferencias: any[] = [];

  constructor(private transferenciaService: TransferenciaService) {
  }

  ngOnInit() {
    this.cargarTransferencias()
  }

  cargarTransferencias() {
    this.transferenciaService.obtenerTransferencias().subscribe((
      transferenciasCargadas: any) => {
      console.log({ transferenciasCargadas })
      this.transferencias = transferenciasCargadas
    }
    )
  }

}
