package com.software.ingeneria.tarcine.modelo;

public class Usuario {
	private int iD;
	private String nombre, apellido, userName, correo, password;
	
	public Usuario() {
		
	}
	public Usuario(int id, String nombre ,String apellido ,String userName, String correo, String password) {
		this.iD = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.userName = userName;
		this.correo = correo;
		this.password = password;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
