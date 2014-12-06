package etiquetas;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import com.proyecto.beans.ProductoDTO;
import com.proyecto.service.ProductoService;

public class cboProductos extends TagSupport {


	@Override
	//throws JspException: es la excepcion en el jsp
	public int doStartTag() throws JspException {
		
		//Acciones que va hacer la etiqueta al inciciarse
		try {
			
			//Creamos el objeto que va a escribir en el jsp
			JspWriter out=pageContext.getOut();
			
			ProductoService sproducto=new ProductoService();
			ArrayList<ProductoDTO> listadoProductos=sproducto.listadoProducto();
			
			//Escribimos en el jsp
				
			out.println("<Select name='cboProductos' style='width: 175px; '>");
			
			for (int i = 0; i < listadoProductos.size(); i++) {
					
	         out.println("<option value="+listadoProductos.get(i).getIdprod()+">"
	                                +
	                                listadoProductos.get(i).getDescripcion()
	                                +
			              "</option>");
			}
			
			out.println("</select>");
			
			
		} catch (Exception e) {
			//Enviamos error en el jsp
			throw new JspException("Error: "+e.getMessage());
		}
		return SKIP_BODY;
	}
	
	
	@Override
	public int doEndTag() throws JspException {
		//Acciones al finalizar la etiqueta
		return EVAL_PAGE;
	}


	

}
