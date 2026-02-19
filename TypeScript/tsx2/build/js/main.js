"use strict";
class Animal {
    constructor(name) {
        this.name = name;
    }
    makeSound() {
        console.log("Some generic sound");
    }
}
class Dog extends Animal {
    makeSound() {
        console.log("hehe, hahaha!");
    }
}
function handleApiResponse(response) {
    if ("data" in response) {
        console.log("Success : ", response.data);
    }
    else {
        console.log("Error : ", response.message);
    }
}
const myDog = new Dog("kutta / kamina");
myDog.makeSound();
handleApiResponse({ status: 200, data: myDog });
handleApiResponse({ status: 404, message: "Not Found" });
//----------  Exercise 1 — Generic Identity Transformer
function wrap(value) {
    return [value];
}
console.log(wrap(5));
console.log(wrap("kaisi ho ?"));
//----------  Exercise 2 — Generic Key Extractor
function getProperty(obj, key) {
    return obj[key];
}
const user = { id: 1, name: "Shivani" };
console.log(getProperty(user, "name"));
console.log(getProperty(user, "id"));
