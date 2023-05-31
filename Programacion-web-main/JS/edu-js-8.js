let array = [1, 2, 3, 4, 5];
let arrayLenght = array.length;
let arrayInvertido = [];
let tmp;

for (i = 0; i < arrayLenght; i++) {
    tmp = array[arrayLenght];
    for (i = 0; i < arrayLenght; i++) {
        arrayInvertido.push(array[tmp]);
        tmp--;
    }
}

console.log({arrayInvertido});

//DEBERIA FUNCIONAR//