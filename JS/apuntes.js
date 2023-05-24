//Mensaje en consola
console.log("Hola mundo");

//Declarar variabel
let pi = 3.14;

//Inicializar variable
pi = 3.14

//El nombre puede contener numeros, pero no empezar por numeros
//No puede tener espacios en blanco
//let variable 1 KO
//let variable uno //KO
let variableuno //OK
let variable1 //OK

//Hay palabras resevadas que no podemos isar como variables
//let, switch, if, case
let nombre = "Alonso";
nombre = 4;
nombre = false;
console.log({nombre}) //Muestra tambien el nombre de la variable

//Variable tipo numero
let numero = 3.14;

//Variable tipo string
let apellido = "Valladares"; //Tambien admite " ' " (comillas simples)

//Variable tipo boolean (booleanos) True |  False
let verdadero = true;
let falso = false;

//Operadores matemáticos
let suma = 1 + 2;
suma = suma + 1; //Incremental
suma++; //Incremental (+1)
suma--; // -1
let resta = 1 - 2;
let mutiplicacion = 1 * 2;
let division = 1 / 2;
let modulo = 1 % 2; //Numero par o impar

//Operadores de asignación
let miVariable = 7;
mivariable += 4; //Sumar y asignar a la vez
mivariable -= 4; //Restar y asignar a la vez

//Operadores lógicos
let esDia = true;
let esNoche = true;

//Operador comparación
esAhoraDeDia = esDia == true; 
console.log({esAhoraDeDia}) //TRUE

esAhoraDeNoche = esNoche == false; 
console.log({esAhoraDeNoche}) //FALSE

//Operador mayor >
let edad = 17;
let esMayorDeEdad = edad >= 18;
console.log({edad}), ({esMayorDeEdad}) // 17, FALSE

let edad = 19;
let esMayorDeEdad = edad >= 18;
console.log({edad}), ({esMayorDeEdad}) // 19, TRUE

//Operador comparacion negativa
let numero1 = 2
let numero2 = 2
let sonDistintos = numero1 != numero2;
console.log({numero1}), ({numero2}), ({sonDistintos}); //2, 2, FALSES

//Operador AND
console.log(true&&true) // TRUE
console.log(false&&false) // FLASE

//Operador OR
console.log(true||true) // TRUE
console.log(true||false) // TRUE

let verdad = true; 
console.log({verdad}); //TRUE
let mentira = !verdad; 
console.log({mentira}); //FALSE