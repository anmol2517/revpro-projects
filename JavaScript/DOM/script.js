function hello(){
    var n1 = parseFloat(document.getElementById("n1").value);
    var n2 = parseFloat(document.getElementById("n2").value);

    var ope = document.getElementById("operators").value;

    if (ope == "+"){
        document.getElementById("result").value = n1 + n2;
    }
    if (ope == "-"){
        document.getElementById("result").value = n1 - n2;
    }
    if (ope == "*"){
        document.getElementById("result").value = n1 * n2;
    }
    if (ope == "/"){
        document.getElementById("result").value = n1 / n2;
    }
    
}