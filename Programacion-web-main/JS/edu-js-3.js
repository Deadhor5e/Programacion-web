let array = [5, 2, 9, 1, 7];
let mayor = 0;

for (let i = 0; i < array.length; i++) {
    if (array[i] > mayor) {
        mayor = array[i];
    };
}

console.log(mayor);