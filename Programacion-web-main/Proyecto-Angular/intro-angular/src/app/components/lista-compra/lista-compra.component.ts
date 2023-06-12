import { Component, OnInit } from '@angular/core';
import { LocalStorageService } from 'src/app/services/local-storage/local-storage.service';

@Component({
  selector: 'app-lista-compra',
  templateUrl: './lista-compra.component.html',
  styleUrls: ['./lista-compra.component.css']
})
export class ListaCompraComponent implements OnInit {

  constructor(private localStorage:LocalStorageService) { }

  productos: string[] = [];

  nuevoProducto: string = '';

  ngOnInit() {
    console.log(this.productos);
    const listaGuardada = this.localStorage.leer('lista-compra')
    if (listaGuardada) {
          this.productos = listaGuardada;
        }
  }

  incluirProducto() {
    this.productos.push(this.nuevoProducto)
    this.nuevoProducto = '';
    this.localStorage.guardar('lista-compra', this.productos);
  }
vaciarLista(){
  this.localStorage.borrar('lista-compra');
  //vaciar lista
  this.productos = [];
}

}
