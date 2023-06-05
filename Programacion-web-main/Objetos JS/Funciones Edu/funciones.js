// Código no reutilizable
let num1 = 5;
let num2 = 10;

let suma = num1 + num2;

console.log(suma); // Debería imprimir 15

// Convertir en una función
function sumar(num1, num2) {
  return num1 + num2;
}

// Llamada a la función
let sumaFuncion = sumar(num1, num2);

console.log(sumaFuncion); // Debería imprimir 15, como antes

// Llamada a la función con otros argumentos
let otroResultado = sumar(20, 32);

console.log(otroResultado); // Debería imprimir 52
