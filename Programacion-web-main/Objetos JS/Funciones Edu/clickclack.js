// función clickClack(limit){...}

// que reciba un numero entero positivo llamado "limit"
// e imprima para cada número entre 1 y limit:

// - Si el número es divisible entre 5: "Click"
// - Si el número es divisible entre 3: "Clack"
// - Si es divisible entre 5 y entre 3: "ClickClack"
// - Si no es divisible entre 5 ni entre 3: el número tal cual

// Ejemplo de salida para "limit = 15"
// 1
// 2
// Clack
// 4
// Click
// Clack
// 7
// 8
// Clack
// Click
// 11
// Clack
// 13
// 14
// ClickClack


function clickClack(limit) {
    for (let i = 1; i <= limit; i++) {
        if (i % 5 === 0 && i % 3 === 0) {
            console.log("ClickClack");
        }
        else if (i % 5 === 0) {
            console.log("Click");
        }
        else if (i % 3 === 0) {
            console.log("Clack");
        }
        else {
            console.log(i);
        }
    }
}

clickClack(15);