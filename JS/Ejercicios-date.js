// 6am-12am -> Buenos días
// 13am-19pm -> Buenas tardes
// 20-5am -> Buenas noches

let ahora = new Date ();
console.log({ ahora });

let horas = ahora.getHours();
console.log({ horas });

const inicioDia= 6;
const inicioTarde= 13;
const inicioNoche = 20;

const msgDias = "<h1>Buenos días!</h1>";
const msgTardes = "<h1>Buenas tardes!</h1>";
const msgNoches = "<h1>Buenas noches!</h1>";

const esDia = horas >= inicioDia && horas < inicioTarde;
const esTarde = horas >= inicioTarde && horas < inicioNoche;
const esNoche = horas >= inicioNoche || horas < inicioDia;


if (esDia) {
   saludar(msgDias);
}

if (esTarde) {
    saludar(msgTardes);
}

if (esNoche) {
    saludar(msgNoches);
}

function saludar(saludo) {
    document.write(saludo)
}