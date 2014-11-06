package com.proyecto.beans;

import java.util.Date;

public class UsuarioDTO extends PersonaDTO {
	
	private Date   facceso;

	public UsuarioDTO(String usuario, String clave, String nombre, String apellido, Date facceso) {
		super(usuario, clave, nombre, apellido);
		
		this.facceso =facceso;
	}

	public Date getFacceso() {
		return facceso;
	}

	public void setFacceso(Date facceso) {
		this.facceso = facceso;
	}
	
	

}
