package servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proyecto.beans.UsuarioDTO;
import com.proyecto.interfaces.UsuarioDAO;

/**
 * Servlet Filter implementation class Filtro
 */
@WebFilter("/Filtro")
public class Filtro implements Filter {


	public Filtro() 
	{
	}


	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		

		//Cateamos para capturar toda la info
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		UsuarioDTO usuario=(UsuarioDTO) req.getSession().getAttribute("s_usuario");		
		
		if (usuario==null)
		{
				req.getRequestDispatcher("logueo.jsp");
		}

		chain.doFilter(request, response);
		
	
	}


	public void init(FilterConfig fConfig) throws ServletException 
	{
	}

}
