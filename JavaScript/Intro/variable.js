var x = 25;
console.log("First : " + x);

{
    let x = 50;
    console.log("Second : " + x);
}

console.log("Third : " + x);
console.log(typeof x);

let y = "Hello, Universe!";   //  'Hello, Universe!' - also correct
console.log(typeof y);

let x1 = "aum" +10; 
let y1 = "20"
let z1 = x1 + y1;
console.log(z1);
console.log(typeof z1);
console.log(x1);

let a = "vs code" + 10;
let  b = 20 + 10 + "code";
console.log(a);
console.log(b); 

let w;
console.log(typeof w);

let t = true;
console.log(typeof t);

let city = ['New York', 'London', 'Washington'];
console.log(typeof city);

let h = BigInt(1234567890123456789012345678901234567890);
console.log(typeof h);

var s = 11;
var s = 21;
console.log(s);    // var allows redeclaration last value prints

let m = 55;
console.log(m);

m = "technology";
console.log(m);   // let does not allow redeclaration but allows reassignment