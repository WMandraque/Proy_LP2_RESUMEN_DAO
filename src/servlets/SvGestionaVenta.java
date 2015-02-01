package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proyecto.beans.VentaDTO;
import com.proyecto.service.VentaService;

/**
 * Servlet implementation class SvGestionaVenta
 */
@WebServlet("/SvGestionaVenta")
public class SvGestionaVenta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	VentaService servicioVenta=new VentaService();
	SessionListener sl=new SessionListener();

  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operacion=request.getParameter("operacion");
		
		
		if(operacion.equals("registrarVenta"))
		{
			this.registrarVenta(request, response);	
		}
		else if(operacion.equals("modificarVenta"))
		{
			this.modificarVenta(request, response);
		}
		else if(operacion.equals("eliminarVenta"))
		{
			
		}
		else if(operacion.endsWith("listarVentas"))
		{
			this.listarVentas(request, response);
		}
		else if(operacion.equals("agregarVenta"))
		{
			this.agregarVenta(request, response);
		}
		else if(operacion.equals("eliminarItem"))
		{
			this.eliminarItem(request, response);
		}
		
	}


	private void eliminarItem(HttpServletRequest request, HttpServletResponse response) {
		
		try 
		{
			
			

			String idProd=request.getParameter("idProducto");
			HttpSession miSesion=request.getSession();
			
			ArrayList<VentaDTO> listadoPedidos=(ArrayList<VentaDTO>)miSesion.getAttribute("s_listadoPedidos");
			
			for (int i = 0; i < listadoPedidos.size(); i++) 
			{
			
				if (listadoPedidos.get(i).getIdProducto().equals(idProd)) 
				{
					listadoPedidos.remove(i);
				}
			}
			
			miSesion.setAttribute("s_listadoPedidos", listadoPedidos);
			request.getRequestDispatcher("registrarVenta.jsp").forward(request, response);
			
			
			
			
		} catch (Exception e) {
			System.out.println("Error al eliminarItem: "+e);
		}
		
	}


	private void agregarVenta(HttpServletRequest request,HttpServletResponse response) {
		
		
		try 
		{
			
			String idProd=request.getParameter("txtIdProducto");
			String desProd=request.getParameter("txtDescripcion");
			int cantidad=Integer.parseInt(request.getParameter("txtCantidad"));
			double precio=Double.parseDouble(request.getParameter("txtPrecio"));
		
			VentaDTO nuevaVenta=new VentaDTO();
			nuevaVenta.setIdProducto(idProd);
			nuevaVenta.setDesProd(desProd);
			nuevaVenta.setCantidad(cantidad);
			nuevaVenta.setPrecio(precio);
			nuevaVenta.setPrecioTotal(precio*cantidad);
			HttpSession miSesion=request.getSession();
			
			
			
			ArrayList<VentaDTO> listadoPedidos=(ArrayList<VentaDTO>)miSesion.getAttribute("s_listadoPedidos");
			listadoPedidos.add(nuevaVenta);
			double precioTotal = 0;
			for (int i = 0; i < listadoPedidos.size(); i++)
			{
				precioTotal+=listadoPedidos.get(i).getPrecioTotal();
			}
			
			miSesion.setAttribute("s_listadoPedidos", listadoPedidos);
			miSesion.setAttribute("s_precioTotal", precioTotal);
			request.getRequestDispatcher("registrarVenta.jsp").forward(request, response);
			
		} catch (Exception e) {
			System.out.println("Erro al agregar en el carrito: "+e);
		}
		
		
	}


	private void registrarVenta(HttpServletRequest request, HttpServletResponse response) {
		
		
        try 
        {
        	
			//Capturando datos para registrar venta
			String idVendedor=request.getParameter("txtIdVendedor");
			System.out.println("Vendedor: "+idVendedor);

			HttpSession miSesion=request.getSession();
			ArrayList<VentaDTO> listadoPedidos=(ArrayList<VentaDTO>)miSesion.getAttribute("s_listadoPedidos");
			
			VentaDTO ventaX=new VentaDTO();
			ventaX.setVendedor(idVendedor);
			ventaX.setListadoPedidos(listadoPedidos);
			
			int r=servicioVenta.registrarVenta(ventaX);
			
			if(r>0)
			{	
				this.listarVentas(request, response);
			}
			else 
			{	
				request.setAttribute("Mensaje", "Error al registrar ventas" );
				request.getRequestDispatcher("registrarVenta.jsp").forward(request, response);
			}
			
			listadoPedidos.clear();
			miSesion.setAttribute("s_listadoPedidos", listadoPedidos);
			
		} 
        catch (Exception e) 
		{
			System.out.println("Error al registrarVenta: "+e);
		}

		
	}


	private void modificarVenta(HttpServletRequest request, HttpServletResponse response) {
		
		
	}


	private void listarVentas(HttpServletRequest request, HttpServletResponse response) {
		
		
		
		
        try {
			
        	String tipoListado=request.getParameter("tipoListado");
        	
			VentaService servicioVenta=new VentaService();
			ArrayList<VentaDTO> listadoVentas=servicioVenta.listarVentas();
			
			HttpSession sesionX=request.getSession();
			sesionX.setAttribute("listadoVentas", listadoVentas);
			
			
			if(tipoListado==null){
				
				request.getRequestDispatcher("listarVentas.jsp").forward(request, response);
			}
			else if(tipoListado.equals("listarVentasModificar")){
				
			}
			else if(tipoListado.equals("listarVentasEliminar")){
				
			}
			
		
				
			
		} catch (Exception e) {
			System.out.println("Error al listarVentas: "+e);
		}
		
		
	}

}
