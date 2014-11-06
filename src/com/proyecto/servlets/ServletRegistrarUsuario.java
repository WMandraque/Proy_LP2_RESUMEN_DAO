package com.proyecto.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import com.proyecto.service.UsuarioService;

/**
 * Servlet implementation class ServletRegistrarUsuario
 */
@WebServlet("/ServletRegistrarUsuario")
public class ServletRegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	procesar(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	procesar(request, response);
	}


	private void procesar(HttpServletRequest request, HttpServletResponse response) {
		
		try{
		
		//Capturando datos
		
		String usuario=request.getParameter("txtUsuario");
		String clave=request.getParameter("txtPassword");
		String nombre=request.getParameter("txtNombre");
		String apellido=request.getParameter("txtApellido");
		String fecha=request.getParameter("txtFecha");
		
		UsuarioService servicioUsuario=new UsuarioService();
		RequestDispatcher rd=null;
		
		int r=servicioUsuario.insertarUsuario(usuario, clave, nombre, apellido, fecha);
		
		
		
		if (r>0) {
			
			request.setAttribute("mensaje", " Nuevo usuario agregado: "+usuario);
			rd=request.getRequestDispatcher("listadoUsuarios");
			rd.forward(request, response);
		}else{
			
			request.setAttribute("mensaje", "Error con los datos ingresados");
			rd=request.getRequestDispatcher("registrarUsuario.jsp");
			rd.forward(request, response);
		}
		
	}catch(Exception e){
		System.out.println("Erro con los disptacher: "+e);
	}
		
	}

}
