// implementa un juego de búsqueda

// 1️⃣ implementa la lógica básica

// 🟢 Tendrá una lista (array) llamada "tablero"
// let tablero = [];

// 🟢 Tendrá un contador de intentos inicalizado a 0
// let intentos = 0;

// 🟢 Una función crearTablero(numeroRegalos, dificultad)

// que cree una lista de numeroRegalos * dificultad elementos
// Ej. tablero = crearTablero(10, 2) crea un lista de 20 elementos

// debes esconder los regalos lo mejor quep puedas en el array
// de forma que en una posición del array puede haber un regalo ("🎁") o vacío ("⬜")

// en la lista deben estar todos los regalos
// Ej. tablero = crearTablero(10, 2) añadirá 20 elementos, 10 serán regalos "🎁" y 10 estarán vacíos "⬜"
// tablero contendrá algo como [⬜,🎁,⬜,⬜,🎁,⬜,🎁,🎁,⬜,🎁,⬜,🎁,⬜,⬜,🎁,🎁,⬜,🎁,⬜,🎁]

// 🟢 Una función buscarRegalo(tablero, posicion)

// que retorne 1 si hay un regalo (🎁) en la posición del tablero y 0 si no hay nada (⬜)

// 🟢 Una función hacerIntento(tablero, posicion)

// que retorne 1 si hay un regalo (🎁) en la posición del tablero y 0 si no hay nada (⬜)
// y en cualquier caso sume 1 a los intentos

// 2️⃣ crea una interfaz para el juego que utilice la lógica implementada

// 🟢 poder crear un tablero del tamaño deseado
// 🟢 poder buscar los regalos
// 🟢 poder establecer un máximo de intentos
// 🟢 si alcanzas el máximo de intentos antes de encontrar todos los regalos, pierdes
// 🟢 poder reiniciar el juego
// 🟢 tener un marcador de puntuacion con localStorage
// que guarde en una lista el nombre de jugador/a, intentos, tamaño del tablero, dificultad y resultado al finalizar

// 3️⃣ conviértelo en un juego de memoria

// utiliza la función setTimeout()
// para dejar al usuario que vea dónde están los regalos durante unos instantes
// y luego ocultar los regalos

let tablero = []
let intentos = 0;

//Crear tablero
function crearTablero(numeroRegalos, dificultad) {
    const lado = numeroRegalos * dificultad;
    const regalos = Array(numeroRegalos).fill("🎁");
    const vacios = Array(lado * lado - numeroRegalos).fill("⬜");
    const simbolos = regalos.concat(vacios);
    let linea = "";

    for (let i = 1; i <= lado; i++) {
        for (let j = 1; j <= lado; j++) {
            const indice = Math.floor(Math.random() * simbolos.length);
            linea += simbolos[indice];
            simbolos.splice(indice, 1);
        }
        linea += "\n";
    }
    console.log(linea);
}

//Buscar regalos
function buscarRegalo(tablero, posicion) {
    for (let i = 0; i < tablero.length; i++) {
        if (tablero[i] == "🎁") {
            return 1;
        } else if (tablero[i] == "⬜") {
            return 0;
        }
    }
};

//Intentos
function hacerIntento(tablero, posicion) {
    for (let i = 0; i < tablero.length; i++) {
        if (tablero[i] == "🎁") {
            return 1;
        } else if (tablero[i] == "⬜") {
            intentos++;
            return 0;
        }
    }
};

//Interacción "Crear tabla" con parametros de formulario
let gameForm = document.querySelector("#game-form");
gameForm.addEventListener("submit", function (event) {
    event.preventDefault();

    let inputSize = document.querySelector("#boardSize").value;
    let inputRegalos = document.querySelector("#giftsCount").value;

    crearTablero(parseInt(inputRegalos), parseInt(inputSize));
});

//Interacción "Crear tabla" con parametros de formulario
// let gameForm2 = document.querySelector("#game-form");
// gameForm2.addEventListener("submit", function (event) {
//     event.preventDefault();

//     let inputSize = document.querySelector("#boardSize").value;
//     let inputRegalos = document.querySelector("#giftsCount").value;

//     crearTablero(inputRegalos, inputSize);
// });