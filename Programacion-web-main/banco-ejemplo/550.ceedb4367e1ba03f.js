"use strict";(self.webpackChunkapp_banco=self.webpackChunkapp_banco||[]).push([[550],{784:(C,u,a)=>{a.r(u),a.d(u,{AuthModule:()=>f});var d=a(755),c=a(801),e=a(902);const p=[{id:1,idGestor:1,correo:"ejemplo@correo.com",password:"1234",usuario:"alexelcalvo",saldo:190},{id:2,idGestor:2,correo:"ajemplo@correo.com",password:"43215",usuario:"ferrancalvo",saldo:2300}];let g=(()=>{class o{constructor(){}hacerLogin(n,t){for(let i=0;i<p.length;i++){const l=p[i];if(n===l.correo&&t===l.password)return l}return null}}return o.\u0275fac=function(n){return new(n||o)},o.\u0275prov=e.Yz7({token:o,factory:o.\u0275fac,providedIn:"root"}),o})();var s=a(30);const m=[{path:"login",component:(()=>{class o{constructor(n,t){this.clienteService=n,this.router=t,this.email="",this.password=""}validarLogin(){console.log("Validando...",this.email,this.password);const n=this.clienteService.hacerLogin(this.email,this.password);n?(console.log(n),this.router.navigateByUrl("/pages/dashboard")):(console.error("No se pudo conectar"),this.email="",this.password="")}}return o.\u0275fac=function(n){return new(n||o)(e.Y36(g),e.Y36(c.F0))},o.\u0275cmp=e.Xpm({type:o,selectors:[["app-login"]],decls:13,vars:2,consts:[["for","email"],["type","email","id","email","placeholder","Correo electronico",3,"ngModel","ngModelChange","keyup.enter"],["for","password"],["type","password","id","password","placeholder","Contrase\xf1a",3,"ngModel","ngModelChange","keyup.enter"],[1,"submit",3,"click"]],template:function(n,t){1&n&&(e.TgZ(0,"section")(1,"label",0),e._uU(2,"Correo electronico"),e.qZA(),e._UZ(3,"br"),e.TgZ(4,"input",1),e.NdJ("ngModelChange",function(l){return t.email=l})("keyup.enter",function(){return t.validarLogin()}),e.qZA(),e._UZ(5,"br"),e.TgZ(6,"label",2),e._uU(7,"Contrase\xf1a"),e.qZA(),e._UZ(8,"br"),e.TgZ(9,"input",3),e.NdJ("ngModelChange",function(l){return t.password=l})("keyup.enter",function(){return t.validarLogin()}),e.qZA(),e._UZ(10,"br"),e.TgZ(11,"button",4),e.NdJ("click",function(){return t.validarLogin()}),e._uU(12,"Acceder"),e.qZA()()),2&n&&(e.xp6(4),e.Q6J("ngModel",t.email),e.xp6(5),e.Q6J("ngModel",t.password))},dependencies:[s.Fj,s.JJ,s.On],styles:["section[_ngcontent-%COMP%]{text-align:center;margin:40px}input[_ngcontent-%COMP%]{margin:15px;background-color:#f5f5f5;color:#000}label[_ngcontent-%COMP%]{margin:auto;font-weight:700;font-size:larger}.submit[_ngcontent-%COMP%]{margin:10px;background-color:var(--Button);font-weight:bolder;color:#000;font-size:large}"]}),o})()}];let h=(()=>{class o{}return o.\u0275fac=function(n){return new(n||o)},o.\u0275mod=e.oAB({type:o}),o.\u0275inj=e.cJS({imports:[c.Bz.forChild(m),c.Bz]}),o})(),f=(()=>{class o{}return o.\u0275fac=function(n){return new(n||o)},o.\u0275mod=e.oAB({type:o}),o.\u0275inj=e.cJS({imports:[d.ez,h,s.u5]}),o})()}}]);