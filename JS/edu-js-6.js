function arePositive(array) {
    let array = [1, 2, -3, 4, 5];
    let positivos = true;

    for (i = 0; i < array.length; i++) {
        if (array[i] < 0) {
            positivos = false;
        }
    }
    return positivos;
}

let todosPositivos = arePositive(array);
console.log(todosPositivos);