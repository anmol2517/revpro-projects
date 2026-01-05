let place = "Gurugram";
console.log(place);

console.log("-------------------------------------");

let country = ["India , Russia , Isarel , Argentina"];
console.log(country);
console.log(typeof country);

console.log("-------------------------------------");

const city = new Array();
city[0] = "Noida";
city[1] = "New Delhi";
city[2] = "Odisha";
city[3] = "Pune";
city[4] = "Bangalore";

console.log(city [1]);
console.log(city);

console.log("-------------------------------------");

const mp = new Array("ABC", "PQR", "XYZ");
console.log(mp);
console.log(mp[2]);

let len1 = mp.length;
console.log("Length of the Array is : " + len1);

console.log("-------------------------------------");

const usa_city = ["New York", "Los Angeles", "Phoenix", "San Diego", 25, true];
let len2 = usa_city.length;
let uc = usa_city.at(4);

console.log("Length of the Array is : " + len2);
console.log(usa_city[3]);
console.log(uc);

console.log("-------------------------------------");

const player = ["Lioel Messi", "Sunil Chhetri", " Cristiano Ronaldo", "Zlatan Ibrahimovic", "Neymar Jr", "Sergio Ramos"];
let club = player.indexOf("Zlatan Ibrahimovic");
console.log(club);

console.log("-------------------------------------");

const sports = [];   // Empty Array
console.log(sports);