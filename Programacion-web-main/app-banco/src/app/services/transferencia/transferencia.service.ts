import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TransferenciaService {

  constructor(private http: HttpClient) {}

  urlApi: string = 'http://localhost:8080/transferencia';

  // Trear todas las transferencia
  obtenerTransferencias(){
    return this.http.get(this.urlApi);
  }

  // Traer una trasnferencia por ID

  // Guardar transferencia

  //Borrar una trasnferencia por ID

}

