const frutas = ["fresa", "plátano", "tomate", "naranja", "mandarina", "limón", "pera", "kiwi", "manzana", "sandía"];
console.log({ frutas });

//Obtener tamaño de elemento
const tamanoFruta = frutas.length;
console.log({ tamanoFruta });

//Seleccion 3ra posicion en array
const tomate = frutas[2];
console.log({ tomate });

//Recorrer array imprimiendo cada elemento en un parrafo
let i = 0;
while (i < tamanoFruta) {
    document.write(`<p>${frutas[i]}</p>`);
    i++;
}

//añadir contenido al array
frutas.push("melón");