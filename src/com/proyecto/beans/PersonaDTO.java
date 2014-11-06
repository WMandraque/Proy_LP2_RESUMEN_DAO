package com.proyecto.beans;

import java.util.Date;

public class PersonaDTO {
	
	
	//Atributos de la clase UsuarioDAO
	
	protected String usuario;
	protected String clave;
	protected String nombre;
	protected String apellido;
	
	
	
	public PersonaDTO(String usuario, String clave, String nombre, String apellido) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
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


}
