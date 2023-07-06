import { Component, Input, OnInit} from '@angular/core';
import { transferenciasEnviadas, transferenciasRecibidas } from 'src/app/datos/transferencias-ejemplo';
import { ActivatedRoute, Params } from '@angular/router';


@Component({
  selector: 'app-transferencia-completa',
  templateUrl: './transferencia-completa.component.html',
  styleUrls: ['./transferencia-completa.component.css']
})
export class TransferenciaCompletaComponent  implements OnInit
 {
  @Input() transferencias: any = transferenciasEnviadas || transferenciasRecibidas;

  transferenciaId: string | undefined;
  transferencia: any; // Asume que el tipo de la transferencia es "any" por simplicidad

  constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.route.params.subscribe((params: Params) => {
      this.transferenciaId = params['id'];
      this.transferencia = this.transferencias.find((t: { id: string | undefined; }) => t.id === this.transferenciaId);
    });

}
 }
