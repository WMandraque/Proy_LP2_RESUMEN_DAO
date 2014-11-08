package com.proyecto.service;

import java.util.List;

import com.proyecto.beans.PersonaDTO;
import com.proyecto.beans.UsuarioDTO;
import com.proyecto.dao.DAOFactory;
import com.proyecto.interfaces.UsuarioDAO;


public class UsuarioService {

	
	
	
	//Se intancia DAOFacotry pero solo invocando su metodo para asignar la bd q usaremos
	//Factory nos devolvera una clase hija del DAOFactory
	DAOFactory factory=DAOFactory.obtenerDAOFactory(1);

	//El metodo de la clase hija nos devolvera una interfaz
	UsuarioDAO dao=factory.getUsuarioDAO();
	
	//Estos son los metodos que van aser publicos y va a ser intermediaria entre la capa presentacion y 
	//la capa de datos
	public UsuarioDTO validarLogueo(String usuario, String clave){
		
		UsuarioDTO  usuarioX= dao.validarLogueo(usuario, clave);
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
	
	public int eliminarUsuario(String usuario){
		int r=dao.eliminarUsuario(usuario);
		return r;
	}
	
	public List<UsuarioDTO> listarUsuario(){
		
		List<UsuarioDTO> listado=dao.listadoUsuarios();
		
		return listado;
	}
	
	public UsuarioDTO buscarUsuario(String usuario){
		
		UsuarioDTO usuarioX=dao.buscarUsuario(usuario);
		return usuarioX;
	}

}
