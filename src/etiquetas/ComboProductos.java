package etiquetas;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

//Tambien podemos implementar de tag
public class ComboProductos extends TagSupport {

	// Se implementa exepciones para el jsp
	// Esto es cuando inicia
	public int doStartTag() throws JspException {

		try {
			JspWriter out = pageContext.getOut(); //Prepara la salida
			out.println("<select name='cboProductos'>");
			out.println("<option value='0'>Seleccione</option>");
			out.println("<option value='P0001'>Pizza familiar</option>");
			out.println("<option value='P0003'>Pizza personal</option>");
			out.println("<option value='P0004'>Inca Kola</option>");
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
