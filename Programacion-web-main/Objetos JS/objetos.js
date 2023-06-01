// Las claves son únicas
let ejemploObjeto = {
    clave: "valor",
    clave2: 12,
    1: "texto",
}

// acceder a los valores "como si fuera un array"
let valorDeClave = ejemploObjeto["clave"];
let valorDeClave2 = ejemploObjeto["clave2"];
let valorDeUno = ejemploObjeto["1"];

console.log( {valorDeClave} ) // "valor"
console.log( {valorDeClave2} ) // 12
console.log( {valorDeUno} ) // "texto"

// Solo para claves de tipo String o "texto"
let otroValorDeClave = ejemploObjeto.clave; // "valor"
let otroValorDeClave2 = ejemploObjeto.clave2; // 12
let otroValorDeUno = ejemploObjeto[1]; // "texto"

//actualizar valores
ejemploObjeto["clave"] = "otro valor";
ejemploObjeto["clave2"] = 21;
ejemploObjeto[1] = "otro texto";

ejemploObjeto.clave = "otro valor más";

//añadir nuevas claves
ejemploObjeto["nombre"] = "Juana";