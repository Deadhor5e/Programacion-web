//Scope con var
var numero = 1;
console.log("var fuera1", { numero });

{
    console.log("var dentro", { numero });
    var numero = 2;
}

console.log("var fuera2", { numero });

//
//Scope con let
let numero2 = 1;
console.log("let fuera1",{ numero2 });

{
    console.log("let dentro", {numero2});
    let numero2 = 2;
}

console.log("let fuera2", { numero2 });

//
//Scope const
const numeroConstante = 1;

console.log("const fuera1", {numeroConstante});

{
    console.log("const dentro", {numeroConstante});
    const numeroConstante = 2;
}

console.log("const fuera2", {numeroConstante});
