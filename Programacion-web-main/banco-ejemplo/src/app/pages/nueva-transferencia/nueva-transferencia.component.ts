import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nueva-transferencia',
  templateUrl: './nueva-transferencia.component.html',
  styleUrls: ['./nueva-transferencia.component.css']
})
export class NuevaTransferenciaComponent {
 // para almacenar los campos
 beneficiario: number | null = null;
 importe: number = 0;
concepto: string = "";
}
