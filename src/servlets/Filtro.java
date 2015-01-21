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

	/**
	 * Default constructor.
	 */
	public Filtro() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("evaluando filtro");

		//Cateamos para capturar toda la info
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		UsuarioDTO usu=(UsuarioDTO) req.getSession().getAttribute("datos");		
		if (usu==null) {
				req.getRequestDispatcher("logueo.jsp").forward(req, res);
		}
		chain.doFilter(request, response);
		System.out.println("continua!!!");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
