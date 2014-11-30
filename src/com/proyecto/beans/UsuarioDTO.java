package com.proyecto.beans;

import java.util.Date;

public class UsuarioDTO extends PersonaDTO {
	
	private Date   facceso;
	private int    estado;
	
	public UsuarioDTO(String usuario, String clave, String nombre,
			String apellido, Date facceso, int estado) {
		super(usuario, clave, nombre, apellido);
		this.facceso = facceso;
		this.estado = estado;
	}

	public Date getFacceso() {
		return facceso;
	}

	public int getEstado() {
		return estado;
	}

	public void setFacceso(Date facceso) {
		this.facceso = facceso;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}


	
	

}
