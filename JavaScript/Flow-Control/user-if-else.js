const prompt = require("prompt-sync")();

let num1 = parseInt(prompt("Enter num1 : ")); 
let num2 = parseInt(prompt("Enter num2 : ")); 

let choice = parseInt(prompt("Enter choice : 1. Addition | 2. Subtraction | 3. Multiply | 4. Division : ")); 


if (choice == 1){
    console.log("You Selected Choice 1 : Addition : Your Answer is = " + (num1 + num2));
}

else if (choice == 2){
    console.log("You Selected Choice 2 : Subtraction : Your Answer is = " + (num1 - num2));
}

else if (choice == 3){
    console.log("You Selected Choice 3 : Multiply : Your Answer is = " + (num1 * num2));
}

else if (choice == 4){
    console.log("You Selected Choice 4 : Division : Your Answer is = " + (num1 / num2));
}

else {
    console.log("Invalid Error.....");
}

