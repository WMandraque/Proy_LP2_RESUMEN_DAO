package com.proyecto.beans;

import java.util.Date;

public class UsuarioDTO {
	
	
	//Atributos de la clase UsuarioDAO
	
	private String usuario;
	private String clave;
	private String nombre;
	private String apellido;
	private Date   facceso;
	
	
	public UsuarioDTO(String usuario, String clave, String nombre, String apellido, Date facceso) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
		this.facceso = facceso;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
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


	public Date getFacceso() {
		return facceso;
	}


	public void setFacceso(Date facceso) {
		this.facceso = facceso;
	}
	
	
	

}
