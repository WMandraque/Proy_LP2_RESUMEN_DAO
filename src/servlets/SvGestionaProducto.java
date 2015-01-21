package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proyecto.beans.ProductoDTO;
import com.proyecto.service.ProductoService;

/**
 * Servlet implementation class SvGestionaProducto
 */
@WebServlet("/SvGestionaProducto")
public class SvGestionaProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		//Capturamos el primer parametro recibido en este servlet a nivel de requesr
		//Este paramtro me permitirar identificar el tipo de operacion
		String operacion=request.getParameter("operacion");
		
	   
		//Segun el tipo de operacion se enviara al metodo adeacuado
		if(operacion.equals("registrarProducto")){
			
		}
		else if(operacion.equals("modificarProducto")){
			
		}
		else if(operacion.equals("eliminarProducto")){
			
		}
		else if(operacion.equals("listarProductos")){
			this.listarProductos(request, response);
		}
		else if(operacion.equals("captura")){
			request.getRequestDispatcher("pedido.jsp").forward(request, response);
		}
		
		
		
	}


	private void listarProductos(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			//Capturamos el segundo parametro recibido en este servlet a nivel de request
			
			String tipoListado=request.getParameter("tipoListado");

			

			ProductoService sProducto = new ProductoService();
			ArrayList<ProductoDTO> listadoProductos = sProducto.listadoProducto();
			
			HttpSession sesionX = request.getSession();
			sesionX.setAttribute("listadoProductos", listadoProductos);
			
			//Este parametro me permitirar saber a que jsp enviar
			if(tipoListado==null)
			{
				
				 request.getRequestDispatcher("listarProductos.jsp").forward(request, response);
			}
			else if(tipoListado.equals("listarProductosModificar"))
			{
				
				
			}
			else if(tipoListado.equals("listarProductosEliminar"))
			{
				
				
			}
			else if(tipoListado.equals("listarProductosVenta"))
			{
				 request.getRequestDispatcher("BuscarProductosVenta.jsp").forward(request, response);
			}
			
		

		} catch (Exception e) {
			System.out.println("Error al despachar listadoProductos: "+e);
		}
		
		
	}
	
	

	
}
