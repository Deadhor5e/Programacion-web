import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { clientes } from 'src/app/datos/clientes-ejemplos';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  [x: string]: any;

  constructor(private http: HttpClient) { }

  apiUrl : string = 'http://localhost:8080/cliente';

  tologin(email: string, password: string) {
    for (let i = 0; i < clientes.length; i++) {
      const cliente = clientes[i];
      if (email === cliente.email && password === cliente.password) {
        return cliente;
      }
    }
    return null;
  }

  obtenerClientes() {
    return this.http.get(this.apiUrl);
  }

  login(email: string, password: string) {
    const url = `${this.apiUrl}?correo=${email}&password=${password}`
    return this.http.get(this.apiUrl)
    }

    crearSesion(clienteLogueado: any){
      const clienteJSON = JSON.stringify(clienteLogueado);
    sessionStorage.setItem("sesion", clienteJSON);
    }

    leerSesion(){
      const clienteJSON = sessionStorage.getItem("sesion");
      if(clienteJSON) {
      const clienteLogueado = JSON.parse(clienteJSON);
      return clienteLogueado;
    }
    return null;
    }

    cerrarSesion(){
      sessionStorage.removeItem("sesion");
    }

}


