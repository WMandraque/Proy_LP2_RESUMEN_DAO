package decorator;

import org.displaytag.decorator.TableDecorator;

import com.proyecto.beans.ProductoDTO;



//Esta clase permite capturar el objeto de la tabla y retornarlo a una pagina a usar
public class Wrapper extends TableDecorator {
	
	
	//Retorna el direccionamiento
	public String getRecurso() {
		
		ProductoDTO prod = (ProductoDTO) getCurrentRowObject();
		String idProd=prod.getIdprod();
		double precio = prod.getPrecio();
		
		//Envia parametro llamado precio
		return "<a href=\"registrarVenta.jsp?precio=" + precio + "&idProd="+idProd+"\"> Selecciona </a>";
		}

}
