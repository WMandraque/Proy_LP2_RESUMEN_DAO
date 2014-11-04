package com.proyecto.dao;

import com.proyecto.beans.UsuarioDTO;
import com.proyecto.interfaces.UsuarioDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		
		return new MySqlUsuarioDAO();
	}

}
