package com.proyecto.dao;

import com.proyecto.interfaces.ProductoDAO;
import com.proyecto.interfaces.UsuarioDAO;
import com.proyecto.interfaces.VentaDAO;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return null;
	}

	@Override
	public VentaDAO getVentaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDAO getProductoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
