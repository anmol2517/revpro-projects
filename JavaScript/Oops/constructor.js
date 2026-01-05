class cons {
    constructor (fname, lname, email, contact, skills){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.contact = contact;
        this.skills = skills;
    }
}
let user1=new cons("Lionel","Messi","messi@gmail.com",9876543210,["HTML","CSS","JS"]);


console.log(`First Name : ${user1.fname}`);
console.log(`Last Name : ${user1.lname}`);
console.log(`Email : ${user1.email}`);
console.log(`Contact : ${user1.contact}`);
console.log(`Skills : ${user1.skills}`);

console.log("-------------------------------");

let user2=new cons("MS","Dhoni","madhi@gmail.com",123567890,["HTML","CSS","JS", "ReactJS"]);


console.log(`First Name : ${user2.fname}`);
console.log(`Last Name : ${user2.lname}`);
console.log(`Email : ${user2.email}`);
console.log(`Contact : ${user2.contact}`);
console.log(`Skills : ${user2.skills}`);

console.log("-------------------------------");


class operates1 {
    add(x , y) {
        return x + y;
    }
}
class operates2 {
    subs(x , y) {
        return x - y;
    }
}
let op1 = new operates1();
op1.add();

let op2 = new operates2();
op2.subs();

console.log(`Addition is : ${op1.add(10, 20)}`);
console.log(`Subtraction is : ${op2.subs(20, 10)}`);