//Linea de importación
import { respuestaPokemon } from "./ejemplos-datos/pokemon.js";

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

//10 Pokemon aleatorios


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
let pokeClear = document.querySelector("#bnt-clear");
pokeClear.addEventListener("click", function (event) {
    event.preventDefault();

    limpiarPokemon();
});

