package com.software.ingeneria.tarcine.modelo;
import java.sql.*;

public class ConexionSQLServer {
	Connection con;
	public Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
				+"database=Tarcine;"+"user=sa;"+"password=123456;"+"loginTimeout=40;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
