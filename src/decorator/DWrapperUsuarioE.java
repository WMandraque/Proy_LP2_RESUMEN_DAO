package decorator;

import org.displaytag.decorator.TableDecorator;

import com.proyecto.beans.UsuarioDTO;

public class DWrapperUsuarioE extends TableDecorator {
	
	
	
	public String getRecurso(){
		
		
		UsuarioDTO usuarioX=(UsuarioDTO)getCurrentRowObject();
		String     idUsuario=usuarioX.getUsuario();


		return "<a href=GestionaUsuario?operacion=capturarUsuario&idUsuario="+idUsuario+"&tipoCaptura=E>Selecciona</a>";
		
	}

}
