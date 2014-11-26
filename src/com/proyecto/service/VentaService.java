package com.proyecto.service;

import com.proyecto.dao.DAOFactory;
import com.proyecto.interfaces.VentaDAO;

public class VentaService {
	
	
	DAOFactory factory=DAOFactory.obtenerDAOFactory(DAOFactory.MYSQL);
	VentaDAO dao=factory.getVentaDAO();
	
	public int registrarVenta(String idVendedor, double monto) {
		
		return dao.registrarVenta(idVendedor, monto);
	}

}
