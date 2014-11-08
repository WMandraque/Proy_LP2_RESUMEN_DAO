package com.proyecto.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.service.UsuarioService;

/**
 * Servlet implementation class SvEliminarUsuario
 */
@WebServlet("/SvEliminarUsuario")
public class SvEliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}


	private void procesar(HttpServletRequest request, HttpServletResponse response) {
		
		UsuarioService servicioUsuario=new UsuarioService();
		int r=servicioUsuario.eliminarUsuario(request.getParameter("txtUsuario"));
		RequestDispatcher rd=null;
			
			
		try {
			
			rd=request.getRequestDispatcher("listadoUsuarios");
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
