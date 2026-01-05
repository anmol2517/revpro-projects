const arr1 = [10, 20, 30, 40];
const arr2 = [...arr1];

console.log(arr2);     //    Output: [10, 20, 30, 40]
console.log("-------------------------");

const arr3 = [5, 15, 25, 35];
const arr4 = [3, 13, 23, 33];
const combinedArray = [...arr3, ...arr4];

console.log(combinedArray);   //    Output: [5, 15, 25, 35, 3, 13, 23, 33]
console.log("-------------------------");


const arr5 = [11, 21, 31, 41];
const arr6 = [17, 27, 37, 47];
const mergedArr = [...arr5, ...arr6];

console.log(mergedArr);    //    Output: [1, 2, 3, 4, 5, 6]
console.log("-------------------------");

function sum(x, y, z) {
    let s = x + y + z;
    console.log(`Sum is : ${s}`);
}
sum(2, 4, 6);
console.log("-------------------------");

function sum(a, b, c) {
    let k = a + b + c;
    console.log(`Sum is : ${k}`);
}
const arr7 = [12, 14, 16];
sum(...arr7);   //    Output: Sum is : 42
console.log("-------------------------");

