// Cargar campeones ya guardadas
// Guardar campeones
// Borrar campeon

const champions = [
    {
        name: "Riven",
        position: "Top",
        release: 2010,
    },
    {
        name: "Thresh",
        position: "Support",
        release: 2015,
    },
    {
        name: "Kog'Maw",
        position: "Bot",
        release: 2007,
    },
    {
        name: "Orianna",
        position: "Mid",
        release: 2009,
    },
    {
        name: "Lee Sin",
        position: "Jungler",
        release: 2005,
    },
];

// Interacción con el formulario [GUARDAR]
let formChampions = document.querySelector("#form-champions");
formChampions.addEventListener("#submit", function (event) {
    event.preventDefault();

    let inputName = document.querySelector("#champions-name").value;
    let inputPosition = document.querySelector("#champions-position").value;
    let inputRelease = document.querySelector("#champions-release").value;

    saveNewChampion(inputName, inputPosition, inputRelease);
});

// Guardado en local
// let championsJSON = JSON.stringify(champions);
// localStorage.setItem("champions", championsJSON);

let championsSaveLocal = localStorage.getItem("champions");
let championsArray = JSON.parse(championsSaveLocal) || [];

// Guardar nuevo campeon
function saveNewChampion(name, position, release) {
    let newChampion = {
        name: name,
        position: position,
        release: release,
    };
    championsArray.push(newChampion);

    let championsJSON = JSON.stringify(championsArray);
    localStorage.setItem("champions", championsJSON);
    alert("¡Campeón guardado!");
}

// Borrar campeon [BORRAR]
formChampions = document.querySelector("#form-champions");
formChampions.addEventListener("#delte", function (event) {
    event.preventDefault();

    inputName = document.querySelector("#champions-name").value;
    inputPosition = document.querySelector("#champions-position").value;
    inputRelease = document.querySelector("#champions-release").value;

    // delteNewChampion(inputName, inputPosition, inputRelease);
});

championsSaveLocal = localStorage.getItem("champions");
championsArray = JSON.parse(championsSaveLocal) || [];

//Borrar campeon (funcion)
function saveNewChampion(name, position, release) {
    let newChampion = {
        name: name,
        position: position,
        release: release,
    };
    championsArray.push(newChampion);

    let championsJSON = JSON.stringify(championsArray);
    localStorage.setItem("champions", championsJSON);
    alert("¡Campeón borrado!");
}