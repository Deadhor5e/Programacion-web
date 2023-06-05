//Ejercicio 2 - // Código no reutilizable
let base = 5;
let altura = 8;

function triangleArea(base, altura) {
    let area = (base * altura) / 2;
    return (base * altura) / 2;
}

console.log(triangleArea(base, altura));
console.log(triangleArea(7, 10));

//--------------------------------------------------

//Ejercicio 3 - // Código no reutilizable
let numero = 4;

function esPar(numero) {
    return numero % 2 === 0;
};

console.log(esPar(numero));
console.log(esPar(15));

//--------------------------------------------------

//Ejercicio 4 - // Código no reutilizable
let temperaturaEnCelsius = 25;

function temperaturaEnFahrenheit(temperaturaEnCelsius) {
    let fahrenheit = (temperaturaEnCelsius * 9) / 5 + 32;
    return fahrenheit;
}

console.log(temperaturaEnFahrenheit(temperaturaEnCelsius));
console.log(temperaturaEnFahrenheit(500));

//--------------------------------------------------

//Ejercicio 5 - // Código no reutilizable para aleatorio entre 2 y 10
let numero1 = 2;
let numero2 = 10;

function nAleatorio(numero1, numero2) {
    let numeroAleatorio = Math.floor(Math.random() * (numero2 - numero1 + 1) ) + numero1;
    return numeroAleatorio;
};

console.log(nAleatorio(numero1, numero2));
console.log(nAleatorio(100, 50));
