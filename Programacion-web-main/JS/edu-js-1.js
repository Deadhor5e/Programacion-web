let array = [1, 2, 3, 4, 5];
i = 0;

function printArray(arrayToPrint = []) {
    let i = 0;
    while (i < arrayToPrint.length) {
        console.log(arrayToPrint[i]);
        i++;
    }
}

printArray(array);