function sum() {
  console.log(arguments);
}

sum(1, 2, 3); // Logs: [Arguments] { '0': 1, '1': 2, '2': 3 }
sum(4, 5);    // Logs: [Arguments] { '0': 4, '1': 5 }

console.log('--------------------------------------------------------');


function sum(fname, ...args) {
    let sum = 0;

    for (let i in args){
        sum += sum+args[i];
    }
    console.log(`${fname} : ${sum}`);
}

sum('John', 11, 12, 13); // fname = 'John', args = [11, 12, 13]
sum('Doe', 21, 22);      // fname = 'Doe', args = [21, 22]
