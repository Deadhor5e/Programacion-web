import { Injectable } from '@angular/core';
import { clientes } from 'src/app/datos/usuarios-ejemplo';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor() { }

  toLogin(email: string, password: string) {
    for (let i = 0; i < clientes.length; i++) {
      const cliente = clientes[i];
      if (cliente.correo === email && cliente.password === password) {
        return cliente;
      }
    }
    return null;
  }
}
