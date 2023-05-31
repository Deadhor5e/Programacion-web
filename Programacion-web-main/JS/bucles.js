//Estructuras iterativas
let contador = 0;

//0,1,2,3,4,5,6,7,8,9
while(contador <= 10) {
    document.write(`<p>${contador}</p>`);
    contador++;
}

contador = 0;

//1,2,3,4,5,6,7,8,9,10
while(contador <= 10) {
    contador++;
    document.write(`<p>${contador}</p>`);
}

//DO WHILE
let contador1 = 10;

do {
    console.log(contador1);
    contador1++;
   }   while (contador1 < 3);