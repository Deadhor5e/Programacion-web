//Ejercicio 1
let a = 23;
let b = 32;
let c = 54;

let suma = a + b + c;
console.log({ suma });
console.log(`${a} + ${b} + ${c} = ${ suma }`);

c = 84;
suma = a + b + c;
console.log(`${a} + ${b} + ${c} = ${ suma }`);

/////////////////////////////////////

//Salto de linea
console.log("---------------");
console.log("---------------");
/////////////////////////////////////


//Ejercicio 2
let mensaje = "Hola mundo";
let operacion = 2*3;

console.log("2 * 3 =", operacion);
console.log({ operacion });

/////////////////////////////////////
//Salto de linea
console.log("---------------");
console.log("---------------");
/////////////////////////////////////


//Ejercicio 3
//String > Number
let unoString = "1";
console.log( {unoString} );

let unoNumber = parseInt(unoString);
console.log( {unoNumber} );

//implicita
let resta = "3" - 2;
console.log ({ resta });

unoNumber = Number("1");
console.log({ unoNumber });

unoNumber = String("uno");
console.log({ unoNumber });

//Number > String
let dosNumber = 2;
console.log({ dosNumber });

dosString = dosNumber.toString();
console.log({ dosString });
