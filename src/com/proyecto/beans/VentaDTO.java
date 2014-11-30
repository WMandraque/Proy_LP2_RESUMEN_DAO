package com.proyecto.beans;

import java.util.Date;

public class VentaDTO {
	
	private int   numvta;   
	private Date  facceso; 
	private String vendedor; 
	
	public VentaDTO(int numvta, Date facceso, String vendedor) {
		super();
		this.numvta = numvta;
		this.facceso = facceso;
		this.vendedor = vendedor;
	}

	public int getNumvta() {
		return numvta;
	}

	public Date getFacceso() {
		return facceso;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setNumvta(int numvta) {
		this.numvta = numvta;
	}

	public void setFacceso(Date facceso) {
		this.facceso = facceso;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}


	

}
