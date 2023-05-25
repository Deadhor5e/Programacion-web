let a = 10;
let b = 2;
let c = 3;
let d = 4;

let sumaAB = a + b;
let sumaCD = c + d;

if (sumaAB > sumaCD) {
    document.write(`<p>${sumaAB} SI es mayor que ${sumaCD}</p>`);
    console.log(`${sumaAB} es mayor que ${sumaCD}`);
}
else if (sumaAB == sumaCD) {
    console.log(`${sumaAB} es IGUAL a ${sumaCD}`);
}
else {
    console.log(`${sumaAB} NO es mayor que ${sumaCD}`);
}