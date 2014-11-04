package com.proyecto.dao;

import com.proyecto.interfaces.UsuarioDAO;

public abstract class DAOFactory {
	
	 
	public static final int MYSQL=1;
	public static final int SQLSERVER=2;
	public static final int ORACLE=3;
	
	
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
