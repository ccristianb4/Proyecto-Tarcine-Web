<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Login Tarcine</title>
    <link rel="stylesheet" href="Estilos/estiloLogin.css">
  </head>
  <body>

    <div class="login-box">
      <img src="RecursosWeb/logo.jpg" class="avatar" alt="Avatar Image">
      <h1>Login Tarcine</h1>
      <form action="ControladorLogin" method="post">
        <!-- USERNAME INPUT -->
        <label for="username">UserName</label>
        <input type="text" placeholder="Enter Username" name="txtUser">
        <!-- PASSWORD INPUT -->
        <label for="password">Password</label>
        <input type="password" placeholder="Enter Password" name="txtpass">
        <input type="submit" name="accion" value="Log In">
        <a href="#">Olvid? mi contrase?a</a><br>
        <a href="RegisterTarcine.jsp">no tengo una cuenta</a>
      </form>
    </div>
  </body>
</html>
