//Objeto con la consulta de la URL
let busqueda = location.search;

//Objeto con funciones para buscar parametros en la consulta
let parametros = new URLSearchParams(busqueda);

// let nombre = parametros.get('nombre');

// console.log({nombre});

let url = parametros.get('url');
console.log({url});

if(url){
    if(url.indexOf("http")===-1 ) {
        url = "http://" + url;
    }
    window.location.href = url;
}

//Navegar a otra URL
// setInterval(() => {
//     window.location.href = "https://youtube.com";
// }, 2000);

