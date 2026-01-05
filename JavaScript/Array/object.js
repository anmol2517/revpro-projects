var employee = {
    fnamae: 'anmol',
    lname: 'kumar',
    email: 'kumar.anmol@gmail.com',
    salary: function () {
        return 35000;
    },
    fullName: function () {
        return this.fname + " " + this.lname;
    },
};

console.log(employee.salary());
console.log(employee);