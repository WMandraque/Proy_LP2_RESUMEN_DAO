package decorator;

import org.displaytag.decorator.TableDecorator;

import com.proyecto.beans.ProductoDTO;



//Esta clase permite capturar el objeto de la tabla y retornarlo a una pagina a usar
public class WProducto extends TableDecorator {
	
	
	//Retorna el direccionamiento
	public String getAgregarCarrito() {
		
		ProductoDTO prod = (ProductoDTO) getCurrentRowObject();
		int posicion = (int) getListIndex();//Alternativa para eliminar
		String idProd=prod.getIdprod();
		String desProd=prod.getDescripcion();
		double precio = prod.getPrecio();
		
		//Envia parametro llamado precio
		/*return "<a href=\"registrarVenta.jsp?precio=" + precio + "&idProd="+idProd+"&desProd="+desProd+"\"> Selecciona </a>";*/
		
		return "<a href=\"registrarVenta.jsp?precio=" + precio + "&idProd="+idProd+"&desProd="+desProd+"\"> <img alt=\"\" src=\"img/carro.png\"> </a>";
		}
	
	public String getEliminar() {
		
		
		int posicion = (int) getListIndex();//Alternativa para eliminar
		//Envia parametro llamado precio
		/*return "<a href=\"registrarVenta.jsp?precio=" + precio + "&idProd="+idProd+"&desProd="+desProd+"\"> Selecciona </a>";*/
		
		return "<a href=\"";
		}

}
