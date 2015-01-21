package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.beans.ProductoDTO;
import com.proyecto.service.ProductoService;



public class GestionProducto extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,
				IOException {
		
		ProductoService servicio = new ProductoService();
		ArrayList<ProductoDTO> lista = servicio.listadoProducto();
		
		try{
			request.setAttribute("listado", lista);
			request.getRequestDispatcher("/listado.jsp").forward(request, response);
		
		} catch (Exception e) {
			PrintWriter out = response.getWriter();
			out.println(">>> Aviso : " + e.toString() + " <<<");
			out.close();
		}	
	}
}
