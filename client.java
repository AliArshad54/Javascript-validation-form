<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login form</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="Ali.css">
</head>
<script type="text/javascript">
    function login(){
    var email=document.getElementById("Email").value;
    var password=document.getElementById("Password").value;
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if(email==''){
        alert("Please enter your email with @");
    }else if(password==''){
        alert("Please enter your password");
    }else if(!filter.test(email)){
        alert("Enter valid email id.");
    }else if(password.length='' || password.length<6){
        alert("Password min is 6 and max length is 8.");
    }else{
    alert('Thank You for Login');
    }
}
</script>
<body>
 
<div class="box">
    <h2>Login</h2>
<label for="eml">Email:</label><br>
<input type="email" id="Email" placeholder="Example somenone@gmail.com" required><br><br>
<i class="far fa-envelope"></i>
<label for="pwd">Password:</label><br/>
<input type="password" id="Password" placeholder="Enter your password" required><br><br>
<i class="fas fa-lock"></i>
<input type="checkbox" required>Remember me<br><br>
<button type="Submit"  onclick="login()">Sign In</button><br><br>
<a href="#">Forget Password?</a>
</div>

</body>
</html>
