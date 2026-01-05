for (let x = 1; x <= 10; x++){
    console.log(x);
}

console.log("---------------------");

for (let y = 1; y <= 10; y++){
    console.log(y * 2);
}

console.log("----------------------------------");

const prompt = require('prompt-sync')();
let num = parseInt(prompt("Enter any number to print its table : "));

for (let z = 1; z <= 10; z++){
    console.log(z * num);
}

console.log("----------------------------------");

for (let w = 100; w >= 1; w--){
    console.log(w);
}

console.log("----------------------------------");
