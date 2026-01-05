function validate(){

    document.getElementById("fnameError").innerHTML ="";
    document.getElementById("lnameError").innerHTML ="";
    document.getElementById("emailError").innerHTML ="";

    document.getElementById("passError").innerHTML ="";
    document.getElementById("genderError").innerHTML ="";
    document.getElementById("skillError").innerHTML ="";
    document.getElementById("cityError").innerHTML ="";
    
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var email = document.getElementById("email").value;
    var pass = document.getElementById("password").value;
    

    var gender = document.querySelector('input[name="gen"]:checked');
    var skills = document.querySelectorAll('input[name="skill"]:checked');
    var city = document.getElementById("city").value;

    
    //  First Name Validation


    if (fname == "" ){
        document.getElementById("fnameError").innerHTML = "First Name is required";
        return false;
    }


    //  Last Name Validation


    if (lname == "" ){
        document.getElementById("lnameError").innerHTML = "Last Name is required";
        return false;
    }


    //  Email Validation


    if (email == "" ){
        document.getElementById("emailError").innerHTML = "Email is required";
        return false;
    }

    
    //  Password Validation


    if (pass == "" ){
        document.getElementById("passError").innerHTML = "Password is required";
        return false;
    }


    //  Gender Validation


    if (!gender){
        document.getElementById("genderError").innerHTML = "Select your gender";
        return false;
    }


    //  Skill Validation


    if (skills.length == 0 ){
        document.getElementById("skillError").innerHTML = "Select atleast one is required";
        return false;
    }


    //  City Validation


    if (city == "" ){
        document.getElementById("cityError").innerHTML = "Select your city";
        return false;
    }
    return true;
}

