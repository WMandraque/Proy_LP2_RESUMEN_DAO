package com.proyecto.dao;

import com.proyecto.beans.PersonaDTO;
import com.proyecto.interfaces.UsuarioDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new MySqlUsuarioDAO();
	}

}
