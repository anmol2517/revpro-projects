console.log("-----------Logical AND (&&) Operator-----------");

let x = 25;

console.log((x < 100) && (x > 10));   //   true + true = true
console.log((x < 20) && (x > 50));    //   false + false = false
console.log((x < 30) && (x > 40));    //   true + false = false
console.log((x > 30) && (x < 35));    //   false + true = false

console.log("-----------Logical OR (||) Operator-----------");

let y = 45;

console.log((y < 100) || (y > 10));   //   true + true = true
console.log((y < 20) || (y > 50));    //   false + false = false
console.log((y < 30) || (y > 40));    //   false + true = true
console.log((y > 30) || (y < 35));    //   true + false = true

console.log("-----------Logical NOT (!) Operator-----------");

let z = 55;

console.log(!(z < 100));    //  false
console.log(!(z < 20));     //   true
console.log(!(z < 30));     //   true
console.log(!(z > 30));     //   false

