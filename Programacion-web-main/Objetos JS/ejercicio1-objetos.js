// crear objeto frutas
// console.log(frutas["manzana"]) = 10
// console.log(frutas["platano"]) = 22

let frutaObjeto = {
    manzana: 10,
    platano: 22,
    naranja: 4,
    sandia: 15,
}

// console.log(frutaObjeto["manzana"]);
// console.log(frutaObjeto["platano"]);

let frutaObjeto2 = {
    manzana: {
        cantidad: 12,
        precio: 0.50,
        nombre: "Manzana",
    },
    platano: {
        cantidad: 22,
        precio: 0.7,
        nombre: "Platano",
    }, 
    naranja: {
        cantidad: 4,
        precio: 0.4,
        nombre: "Naranja",
    }, 
    sandia: {
        cantidad: 15,
        precio: 1.20,
        nombre: "Sandia",
    },
}

let cantidadManzanas = frutaObjeto2["manzana"]["cantidad"];
let manzana = frutaObjeto2["manzana"];
let mismaCantidadManzanas = manzana["cantidad"];
mismaCantidadManzanas = manzana.cantidad;

// console.log({ manzana }, { cantidadManzanas }, { mismaCantidadManzanas });


// mostrar precio de las manzanas
// como un String incluyendo el simbolo de €
// manzanas: 0.50 €

// let precioManzanas = frutaObjeto2["precio"];
// let precioManzanaFormato = precioManzanas.toFixed(2)
// let precioManzanaSimbolo = precioManzanaFormato + "€";

// console.log(`${frutaObjeto2["manzana"].nombre}:${frutaObjeto2["manzana"].precio}`);


//Funciona mostrar precio de la fruta

let precioManzanas = manzana["precio"];
let nombreManzanas = manzana["nombre"];

function buscarFruta(frutaObjeto2) {
    let tmpNombre = frutaObjeto2.nombre;
    let tmpPrecio = frutaObjeto2.precio;
    console.log(`${tmpNombre}:${tmpPrecio} €`);
}


buscarFruta(frutaObjeto2.platano);
buscarFruta(frutaObjeto2.manzana);
buscarFruta(frutaObjeto2.sandia);


// Funciona sumar el precio de la fruta en stock            
function sumarPrecioFrutaEnStock(frutas, fruta) {
    if (frutas[fruta] && frutas[fruta].cantidad > 0) {
      let precioTotal = frutas[fruta].precio * frutas[fruta].cantidad;
      return precioTotal;
    } else {
      return 0;
    }
  }
  
  let frutaSeleccionada = "sandia";
  let precioTotalFrutaEnStock = sumarPrecioFrutaEnStock(frutaObjeto2, frutaSeleccionada);
  console.log(`El precio total de ${frutaSeleccionada} en stock es: ${precioTotalFrutaEnStock}`);