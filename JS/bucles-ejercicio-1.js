let lang = "";

while(!lang || lang.length != 2) {
    lang = prompt("Introduce el código de idioma (Ej. 'ES' para español)");
}

lang = lang.toUpperCase();

switch(lang) {
    case "EN":
        alert("Hello!");
        break;
    case "ES":
        alert("Hola!");
        break;
    case "IT":
        alert("Chiao!");
        break;
    case "FR":
        alert("Bonjoure!");
        break;
    case "JA":
        alert("Kon'nichiwa!");
        break;
    default:
        alert("NOT SUPPORT LANGUAGE");
        break;
}