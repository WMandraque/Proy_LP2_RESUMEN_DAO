package filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.beans.UsuarioDTO;




public class LogueoUsuarioFiltro implements Filter {
	
	private FilterConfig filterConfig = null;

	@Override
	public void destroy() {
		filterConfig = null;
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String usu=(String) req.getSession().getAttribute("datos");
		
		if(usu == null)
			request.getRequestDispatcher("/logueo.jsp").forward(request,response);
		else{

			
			chain.doFilter(req, res);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.filterConfig = filterConfig;
		
	}

}
