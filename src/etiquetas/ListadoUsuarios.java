package etiquetas;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.proyecto.beans.ProductoDTO;
import com.proyecto.service.ProductoService;

public class ListadoUsuarios extends TagSupport {
	
	
	
	public int doStartTag() throws JspException {

		try {
			
			JspWriter out = pageContext.getOut();
			ProductoService servicioProducto=new ProductoService();
			ArrayList<ProductoDTO> listadoProductos=servicioProducto.listadoProducto();
			
			out.println("<select name='cboProductos'>"); 
			out.println("<option value='0'>Seleccione</option>"); 

			//LLENAMOS EL COMBO CON LOS PRODUCTOS DE LA TABLA ---> LISTA
			
			for (int i = 0 ; i< listadoProductos.size(); i++){
				ProductoDTO x = listadoProductos.get(i);
				//out.println("<option value='P0001'>Pizza familiar</option>"); 
				out.println("<option value=" + x.getIdprod() + ">" + x.getDescripcion() +"</option>"); 
			}
			out.println("</select>");

		} catch (IOException e) {
			throw new JspException("Error: " + e.getMessage());
		}
		return SKIP_BODY; //Es una constante que representa que esat etiqueta no tiene nada

	}

	// Esto es cuando acaba
	public int doEndTag() throws JspException {
		return EVAL_PAGE; //Es una constante que continua evaluando
	}

}
