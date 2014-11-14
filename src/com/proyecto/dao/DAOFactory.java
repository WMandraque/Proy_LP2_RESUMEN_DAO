package com.proyecto.dao;

import java.io.Serializable;

import com.proyecto.interfaces.UsuarioDAO;

public abstract class DAOFactory implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Identificadores costantes de cada fabrica de BD para multiples fuentes de base de datos
	
	public static final int MYSQL=1;
	public static final int SQLSERVER=2;
	public static final int ORACLE=3;
	
	
	//Metodos para sobreEscribir en la clase hija, va a retornar una interfaz
	// --Metodos Abstractos para el manejo de las tablas, si mas interfaces se
	//   debe crear mas metodos (lista los metodos abstractos) x cada interface
	public abstract UsuarioDAO getUsuarioDAO();
	
	public static DAOFactory obtenerDAOFactory(int bd){
		
		switch (bd) {
		case MYSQL:
			return new MySqlDAOFactory();
			
		case SQLSERVER:
            return new SqlDAOFactory();
		default:
			return null;
		}
	}
	
	

}
