// función printCuadrado(lado){...}

// que recibe un número entero positivo
// y dibuja con un emoji (Ej. 🟥) un cuadrado del tamaño de lado

// ejemplo para "lado = 1"

// 🟥

// ejemplo para "lado = 10"

// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥


function printCuadrado(lado) {
    let linea = "";
    for (let i = 1; i <= lado; i++) {
         for (let j = 1; j <= lado; j++) {
            linea += "🟥";
        };
        linea += "\n";
    }
    return linea;
}

console.log(printCuadrado(10));