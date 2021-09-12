<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Login Tarcine</title>
    <link rel="stylesheet" href="estiloLogin.css">
  </head>
  <body>

    <div class="login-box">
      <img src="RecursosWeb/logo.jpg" class="avatar" alt="Avatar Image">
      <h1>Login Tarcine</h1>
      <form>
        <!-- USERNAME INPUT -->
        <label for="username">UserName</label>
        <input type="text" placeholder="Enter Username">
        <!-- PASSWORD INPUT -->
        <label for="password">Password</label>
        <input type="password" placeholder="Enter Password">
        <input type="submit" value="Log In">
        <a href="#">Olvidé mi contraseña</a><br>
        <a href="#">no tengo una cuenta</a>
      </form>
    </div>
  </body>
</html>
