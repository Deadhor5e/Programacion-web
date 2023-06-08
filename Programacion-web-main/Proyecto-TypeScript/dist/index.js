"use strict";
// 1_Funcion que sume 2 numeros y retorne el resultado
// 2_Funcion que reciba un nombre y retorne un saludo (Ej. Saludar("Juan") -> "Hola Juan")
// 3_Funcion veririfcar numero par
// 4_Funcion que caulcule el area de un triangulo
// 1_
function sumar(numero1, numero2) {
    return numero1 + numero2;
}
console.log(sumar(5, 10));
// 2_
function saludar(nombre) {
    return `Hola ${nombre}`;
}
console.log(saludar("Juan"));
// 3_
function par(numero3) {
    return numero3 % 2 === 0;
}
console.log(par(22));
// 4_
function areaTriangulo(base, altura) {
    return (base * altura) / 2;
}
console.log(areaTriangulo(5, 10));
