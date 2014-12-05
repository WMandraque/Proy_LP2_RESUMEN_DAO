package com.proyecto.service;

import java.util.ArrayList;

import com.proyecto.beans.VentaDTO;
import com.proyecto.dao.DAOFactory;
import com.proyecto.interfaces.VentaDAO;

public class VentaService {
	
	
	DAOFactory factory=DAOFactory.obtenerDAOFactory(DAOFactory.MYSQL);
	VentaDAO dao=factory.getVentaDAO();
	
	public int registrarVenta(VentaDTO ventaX) {
		
		return dao.registrarVenta(ventaX);
	}
	
	public ArrayList<VentaDTO> listarVentas(){
		
		return dao.listarVentas();
	}

}
