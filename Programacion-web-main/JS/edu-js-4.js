let array = [1, 2, 3, 4, 5];
let pares = 0;

for (let i = 0; i < array.length; i++) {
    if (array[i] % 2 == 0) {
        pares++;
    }
}

console.log(pares);