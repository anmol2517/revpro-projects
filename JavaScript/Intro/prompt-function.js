const prompt = require("prompt-sync")();
let name = prompt("Enter your name : "); 
console.log("hii... " + name);


console.log("--------------------------------------------------");


/*

---  Running Instructions ---

---  When take a user input using prompt-sync module
---  Open your terminal and navigate to the project directory
---  Run the following commands to install prompt-sync and execute the code
---  only string inputs are allowed
---  npm init -y
---  npm install prompt-sync
---  node Intro/prompt-function.js

*/


const prompt1 = require("prompt-sync")();
let x = prompt("Enter the value of x : "); 
let y = prompt("Enter the value of y : "); 

console.log("The value of x is : " + x);
console.log("The value of y is : " + y);

console.log("The sum of x and y is : " + (x + y));   // concatenation of strings

console.log("Data Type of x is : " + typeof(x));
console.log("Data Type of y is : " + typeof(y));


console.log("--------------------------------------------------");


const prompt2 = require("prompt-sync")();
let a = parseInt(prompt("Enter the value of a : ")); 
let b =  parseInt(prompt("Enter the value of b : ")); 

console.log("The value of x is : " + a);
console.log("The value of y is : " + b);

console.log("The sum of a and b is : " + (a + b));   // concatenation of strings

console.log("Data Type of a is : " + typeof(a));
console.log("Data Type of b is : " + typeof(b));
