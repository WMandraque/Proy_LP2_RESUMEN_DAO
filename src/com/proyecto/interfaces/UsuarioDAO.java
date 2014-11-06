package com.proyecto.interfaces;

import java.util.List;

import com.proyecto.beans.PersonaDTO;


public interface UsuarioDAO {
	
	
	//Implementamos los metodos para que la clase que la implemente deba desarrollarla
	//Se asume que es publico en una interface
	
	int insertarUsuario(String usuario, String clave, String nombre, String apellido, String fecha);
	int actualizarUsuario(String usuario, String clave, String nombre, String apellido);
	int eliminarUsuario(String usuario);
	PersonaDTO validarLogueo(String usuario, String clave);
	
	List<PersonaDTO> listadoUsuarios();
	
	

}
