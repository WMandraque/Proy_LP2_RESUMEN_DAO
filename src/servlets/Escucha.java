package servlets;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Escucha
 *
 */
@WebListener
public class Escucha implements HttpSessionListener {


    public Escucha() {
       
    }


    public void sessionCreated(HttpSessionEvent arg0) {
    	//Se crean al iniciar este servlets, estas viene  a ser las variables globales!!
    	
    	System.out.println("Escuchando la sesion: "+arg0.getSession().getId());
       
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0) {
       
    }
	
}
