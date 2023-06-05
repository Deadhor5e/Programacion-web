// Función normal de suma
function sum(a, b) {
  return a + b;
}

console.log(sum(2, 3)); // Salida: 5

// Función anónima de suma
// se suele pasar como argumento a otras funciones (Ej. document.addEventListener)
// o asignarse a una variable para poder utilizarla
const anonymousSum = function (a, b) {
  return a + b;
};

console.log(anonymousSum(2, 3)); // Salida: 5

// Arrow function de suma
// función anónima que no necesita declararse con function
// si solo contiene una instrucción, no necesitas añadir llaves {} o return
// toma el "this" más próximo (lo veremos con Angular)
const arrowSum = (a, b) => a + b;

console.log(arrowSum(2, 3)); // Salida: 5

// Función método de objeto
const persona = {
  name: "Ana",
  age: 24,
  // los métodos de objeto son funciones asignadas a una propiedad del objeto
  sayHello: function () {
    console.log(`Hola, mi nombre es ${this.name} y tengo ${this.age} años.`);
  },
};

// se invocan con objeto.nombreFuncion()
persona.sayHello(); // Salida: 'Hola, mi nombre es Ana y tengo 24 años.'

// Función creadora de Persona
// se invocan con "new" y retornan un objeto con las propiedades declaradas con this
// suelen comenzar en mayúscula, como las Clases (ver abajo)
function Persona(name, age) {
  this.name = name;
  this.age = age;

  this.sayHello = function () {
    console.log(`Hola, mi nombre es ${this.name} y tengo ${this.age} años.`);
  };
}

const person = new Persona("John", 25);
person.sayHello(); // Salida: 'Hola, mi nombre es John y tengo 25 años.'

// métodos de Clase
class Person {
  // el constructor de la clase se utiliza con "new", es una función creadora
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  // método de clase
  sayHello() {
    console.log(`Hola, mi nombre es ${this.name} y tengo ${this.age} años.`);
  }

  // métodos consultores
  // retornan el valor de propiedades del objeto
  // no modifican el objeto
  // comienzan con "get" por convención
  getName() {
    return this.name;
  }

  getAge() {
    return this.age;
  }

  // métodos modificadores
  // cambian  el valor de propiedades del objeto
  // no retornan ningún valor
  // comienzan con "set" por convención
  setName(name) {
    this.name = name;
  }

  setAge(age) {
    this.age = age;
  }
}

// al utilizar new con el nombre de la clase, invocamos a su constructor
const personClass = new Person("Jane", 30);

// personClass es una "instancia" de la "clase" Person. Es decir, un objeto de tipo Person
personClass.sayHello(); // Salida: 'Hola, mi nombre es Jane y tengo 30 años.'
