package com.proyecto.beans;

import java.util.Date;

public class VentaDTO {
	
	private int   numvta;   
	private Date  facceso; 
	private String vendedor; 
	private double monto; 
	
	public VentaDTO(int numvta, Date facceso, String vendedor, double monto) {
		super();
		this.numvta = numvta;
		this.facceso = facceso;
		this.vendedor = vendedor;
		this.monto = monto;
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

	public double getMonto() {
		return monto;
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

	public void setMonto(double monto) {
		this.monto = monto;
	} 	
	
	

}
