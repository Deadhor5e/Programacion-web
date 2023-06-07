//Funcion mostar pokemon en pantalla
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
    // article.appendChild(nombre);

    document.body.appendChild(article);
}

//Funcion buscar pokemon por ID
function getPokemon(id) {
    fetch("https://pokeapi.co/api/v2/pokemon/" + id)
        .then(response => response.json()
            .then(pokemon => {
                console.log(pokemon);
                actualizarPokemon(pokemon);
            }
            )
        );
}

//Funcion limpiar lista de pokemons
function limpiarPokemon() {
    const pokemonCards = document.querySelectorAll(".pokemon-card");
    pokemonCards.forEach(card => {
        card.remove();
    });
}

//Funcion ID Pokemon aleatorio
function getRandomPokedex() {
    return Math.floor(Math.random() * 1010);
};

//Funcion comprobar pokemon
function comprobarPokemon(nombre) {
    fetch("https://pokeapi.co/api/v2/pokemon/" + nombre)
        .then(response => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error("No se encontró el Pokémon");
            }
        })
        .then(pokemon => {
            console.log(pokemon);
            alert("¡Has ganado!");
        })
        .catch(error => {
            console.error(error);
            alert("Pueba otra vez :(");
        });
}

function init() {

    //Interacción con boton "Nuevo Pokemon"
    let nuevoPokemon = document.querySelector("#btn-nuevoPokemon");
    nuevoPokemon.addEventListener("click", function (event) {
        event.preventDefault();

        limpiarPokemon();
        getPokemon(getRandomPokedex());
    });

    //Comprobar nombre de pokemon
    let nombrePokemon = document.querySelector("#btn-nombre");
    nombrePokemon.addEventListener("click", function (event) {
        event.preventDefault();

        let inputNombrePokemon = document.querySelector("#name").value;
        comprobarPokemon(inputNombrePokemon);
    });

    //Limpiar lista pokemon
    let pokeClear = document.querySelector("#btn-clear");
    pokeClear.addEventListener("click", function (event) {
        event.preventDefault();

        limpiarPokemon();
    });

}

init();
