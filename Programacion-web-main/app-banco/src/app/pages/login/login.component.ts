import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ApiService } from '../../servicios/api/api.service';
import { LoginI } from '../../modelos/login.interface';
import { Router } from '@angular/router';
import { ResponseI } from '../../modelos/response.interface';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  loginForm = new FormGroup({
    correo: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required)
  })

  constructor(private api: ApiService, private router:Router) { }

  ngOnInit(): void {
  }

  // onLogin(form: LoginI) {
  //   this.api.loginByEmail(form).subscribe(data => {
  //     let dataResponse: ResponseI = data;
  //     if(dataResponse.status == "ok") {
  //       localStorage.setItem("token", dataResponse.result.token);
  //       this.router.navigate(['dashboard']);
  //     }
  //   });
  // }

  onLogin(form: LoginI) {
    const correo = form.correo;
    const password = form.password;

    const loginData: LoginI = {
      correo: correo,
      password: password
    };

    this.api.loginByEmail(loginData).subscribe(data => {
      let dataResponse: ResponseI = data;
      if (dataResponse.status == "ok") {
        localStorage.setItem("token", dataResponse.result.token);
        this.router.navigate(['dashboard']);
      }
    });
  }

}
