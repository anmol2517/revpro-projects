const prompt = require("prompt-sync")();

let char = prompt("Enter char : "); 



switch(char)
{
    case 'a': case 'e': case 'i': case 'o': case 'u':
        console.log(char + " : is vowels");
        break;

    default:
        console.log(char + " : is not vowels.... (INVALID)");
        break;
}


/*
switch(char)
{
    case 'a':
        console.log(char + " : is vowels");
        break;

    case 'e':
        console.log(char + " : is vowels");
        break;

    case 'i':
        console.log(char + ": is vowels");       
        break;

    case 'o':
        console.log(char + " : is vowels");        
        break;

    case 'u':
        console.log(char + " : is vowels");
        break;

    default:
        console.log(char + " : is not vowels.... (INVALID)");
        break;
}
*/
