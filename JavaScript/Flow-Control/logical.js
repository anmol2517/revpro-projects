/*
--  81 to 100 marks -- m >= 81 && m <= 100
--  61 to 80 marks -- m >= 61 && m <= 80
--  41 to 60 marks -- m >= 41 && m <= 60
--  fail
*/

const prompt = require('prompt-sync')();
const marks = parseInt(prompt('Enter Your Marks : '));

if (marks >= 81 && marks <= 100){
    console.log("First Division : " + marks);
}
else if (marks >= 61 && marks <= 80) {
    console.log("Second Division : " + marks);
}
else if (marks >= 41 && marks <= 60) {
    console.log("Third Division : " + marks);
}
else {
    console.log("No Worry , Don't Lose Hope....! : " + marks);
}

console.log("--------------------------------------");

const prompt1 = require('prompt-sync')();
const char = prompt('Enter Character : ');

if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'){
    console.log("Yes, thats correct : Vowels");
}
else {
    console.log("Invalid");
}