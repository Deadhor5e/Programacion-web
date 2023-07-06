import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TransferenciaService {

  constructor(private http: HttpClient) { }

  urlApi: string = "http://localhost:8080/transferencia";

  // traer todas las transferencias 
  obtenerTransferencias() {
    return this.http.get(this.urlApi)
  }

  obtenerTransferenciasPorId(id: number) {
    const url = `${this.urlApi}/trasnferencia/${id}`;
    return this.http.get(url);
  }

  guardarTransferencia(transferencia: any) {
    return this.http.post(this.urlApi, transferencia);
  }

}

