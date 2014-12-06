package com.proyecto.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import com.proyecto.beans.ProductoDTO;
import com.proyecto.service.ProductoService;

/**
 * Servlet implementation class SvListadoProductos
 */
@WebServlet("/SvListadoProductos")
public class SvListadoProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	private void procesar(HttpServletRequest request,
			HttpServletResponse response) {

		try {

			HttpSession sesionX = request.getSession();

			ProductoService sProducto = new ProductoService();

			ArrayList<ProductoDTO> listadoProductos = sProducto
					.listadoProducto();

			sesionX.setAttribute("listadoProductos", listadoProductos);

			request.getRequestDispatcher("listadoProductos.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("Error al despachar listado de productos: "+e);
		}

	}

}
