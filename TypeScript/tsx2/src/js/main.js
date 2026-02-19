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
        console.log("Woof, woof!");
    }
}
function handleApiResponse(response) {
    if ("data" in response) {
        console.log("Success:", response.data);
    }
    else {
        console.log("Error:", response.message);
    }
}
const myDog = new Dog("Buddy");
myDog.makeSound();
handleApiResponse({ status: 200, data: myDog });
handleApiResponse({ status: 404, message: "Not Found" });
