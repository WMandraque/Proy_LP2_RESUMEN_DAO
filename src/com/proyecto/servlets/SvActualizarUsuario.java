package com.proyecto.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.service.UsuarioService;

/**
 * Servlet implementation class SvActualizarUsuario
 */
@WebServlet("/SvActualizarUsuario")
public class SvActualizarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}


	private void procesar(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioService servicioUsaurio=new UsuarioService();
		
		int r=servicioUsaurio.actualizarUsuario(request.getParameter("txtUsuario"), request.getParameter("txtPassword"), request.getParameter("txtNombre"), request.getParameter("txtApellido"));
		RequestDispatcher rd;
		
		if(r>0){
			
			rd=request.getRequestDispatcher("listadoUsuarios");
			rd.forward(request, response);	
		}else{
			
			
		}

		
	}

}
