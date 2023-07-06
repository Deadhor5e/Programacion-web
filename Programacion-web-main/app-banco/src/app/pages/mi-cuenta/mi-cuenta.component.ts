import { Component, OnInit } from '@angular/core';
import { ClienteService } from 'src/app/services/cliente/cliente.service';

@Component({
  selector: 'app-mi-cuenta',
  templateUrl: './mi-cuenta.component.html',
  styleUrls: ['./mi-cuenta.component.css']
})
export class MiCuentaComponent  implements OnInit {

cliente: any = null;

  constructor(private clienteService: ClienteService){


  }
  
  ngOnInit(): void {
    this.cliente = this.clienteService.leerSesion();
  }
  }

