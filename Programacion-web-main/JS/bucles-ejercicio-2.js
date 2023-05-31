//Pedir numero al usuario hasta que lo adivine 1-100
//Decirle si es mayor o menor

const numeroSecreto = 80;
//const numeroSecreto = parseInt(Math.random()*100) //Numero random 0-100

let numeroUsuario;

while(numeroSecreto != numeroUsuario) {
    numeroUsuario = prompt("Adivina el número! (1-100)");
    if(numeroSecreto == numeroUsuario) {
        alert("CORRECTO!");
    }
    if(numeroSecreto != numeroUsuario && numeroUsuario > numeroSecreto) {
        alert("Prueba otra vez! (pista: el numero secreto es MENOR al introducido)");
    }
    if(numeroSecreto != numeroUsuario && numeroUsuario < numeroSecreto) {
        alert("Prueba otra vez! (pista: el numero secreto es MAYOR al introducido)");
    }
}