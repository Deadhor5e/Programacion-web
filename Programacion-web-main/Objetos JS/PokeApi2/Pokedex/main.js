//Linea de importación
import { respuestaPokemon } from "../ejemplos-datos/pokemon.js";

//Funcion listado de 10 pokemon
function actualizarPokemon(pokemon) {
    const article = document.createElement("article");
    article.classList.add("pokemon-card");

    const imagen = document.createElement("img");
    imagen.classList.add("imagen-pokemon");
    imagen.alt = "Imagen del pokemon";
    imagen.src = pokemon.sprites.front_default;

    const nombre = document.createElement("h2");
    nombre.classList.add("nombre-pokemon");
    nombre.textContent = pokemon.name;

    article.appendChild(imagen);
    article.appendChild(nombre);

    document.body.appendChild(article);
}

//Funcion para realiza la funcion GET utilizando la funcion fetch
function getPokemon(id) {
        fetch("https://pokeapi.co/api/v2/pokemon/" + id )
            .then(response => response.json()
                .then(pokemon => {
                    console.log(pokemon);
                    actualizarPokemon(pokemon);
                }
                )
            );
}

//Funcion retorna un numero 1-1010
function getRandomPokedex() {
    return Math.floor(Math.random() * 1010);
};

//Limpiar lista de pokemons
function limpiarPokemon() {
    const pokemonCards = document.querySelectorAll(".pokemon-card");
    pokemonCards.forEach(card => {
        card.remove();
    });
}

//Se carga al iniciar la pagina
function init() {

    let busqueda = location.search;
    let parametros = new URLSearchParams(busqueda);
    let url = parametros.get('url');

    let idPokemon = parametros.get('id');
    getPokemon(idPokemon);


//Recargar petición
let pokeRecarga = document.querySelector("#btn");
pokeRecarga.addEventListener("click", function (event) {
    event.preventDefault();

    limpiarPokemon();
    for (let i = 1; i <= 10; i++) {
        getPokemon(getRandomPokedex());
    }
});

//Buscar pokemon por ID
let pokeID = document.querySelector("#btn-id");
pokeID.addEventListener("click", function (event) {
    event.preventDefault();

    let inputPokeID = document.querySelector("#busqueda-id").value;
    getPokemon(inputPokeID);
});

//Limpiar lista pokemon
let pokeClear = document.querySelector("#btn-clear");
pokeClear.addEventListener("click", function (event) {
    event.preventDefault();

    limpiarPokemon();
});

//Siguiente
let pokeSiguiente = document.querySelector("#btn-siguiente");
pokeSiguiente.addEventListener("click", function (event) {
    event.preventDefault();

    limpiarPokemon();
    let siguienteID = parseInt(document.querySelector("#busqueda-id").value);
    siguienteID++;
    getPokemon(siguienteID);
    document.querySelector("#busqueda-id").value = siguienteID;
});

//Anterior
let pokeAnterior = document.querySelector("#btn-anterior");
pokeAnterior.addEventListener("click", function (event) {
    event.preventDefault();

    limpiarPokemon();
    let anteriorID = (document.querySelector("#busqueda-id").value);
    anteriorID--;
    getPokemon(anteriorID);
    document.querySelector("#busqueda-id").value = anteriorID;
});

let pokeLista = document.querySelector("#btn-listado");
pokeLista.addEventListener("click", function (event) {
    event.preventDefault();

    window.location.href = "pokedex.html";
});

let pokeJuego = document.querySelector("#btn-adivina");
pokeJuego.addEventListener("click", function (event) {
    event.preventDefault();

    window.location.href = "Adivina-el-pokemon/adivina-el-pokemon.html";
});

}

init();