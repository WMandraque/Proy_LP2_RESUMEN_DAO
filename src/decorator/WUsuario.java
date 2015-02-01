package decorator;

import org.displaytag.decorator.TableDecorator;

import com.proyecto.beans.UsuarioDTO;

public class WUsuario extends TableDecorator {
	
	
	
	public String getEliminar(){
		
		
		UsuarioDTO usuarioX=(UsuarioDTO)getCurrentRowObject();
		
		String     idUsuario=usuarioX.getUsuario();
		String     clave=usuarioX.getClave();
		String     nombre=usuarioX.getNombre();
		String     apellido=usuarioX.getApellido();

		return "<a href=eliminarUsuario.jsp?idUsuario="+idUsuario+"&clave="+clave+"&nombre="+nombre+"&apellido="+apellido+">Selecciona</a>";
		
	}
	
	public String getActualizar(){
		
		
		UsuarioDTO usuarioX=(UsuarioDTO)getCurrentRowObject();
		String     idUsuario=usuarioX.getUsuario();
		String     clave=usuarioX.getClave();
		String     nombre=usuarioX.getNombre();
		String     apellido=usuarioX.getApellido();


		return "<a href=actualizarUsuario.jsp?idUsuario="+idUsuario+"&clave="+clave+"&nombre="+nombre+"&apellido="+apellido+">Selecciona</a>";
		
	}

}
