
    const dietpsg=document.getElementsById('diet1')
    let dietchange=function(){
        dietpsg.style.color='green'
    }
    dietpsg.onmousemove=dietchange

//login Form validation
function validateform(){  
    var name=document.myform.uname.value;  
    var password=document.myform.psw.value;  
      
    if (name==null || name==""){  
      alert("Enter username");  
      return false;  
    }else if(password.length<8){  
      alert("Password must be at least 8 characters long.");  
      password.focus();
      return false;  
      }  
    }  

    //password validation
    var myinput=document.getElementById("psw")
    var letter=document.getElementById("letter")
    var capital=document.getElementById("capital")
    var number=document.getElementById("number")
    var length=document.getElementById("length")

    // When the user clicks on the password field, show the message box
    myinput.onfocus=function(){
      document.getElementById("pswvalid").style.display="block";
    }
    // When the user clicks outside of the password field, hide the message box
    myinput.onblur=function(){
      document.getElementById("pswvalid").style.display="none";
    }

    // When the user starts to type something inside the password field
//validate capital letters
myinput.onkeyup=function(){
  var lowerCaseLetters= /[a-z]/g;

if(myinput.value.match(lowerCaseLetters)){
  letter.classList.remove('invalid');
  letter.classList.add('valid');
}else{
  letter.classList.remove('valid');
  letter.classList.add('invalid')
}
var upperCaseLetters= /[A-Z]/g;

if(myinput.value.match(upperCaseLetters)){
  capital.classList.remove('invalid');
  capital.classList.add('valid');
}else{
  capital.classList.remove('valid');
  capital.classList.add('invalid')
}
//validate number
var numbers= /[0-9]/g;
if(myinput.value.match(numbers)){
  number.classList.remove('invalid')
  number.classList.add('valid')
}else{
  number.classList.remove('valid')
  number.classList.add('invalid')
}
// validate length
if(myinput.value.length>=8){
  length.classList.remove('invalid')
  length.classList.add('valid')
}else{
  length.classList.remove('valid')
  length.classList.add('invalid')
}
var numbers= /[0-9]/g;
if(myinput.value.match(numbers)){
  number.classList.remove('invalid')
  number.classList.add('valid')
}else{
  number.classList.remove('valid')
  number.classList.add('invalid')
}
}

//Show Password
var x=document.getElementById("psw")
function verify(){
    if(x.type==='password'){
        x.type='text'
    }
    else{
        x.type='password';
    }
}

//After clicking login button
// function validateform(){
//   alert("Login successfully")
// }




