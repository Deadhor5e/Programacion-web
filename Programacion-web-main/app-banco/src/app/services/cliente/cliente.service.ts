import { Injectable } from '@angular/core';
import { clientes } from 'src/app/datos/clientes-ejemplos';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  [x: string]: any;

  constructor() { }

  tologin(email: string, password: string) {
    for (let i = 0; i < clientes.length; i++) {
      const cliente = clientes[i];
      if (email === cliente.email && password === cliente.password) {
        return cliente;
      }
    }
    return null;
  }
}
