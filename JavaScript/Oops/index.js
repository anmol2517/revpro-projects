// Making a Object Oriented Program
class A {
    show() {
        console.log("Its Method");
    }
}
let program = new A();
program.show();

console.log("-----------------------------");


// Making a Object Oriented Program with Parameter
class B {
    add(x , y) {
        let add = x + y;
        console.log(`Sum is : ${add}`);
    }
    subs(x , y) {
        let subs = x - y;
        console.log(`Sum is : ${subs}`);
    }
    multi(x , y) {
        let multi = x * y;
        console.log(`Sum is : ${multi}`);
    }
}
let programs = new B();
programs.add(11, 22);
programs.subs(11, 22);
programs.multi(11, 22);

console.log("---------------------------");


// Constructor Function 
class C {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}
let person1 = new C("anmoL", 23);
console.log(`Name is : ${person1.name} and Age is : ${person1.age}`);

console.log("---------------------------");


// Static Method
class D {
    static greet() {
        console.log("Hello Welcome to Static Method");
    }
}
D.greet();
console.log("---------------------------");