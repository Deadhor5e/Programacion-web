let array = [1, 2, 2, 3, 4, 4, 5];
let tmpArray = [];
let duplicados= [];

for (i = 0; i < array.length; i++) {
    if (array[i + 1] == array[i]) {
        duplicados.push(array[i]);
    }
}

//DEBERIA FUNCIONAR//