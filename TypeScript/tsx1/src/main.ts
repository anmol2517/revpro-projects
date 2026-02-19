interface User {
  name: string;
  age: number;
  occupation: string;
  role?: "Admin" | "User";
}

const users: User[] = [
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

const logPerson = (user: User): void => {
  console.log(` - ${user.name}, ${user.age}, ${user.occupation}${user.role ? ` [${user.role}]` : ""}`);
};

users.forEach(logPerson);