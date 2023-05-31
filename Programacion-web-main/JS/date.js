//

let ahora = new Date ();

let horas = ahora.getDate();
let minutos = ahora.getMinutes();
let year = ahora.getFullYear();
let mes = ahora.getMonth();

//milisegundos desde el 1 de Enero 1970
let formatoTime = ahora.getTime();

console.log({ horas, minutos, year, mes, formatoTime });


//Modificadores
ahora.setFullYear(2024);
ahora.setHours(11);

console.log({horas, year });
