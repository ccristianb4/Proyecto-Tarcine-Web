<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>sign in Tarcine</title>
    <link rel="stylesheet" href="Estilos/estiloRegister.css">
  </head>
  <body>
	<img src="RecursosWeb/logo.jpg" class="avatar" alt="Avatar Image">
    <div class="login-box">
      <h1>sign in Tarcine</h1>
      <form action="ControladorRegister" method="post">
      	<label for ="full Name">full Name</label>
      	<input type="text" placeholder="Enter full Name" name="txtName">
        <!-- USERNAME INPUT Confirm password-->
        <label for="username">UserName</label>
        <input type="text" placeholder="Enter Username" name="txtUserName">
        <label for =">Email">email</label>
      	<input type="email" placeholder="Enter email" name="txtemail">
        <!-- PASSWORD INPUT -->
        <label for="password">Password</label>
        <input type="password" placeholder="Enter Password" name="txtpassword">
        <label for="Cpassword">Confirm password</label>
        <input type="password" placeholder="Enter Confirm Password" name="txtCpassword">
        <input type="submit" name="accionRegister" value="sign in">
        <a href="index.jsp">Cancelar</a>
      </form>
    </div>
  </body>
</html>
