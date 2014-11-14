package com.proyecto.interfaces;

import java.util.List;

import com.proyecto.beans.PersonaDTO;
import com.proyecto.beans.UsuarioDTO;


public interface UsuarioDAO {
	
	
	//Implementamos los metodos para que la clase que la implemente deba desarrollarla
	
	//Define los metodos a usar para la clase UsuarioDTO
	//Se asume que es publico en una interface.
	
	//Lista de los metodos a usar para la clase UsuarioDTO(solo listar)
	
	//public int registrarUsuario(UsuarioDTO usuario);
	
	int insertarUsuario(String usuario, String clave, String nombre, String apellido, String fecha);
	int actualizarUsuario(String usuario, String clave, String nombre, String apellido);
	int eliminarUsuario(String usuario);
	UsuarioDTO validarLogueo(String usuario, String clave);
	UsuarioDTO buscarUsuario(String usuario);
	
	List<UsuarioDTO> listadoUsuarios();
	
	

}
