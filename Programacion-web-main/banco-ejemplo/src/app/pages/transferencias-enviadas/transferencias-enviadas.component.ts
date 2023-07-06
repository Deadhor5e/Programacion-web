import { Component, Input } from '@angular/core';
import { transferenciasEnviadas } from 'src/app/datos/transferencias-ejemplo';
import { TransferenciaService } from 'src/app/services/transferencia/transferencia.service';

@Component({
  selector: 'app-transferencias-enviadas',
  templateUrl: './transferencias-enviadas.component.html',
  styleUrls: ['./transferencias-enviadas.component.css']
})
export class TransferenciasEnviadasComponent {

transferencias: any[] = [];

constructor(private transferenciaService: TransferenciaService) {
}

ngOnInit() {
  this.cargarTransferencias()
}

cargarTransferencias(){
  this.transferenciaService.obtenerTransferencias().subscribe((
    transferenciasCargadas: any ) => {
      console.log({transferenciasCargadas})
      this.transferencias = transferenciasCargadas
    }
  )
}

}
