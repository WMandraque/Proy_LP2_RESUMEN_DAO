package com.proyecto.interfaces;

import com.proyecto.beans.UsuarioDTO;

public interface UsuarioDAO {
	
	
	//Implementamos los metodos para que la clase que la implemente deba desarrollarla
	//Se asume que es publico en una interface
	
	UsuarioDTO validarLogueo(String usuario, String clave);
	
	int insertarUsuario(String usuario, String clave, String nombre, String apellido, String fecha);

}
