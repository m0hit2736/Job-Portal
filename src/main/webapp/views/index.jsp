<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
h1{text-align: center;
color:red;
}

body{
background-image: url('/img/jp1.jpg');
 background-repeat: no-repeat;
 background-attachment: fixed;
background-size: cover;
background-size: 100% 100%;
}
        .GFG {
            background-color: white;
            border: 2px solid black;
            color: green;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 10px 30px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<h1 >Online Job Portal</h1>


    <button class="GFG" 
    onclick="window.location.href = '/login';">
        Login
    </button>
    <br>
    <button class="GFG" 
    onclick="window.location.href = '/signup';">
        SignUp
    </button>
  
    
</body>
</html>