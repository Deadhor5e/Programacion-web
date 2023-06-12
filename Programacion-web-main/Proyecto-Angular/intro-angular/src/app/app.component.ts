import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string = 'introAngular';

  contador: number = 0;

  aumentarContador() {
    this.contador++;
  }

  reducirContador() {
    this.contador--;
  }
  reinicarContador() {
    this.contador = 0;
  }


}
