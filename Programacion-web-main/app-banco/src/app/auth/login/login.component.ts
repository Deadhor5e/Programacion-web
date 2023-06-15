import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ClienteService } from 'src/app/services/cliente/cliente.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  email: string = "";
  password: string = "";

constructor(private clienteService: ClienteService, private router: Router){}

  validarlogin() {
    console.log('validar', this.email, this.password);

    const usuario = this.clienteService.tologin(this.email, this.password);
    if (usuario){
      console.log(usuario);
      this.router.navigateByUrl('/pages/dashboard');
    } 
    else{
      console.log("Usuário inexistente");
    }
  }

}

