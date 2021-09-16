package com.software.ingeneria.tarcine.modelo;
import java.sql.*;

public class UsuarioCrud implements Validar{
	Connection con;
	ConexionSQLServer base = new ConexionSQLServer();;
	PreparedStatement ps;
	ResultSet rs;
	int resultado;
	@Override
	public int validar(Usuario usu) {
		resultado = 0;
		String sql = "SELECT * FROM Registro_usuario;";
		try {
			con = base.getConnection();
			ps = con.prepareStatement(sql);
			//ps.setString(1, usu.getUserName());
			//ps.setString(2, usu.getPassword());
			rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getString(4).trim().equals(usu.getUserName()) && rs.getString(6).trim().equals(usu.getPassword()) ) {
					resultado = 1;
					break;
				}
				//usu.setUserName(rs.getString("Username"));
				//usu.setPassword(rs.getString("Pasword"));
			}
			con.close();
			ps.close();
			rs.close();
			if(resultado == 1) {
				return 1;
			}else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}
}
