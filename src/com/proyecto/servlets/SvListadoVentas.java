package com.proyecto.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.proyecto.beans.VentaDTO;
import com.proyecto.service.VentaService;

/**
 * Servlet implementation class SvListadoVentas
 */
@WebServlet("/SvListadoVentas")
public class SvListadoVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	private void procesar(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			
			VentaService servicioVenta=new VentaService();
			
			ArrayList<VentaDTO> listadoVentas=servicioVenta.listarVentas();
			

			
			RequestDispatcher rd = null;
			HttpSession miSesion=request.getSession();
		
			miSesion.setAttribute("listadoVentas", listadoVentas);
			rd=request.getRequestDispatcher("listarVentas.jsp");
				
		
			
			rd.forward(request, response);
			
		} catch (Exception e) {
			System.out.println("Error con los distapcher");
		}
		

		
	}

}
