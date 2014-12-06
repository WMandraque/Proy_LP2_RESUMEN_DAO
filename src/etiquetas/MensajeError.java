package etiquetas;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MensajeError extends TagSupport {

	private String mensajeError;

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	@Override
	public int doStartTag() throws JspException {

		try {

			JspWriter out = pageContext.getOut();

			out.println("<label class='letra'>"+mensajeError+"</label>");

		} catch (Exception e) {
			System.out.println(e);
			throw new JspException("Error al escribir en jsp: " + e);
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {

		return EVAL_PAGE;

	}

}
