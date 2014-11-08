package com.proyecto.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.beans.UsuarioDTO;
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
		
		//Capturando datos
		
		String usuario=request.getParameter("txtUsuario");
		String clave=request.getParameter("txtPassword");
		String nombre=request.getParameter("txtNombre");
		String apellido=request.getParameter("txtApellido");
	
		UsuarioService servicioUsaurio=new UsuarioService();
		int r=servicioUsaurio.actualizarUsuario(usuario, clave, nombre, apellido);
		RequestDispatcher rd=null;
		try{
			if(r>0){
				rd=request.getRequestDispatcher("listadoUsuarios");
				rd.forward(request, response);	
			}else{
				request.setAttribute("mensaje", "Error al actualizar");
				rd=request.getRequestDispatcher("actualizarUsuario.jsp");
				rd.forward(request, response);	
			}
		
		}catch(Exception e){
			System.out.println("Error con los dispatcher: "+e);
		}

		
	}

}
