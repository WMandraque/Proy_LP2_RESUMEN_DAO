package com.proyecto.dao;

import com.proyecto.interfaces.UsuarioDAO;

public abstract class DAOFactory {
	
	
	//Identificadores costantes de cada fabrica de BD
	public static final int MYSQL=1;
	public static final int SQLSERVER=2;
	public static final int ORACLE=3;
	
	
	//Metodos para sobreEscribir en la clase hija, va a retornar una interfaz
	public abstract UsuarioDAO getUsuarioDAO();
	
	public static DAOFactory obtenerDAOFactory(int bd){
		
		switch (bd) {
		case MYSQL:
			return new MySqlDAOFactory();
			

		default:
			return null;
		}
	}
	
	

}
