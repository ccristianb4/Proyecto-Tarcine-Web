package com.software.ingeneria.tarcine.modelo;
import java.sql.*;

public class UsuarioCrud implements Validar{
	Connection con;
	ConexionSQLServer base = new ConexionSQLServer();
	PreparedStatement ps;
	ResultSet rs;
	int resultado = 0;
	@Override
	public int validar(Usuario usu) {
		String sql = "SELECT * FROM Registro_usuario WHERE Username=? AND Pasword=?";
		try {
			con = base.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, usu.getUserName());
			ps.setString(2, usu.getPassword());
			rs = ps.executeQuery();
			while(rs.next()) {
				resultado += 1;
				usu.setUserName(rs.getString("Username"));
				usu.setPassword(rs.getString("Pasword"));
			}
			if(resultado >= 1) {
				return 1;
			}else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}
}
