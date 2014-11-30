package com.proyecto.beans;

public class ProductoDTO {

	String idprod;      
	String descripcion; 
	double precio;		
	boolean estado;
	
	
	
	
	public ProductoDTO(String idprod, String descripcion, double precio,
			boolean estado) {
		super();
		this.idprod = idprod;
		this.descripcion = descripcion;
		this.precio = precio;
		this.estado = estado;
	}
	
	public String getIdprod() {
		return idprod;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setIdprod(String idprod) {
		this.idprod = idprod;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}		
}
