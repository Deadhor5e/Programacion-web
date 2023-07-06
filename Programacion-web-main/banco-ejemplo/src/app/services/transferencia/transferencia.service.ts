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

// traer una transferencia por id



// guardar una transferencia

//borrar una transferencia por id

}

