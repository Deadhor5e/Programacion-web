import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'intro-angular';
  contador: number = 0;

  aumentarContador() {
    this.contador++;
  }

  disminuirContador(contador: number = 0) {
    this.contador--;
  }
}
