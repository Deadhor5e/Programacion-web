const variable1 = 1;
const variable2 = 2;
const variable3 = 23;

if (variable1>variable2&&variable1>variable3) {
    document.write(`<p>Lista de numeros: ${variable1}, ${variable2}, ${variable3}.</p>`);
    document.write(`<p>${variable1} Es el numero más alto</p>`);
}

else if (variable2>variable1&&variable2>variable3) {
    document.write(`<p>Lista de numeros: ${variable1}, ${variable2}, ${variable3}.</p>`);
    document.write(`<p>${variable2} Es el numero más alto</p>`);
}

else if  (variable3>variable1&&variable3>variable1) {
    document.write(`<p>Lista de numeros: ${variable1}, ${variable2}, ${variable3}.</p>`);
    document.write(`<p>${variable3} Es el numero más alto</p>`); 
}

else {
    document.write(`<p>Lista de numeros: ${variable1}, ${variable2}, ${variable3}.</p>`);
    document.write(`<p>Los numeros son iguales</p>`); 
}