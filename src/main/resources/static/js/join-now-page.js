
function validate() {



  var regEmail = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

  var regPhone = /^\d{10}$/;

  var name = document.forms["form1"]["Name"].value;
  var password = document.forms["form1"]["psw"].value;
  var Email = document.forms["form1"]["Emailid"];
  var Contact = document.forms["form1"]["contactmobi"].value

  var cnf_password = document.forms["form1"]["cfpsw"].value;
  var zipy = document.forms["form1"]["zipy"].value

  if (name == null || name == "") {
    alert("Name can't be blank");
    return false;
  } else if (password.length < 8) {
    alert("Password must be at least 8 characters long.");
    return false;
  }
  else if (Email.value.indexOf("@", 0) < 0 || Email.value.indexOf(".", 0) < 0) {
    alert("Please enter valid email address")
    return false;
  }
  else if (!regPhone.test(Contact)) {
    alert("Invalid mobile number please enter valid mobile number")
    return false;
  }
  else if (cnf_password.value != password.value) {
    alert("Confirm password not matching")
    return false;
  }
  else if (zipy.value < 6) {
    alert("Invalid zipcode enter code properly")
    return false;
  }
  return true;
}
function matchPassword() {
  var pw1 = document.getElementById("inputpsw");
  var pw2 = document.getElementById("inputpsw1");
  if (pw1 != pw2) {
    alert("Passwords did not match");
  } else {
    alert("Password created successfully");
  }
}




function validate_password() {

  var pass = document.getElementById('inputpsw').value;
  var confirm_pass = document.getElementById('inputpsw1').value;
  if (pass != confirm_pass) {
    document.getElementById('wrong_pass_alert').style.color = 'red';
    document.getElementById('wrong_pass_alert').innerHTML
      = '☒ Use same password';
    document.getElementById('create').disabled = true;
    document.getElementById('create').style.opacity = (0.4);
  } else {
    document.getElementById('wrong_pass_alert').style.color = 'green';
    document.getElementById('wrong_pass_alert').innerHTML =
      '🗹 Password Matched';
    document.getElementById('create').disabled = false;
    document.getElementById('create').style.opacity = (1);
  }
}


function wrong_pass_alert() {
  if (document.getElementById('inputpsw').value != "" &&
    document.getElementById('inputpsw1').value != "" && document.getElementById('NameInput').value != "" && document.getElementById('inputEmail4').value != "" && document.getElementById('inputmobile').value != "" && document.getElementById('country').value != "" &&  document.getElementById('state').value != "" &&  document.getElementById('city').value != "" &&  document.getElementById('inputAddress').value != "" && document.getElementById('inputZip').value != "") {
    alert("Details has been submitted successfully");
  } else {
    alert("Please fill all the fields");
  }
}