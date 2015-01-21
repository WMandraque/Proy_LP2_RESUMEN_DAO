package com.proyecto.beans;

import java.util.Date;

public class VentaDTO {
	
	
	//Segun el profe aqui puede ir mas datos
	private int   numvta;   
	private Date  facceso; 
	private String vendedor;
	private String idProducto;
	private int    cantidad;
	private double precio;
	private String desProd;
	
	
	
	
	public String getDesProd() {
		return desProd;
	}


	public void setDesProd(String desProd) {
		this.desProd = desProd;
	}


	public VentaDTO() {
		super();
	}


	public VentaDTO(int numvta, Date facceso, String vendedor) {
		super();
		this.numvta = numvta;
		this.facceso = facceso;
		this.vendedor = vendedor;
	}
	
	
	public VentaDTO(String vendedor, String idProducto, int cantidad, double precio) {
		super();
		this.vendedor = vendedor;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.precio = precio;
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


	public String getIdProducto() {
		return idProducto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public double getPrecio() {
		return precio;
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


	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	


	

}
