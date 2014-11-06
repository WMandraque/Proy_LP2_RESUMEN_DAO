package com.proyecto.service;

import java.util.List;

import com.proyecto.beans.PersonaDTO;
import com.proyecto.dao.DAOFactory;
import com.proyecto.interfaces.UsuarioDAO;


public class UsuarioService {

	
	
	
	
	DAOFactory factory=DAOFactory.obtenerDAOFactory(1);
	
	UsuarioDAO dao=factory.getUsuarioDAO();
	
	public PersonaDTO validarLogueo(String usuario, String clave){
		
		PersonaDTO usuarioX= dao.validarLogueo(usuario, clave);
		return usuarioX;
	}
	
	
	public int insertarUsuario(String usuario, String clave, String nombre, String apellido, String fecha){
		
		int r=dao.insertarUsuario(usuario, clave, nombre, apellido, fecha);
		return r;
	}
	
	
	public int actualizarUsuario(String usuario, String clave, String nombre, String apellido){
		
		 int r=dao.actualizarUsuario(usuario, clave, nombre, apellido);
		 return r;
	}
	
	
	public List<PersonaDTO> listarUsuario(){
		
		List<PersonaDTO> listado=dao.listadoUsuarios();
		
		return listado;
	}

}
