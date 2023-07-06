import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ClienteService } from 'src/app/services/cliente/cliente.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  // para almacenar los campos
  email: string = "";
  password: string = "";
  cliente: any = null;


  constructor(private clienteService: ClienteService, private router: Router) { }

  getClienteService() {
    return this.clienteService;
  }

  ngOnInit(): void {
    this.cliente = this.clienteService.leerSesion();
  }

  validarLogin() {
    console.log('Validando...', this.email, this.password);

    const usuario = this.clienteService.hacerLogin(this.email, this.password);
    if (usuario) {
      console.log(usuario)
this.router.navigateByUrl("/pages/dashboard");
    }
    else { console.error("No se pudo conectar")
  this.email = "";
  this.password = "";
  };
  }

enviarLogin() {
  this.clienteService.login(this.email, this.password).subscribe(
    cliente => { console.log({cliente}) ;
    if(cliente){ 
      this.clienteService.crearSesion(cliente);
       this.router.navigateByUrl(`/pages/dashboard`)}
    else{console.error("Contraseña incorrecta")}
    // aqui que se muestre el texto para el usuario: correo o contraseña incorrectos
  ;},
    // cuando hay errores en la respuesta
    error=> { console.log({ error});}


  )
}

cerrarSesion() {
  this.clienteService.cerrarSesion();
  this.cliente=null;
}

}
