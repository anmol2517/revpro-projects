interface ApiSuccess<T> {
  status: number;
  data: T;
}

interface ApiError {
  status: number;
  message: string;
}

type ApiResponse<T> = ApiSuccess<T> | ApiError;

class Animal {
  name: string;
  constructor(name: string) {
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

function handleApiResponse<T>(response: ApiResponse<T>): void {
  if ("data" in response) {
    console.log("Success : ", response.data);
  } else {
    console.log("Error : ", response.message);
  }
}

const myDog: Dog = new Dog("kutta / kamina");
myDog.makeSound();

handleApiResponse({ status: 200, data : myDog });
handleApiResponse({ status: 404, message: "Not Found" });


//----------  Exercise 1 — Generic Identity Transformer


function wrap<T>(value: T): T[] {
  return [value];
}


console.log(wrap(5));

console.log(wrap("kaisi ho ?"));


//----------  Exercise 2 — Generic Key Extractor


function getProperty<T, K extends keyof T>(obj: T, key: K): T[K] {
  return obj[key];
}


const user = { id: 1, name: "Shivani" };
console.log(getProperty(user, "name"));
console.log(getProperty(user, "id"));
