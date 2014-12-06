package com.proyecto.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proyecto.beans.PersonaDTO;
import com.proyecto.beans.UsuarioDTO;
import com.proyecto.service.UsuarioService;

/**
 * Servlet implementation class ServletListadoUsuario
 */
@WebServlet("/ServletListadoUsuario")
public class SvListadoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}


	private void procesar(HttpServletRequest request,
			HttpServletResponse response) {
		
		UsuarioService servicioUsuario=new UsuarioService();
		List<UsuarioDTO> listadoUsuario=servicioUsuario.listarUsuario();
		RequestDispatcher rd=null;
		try {
			
			HttpSession miSesion=request.getSession();
			
			miSesion.setAttribute("listadoUsuarios", listadoUsuario);
			rd=request.getRequestDispatcher("listarUsuario.jsp");
			rd.forward(request, response);

			
		} catch (Exception e) {
			System.out.println("Error con los distpacher: "+e);
		}
		
	}

}
