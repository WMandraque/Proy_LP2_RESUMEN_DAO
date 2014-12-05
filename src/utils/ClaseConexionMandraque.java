package utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class ClaseConexionMandraque {
	

    
	private CallableStatement cst=null;
	private PreparedStatement pst=null;
	
	public static final int CST=1;
	public static final int PST=2;
	
	public PreparedStatement getPst() {
		return pst;
	}
	public CallableStatement getCst() {
		return cst;
	}

	//Metodo que se va a encargar de devolver una conexion
	public static Connection getConexion() {
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/base";
			String usr = "root";
			String psw = "mysql";
			con = DriverManager.getConnection(url, usr, psw);
		} catch (ClassNotFoundException ex) {
			System.out.println("No hay Driver!!");
		} catch (SQLException ex) {
			System.out.println("Error con la BD");
		}
		return con;
	}
	
	
	
	public void prepararSentencia(Connection con, String sql, int tipoSentencia){
		try {

			switch (tipoSentencia) {
			case CST:
				cst=con.prepareCall(sql);
			case PST:
				pst=con.prepareStatement(sql);
			}
		} catch (Exception e) {
			System.out.println("Error en el tipo de sentencia");
		}
	}
	
	
	
	//Metodo que va cerrar los objetos para ejecutar las sentencias sql y conexiones
	public void cerrarConexionSentencias(Connection con){
	try {
			if(cst!=null){cst.close();}
			if(pst!=null){pst.close();}
			if(con!=null){con.close();}
	} catch (Exception e) {
		System.out.println("Error al cerrar conexiones y sentencias: "+e);
	}
		
	}
}
