package org.Practica_1_4.proyectoMVC;

import java.io.Serializable;

public class UsuariosDTO implements Serializable{
	
	private String nombre;
	private String apellidos;
	private String email;
	private String clave;
	
	public UsuariosDTO(String nombre, String apellidos, String email, String clave) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.clave = clave;
	}
	
	
	public UsuariosDTO() {
		nombre="";
		apellidos="";
		email="";
		clave="";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}


	public boolean checkAdmin(String usuario2, String passwd) {
		// TODO Auto-generated method stub
		if(usuario2.equalsIgnoreCase("admin") && passwd.equalsIgnoreCase("1234")) {
		return true;
		}
		
		else {return false;}
		
	}
	
	
	
	
	

}