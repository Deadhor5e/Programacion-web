import { Component } from '@angular/core';
import { ClienteService } from 'src/app/services/cliente/cliente.service';


@Component({
  selector: 'app-micuenta',
  templateUrl: './micuenta.component.html',
  styleUrls: ['./micuenta.component.css']
})
export class MicuentaComponent {

  cliente: any = null;

  constructor(private clienteService: ClienteService){


  }
  
  ngOnInit(): void {
    this.cliente = this.clienteService.leerSesion();
  }

}
