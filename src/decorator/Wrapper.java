package decorator;

import org.displaytag.decorator.TableDecorator;

import com.proyecto.beans.ProductoDTO;



//Esta clase permite capturar el objeto de la tabla y retornarlo a una pagina a usar
public class Wrapper extends TableDecorator {
	
	
	//Retorna el direccionamiento
	public String getRecurso() {
		
		ProductoDTO prod = (ProductoDTO) getCurrentRowObject();
		String cod = prod.getIdprod();
		
		return "<a href=\"CarritoCompra.jsp?cod=" + cod + "\"> Selecciona </a>";
		}

}
