function hey() {
    console.log("hey - is Function");
}
hey();

console.log("----------------------------");

function func(x, y){
    let z = x + y;
    console.log("Value of z is : " + z);
}
func(25, 10);

console.log("----------------------------");

function lobby(a = 3, b = 3){
    let c = a + b;
    console.log("Value of c is : " + c);
}
lobby();

console.log("----------------------------");

function ch(u = 45, v = 25){
    let w = u + v;
    console.log("Value of w is : " + w);
}
ch(21, 22);