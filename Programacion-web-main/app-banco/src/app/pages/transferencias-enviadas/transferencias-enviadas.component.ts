import { Component } from '@angular/core';
import { TransferenciaService } from 'src/app/services/transferencia/transferencia.service';

@Component({
  selector: 'app-transferencias-enviadas',
  templateUrl: './transferencias-enviadas.component.html',
  styleUrls: ['./transferencias-enviadas.component.css']
})
export class TransferenciasEnviadasComponent {

  transferencias: any[] = [];

  constructor(private TransferenciaService: TransferenciaService) { }

  ngOnInit() {
    this.cargarTransferencias();
  }

  cargarTransferencias() {
    this.TransferenciaService
    .obtenerTransferencias()
    .subscribe((transferenciasCargadas: any) => {
      console.log(transferenciasCargadas);
      this.transferencias = transferenciasCargadas;
    });
  }
}