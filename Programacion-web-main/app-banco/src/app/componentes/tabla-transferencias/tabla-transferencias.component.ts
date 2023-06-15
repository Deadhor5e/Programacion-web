import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-tabla-transferencias',
  templateUrl: './tabla-transferencias.component.html',
  styleUrls: ['./tabla-transferencias.component.css']
})
export class TablaTransferenciasComponent {

@Input() transferencias: any[] = [];
}
