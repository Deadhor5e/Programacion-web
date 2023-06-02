// Objeto que repersente un libro
// Titulo, autor, año publicación, #paginas.

const libro = {
    titulo: "Wuacanda Forever",
    autor: "Juan Perez",
    añoPublicacion: 2020,
    paginas: 230,
}


//Crear lista de libros llamada bibliotecas
//Buscar libros por autor

const bibliotecas = [
    {
        nombre: "JavaScript",
        autor: "Jose",
        añoPublicacion : 1980,
        paginas: 1000,
    },
    {
        nombre: "HTML",
        autor: "Juan",
        añoPublicacion : 2005,
        paginas: 200,
    },
    {
        nombre: "CSS",
        autor: "María",
        añoPublicacion : 2010,
        paginas: 75,
    }   
]


function buscarPorAutor(autor) {
    const librosEncontrados = bibliotecas.filter(libro => libro.autor.toLowerCase() === autor.toLowerCase());
    return librosEncontrados;
}

let autorBuscado ="";
const librosEncontrados = buscarPorAutor(autorBuscado);

if (librosEncontrados.length > 0) {
    console.log(`Libros encontrados del autor ${autorBuscado}:`);
    librosEncontrados.forEach(libro => {
        console.log(`- ${libro.nombre}`);
    });
} else {
    console.log(`No se encontraron libros del autor ${autorBuscado}.`);
}

let loginFor = document.querySelector("#form-autor");
loginFor.addEventListener("submit", function (event) {
    event.preventDefault();

    let inputAutor = document.querySelector("#autor").value;
    let librosPorAutor = buscarPorAutor(inputAutor);
    console.log(librosPorAutor);
});

// console.log(buscarPorAutor("María"));
// console.log(buscarPorAutor("Juan"));

//Funciona para crear libros
function crearLibro(titulo, autor, añoPublicacion, paginas) {
let libro = {
    titulo: titulo,
    autor: autor,
    añoPublicacion: añoPublicacion,
    paginas: paginas,
    };
    return libro;
}

let nuevoLibro = crearLibro("Harry Potter", "JK", 1999, 450);

bibliotecas.push(nuevoLibro);
console.log(bibliotecas);

// Funcion encontrar libro con más páginas
function buscarMasLargo(libros) {
    let libroConMasPaginas = null;
    let maxPaginas = 0;

    for (let i = 0; i < bibliotecas.length; i++) {
        if (bibliotecas[i].paginas > maxPaginas) {
            maxPaginas = bibliotecas[i].paginas;
            libroConMasPaginas = bibliotecas[i];
        }
    }

    return libroConMasPaginas;
}

console.log(buscarMasLargo(bibliotecas));

//Funcion libro mas antiguo
function buscarMasAntiguo(bibliotecas) {
    let libroMasAntiguo = null;
    let añoPublicacionMinimo = Infinity;

    for (let i = 0; i < bibliotecas.length; i++) {
        if (bibliotecas[i].añoPublicacion < añoPublicacionMinimo) {
            añoPublicacionMinimo = bibliotecas[i].añoPublicacion;
            libroMasAntiguo = bibliotecas[i];
        }
    }
    return libroMasAntiguo;
}

let libroMasAntiguo = buscarMasAntiguo(bibliotecas);

if (libroMasAntiguo) {
    console.log(`El libro más antiguo es "${libroMasAntiguo.titulo}" publicado en ${libroMasAntiguo.añoPublicacion}.`);
} else {
    console.log("No se encontró ningún libro en la biblioteca.");
}

console.log(buscarMasAntiguo(bibliotecas));



//JSON - COnvertir de JS a JSON
let bibliotecaJSON = JSON.stringify(bibliotecas);

let bibliotecaJSON2 = JSON.parse(bibliotecaJSON);

console.log( {bibliotecaJSON} );
console.log( {bibliotecaJSON2} );

// Guardar información en el navegador
localStorage.setItem("bibliotecas", bibliotecaJSON);

// Leer información del navegador
let bibliotecaGuardada = localStorage.getItem("bibliotecas");
bibliotecas = JSON.parse(bibliotecaGuardada);

//Vacia todo localStorage
localStorage.clear();