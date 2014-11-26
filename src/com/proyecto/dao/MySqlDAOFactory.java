package com.proyecto.dao;

import com.proyecto.interfaces.UsuarioDAO;
import com.proyecto.interfaces.VentaDAO;

/*Clase hija de DAOFactory, segun el identificador*/
public class MySqlDAOFactory extends DAOFactory {
	

	/*Hereda sus metodos para sobreEscribirlo*/
	
	/*Este metodo va a retornar una clase implementada con la interfaz segun el tipo de retorno del metodo sobreEscrito*/
	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new MySqlUsuarioDAO();  //Esta es la q tendra todos los mantenimientos usando MySQL
	}

	@Override
	public VentaDAO getVentaDAO() {
		// TODO Auto-generated method stub
		return new MySqlVentaDAO();
	}

}
