"use strict";
const users = [
    {
        name: "Baburao Ganpatrao Apte",
        age: 55,
        occupation: "Garage Owner",
        role: "Admin"
    },
    {
        name: "Raju",
        age: 30,
        occupation: "Schemer",
        role: "User"
    },
    {
        name: "Shyam",
        age: 32,
        occupation: "Bank Employee",
        role: "User"
    }
];
const logPerson = (user) => {
    console.log(` - ${user.name}, ${user.age}, ${user.occupation}${user.role ? ` [${user.role}]` : ""}`);
};
users.forEach(logPerson);
