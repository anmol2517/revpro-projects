function greet(name: string) {
  return `Hello, ${name}`;
}



function runTwice(f: Function, arg: string) {
  f(arg);
  return f(arg);    
}



console.log(runTwice(greet, "Bob"));


/*

--  this is return the result so console.log works properly

--  runTwice function calls f(arg) twice but doesn't have a return statement

--  inside runTwice strings returned by greet Hello, Bob are simply ignored

*/