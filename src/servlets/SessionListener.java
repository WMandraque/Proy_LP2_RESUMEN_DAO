package servlets;

import java.util.ArrayList;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.proyecto.beans.VentaDTO;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */

//Esto se crean antes que se crea la session y puedees crear mas objetos a nivel de session de manera global!!!
@WebListener
public class SessionListener implements HttpSessionListener {

  
    public SessionListener() {
        
    }


    //Se genere una variable local un arrayList
    public void sessionCreated(HttpSessionEvent arg0) {
    	ArrayList<VentaDTO> listaVentas=new ArrayList<VentaDTO>();
    	// -- es la variable global
    	
    	//Obtenemos la session
    	arg0.getSession().setAttribute("carrito", listaVentas);
        
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0) 
    {
      arg0.getSession().removeAttribute("carrito");  
    }
	
}
