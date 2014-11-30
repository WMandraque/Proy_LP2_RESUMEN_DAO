package com.proyecto.service;

import java.util.ArrayList;

import com.proyecto.beans.ProductoDTO;
import com.proyecto.dao.DAOFactory;
import com.proyecto.interfaces.ProductoDAO;

public class ProductoService {
	
	
	DAOFactory factory=DAOFactory.obtenerDAOFactory(DAOFactory.MYSQL);
	ProductoDAO dao=factory.getProductoDAO();
	
	
	public ArrayList<ProductoDTO> listadoProducto() {
		
		return dao.listadoProducto();
	}

}
