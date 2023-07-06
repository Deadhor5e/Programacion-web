import { Component } from '@angular/core';
import { TransferenciaService } from 'src/app/services/transferencia/transferencia.service';

@Component({
  selector: 'app-nueva-transferencia',
  templateUrl: './nueva-transferencia.component.html',
  styleUrls: ['./nueva-transferencia.component.css']
})
export class NuevaTransferenciaComponent {
  ordenante: string = '';
  beneficiario: string = '';
  importe: number = 0;
  concepto: string = '';

  constructor(private transferenciaService: TransferenciaService) {}

  enviarTransferencia() {
    const transferencia = {
      ordenante: this.ordenante,
      beneficiario: this.beneficiario,
      importe: this.importe,
      concepto: this.concepto
    };

    this.transferenciaService.guardarTransferencia(transferencia).subscribe(
      (response: any) => {
        console.log('Transferencia guardada:', response);
      },
      (error: any) => {
        console.error('Error al guardar la transferencia:', error);
      }
    );
  }
}