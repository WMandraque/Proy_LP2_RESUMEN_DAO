package com.proyecto.service;

import com.proyecto.beans.UsuarioDTO;
import com.proyecto.dao.DAOFactory;
import com.proyecto.interfaces.UsuarioDAO;

public class UsuarioService {
	
	DAOFactory factory=DAOFactory.obtenerDAOFactory(1);
	
	UsuarioDAO dao=factory.getUsuarioDAO();
	
	public UsuarioDTO validarLogueo(String usuario, String clave){
		
		UsuarioDTO usuarioX= dao.validarLogueo(usuario, clave);
		return usuarioX;
	}
	
	
	public int insertarUsuario(String usuario, String clave, String nombre, String apellido, String fecha){
		
		int r=dao.insertarUsuario(usuario, clave, nombre, apellido, fecha);
		return r;
	}

}
