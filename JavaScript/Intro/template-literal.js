//  ES6  : Template Literals  --  (ECMAScript 2015)

let name = "John";
let age = 30;
console.log(`My Name is ${name} and my age is${age}`);


console.log(`hey, 
    "${name}" and 
    I am also "${age}" 
years old!`);


let fname = "Jane";
let lname = "Doe";

function FullName(fname, lname){
    return `${fname} ${lname}`;
}

let userdeatils = `The user ${FullName (fname, lname)} is logged in..!!`;
console.log(userdeatils);