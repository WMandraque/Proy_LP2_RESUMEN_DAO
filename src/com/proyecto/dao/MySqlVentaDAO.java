package com.proyecto.dao;

import utils.MySQLConexionM;

import com.proyecto.interfaces.VentaDAO;

public class MySqlVentaDAO implements VentaDAO {

	MySQLConexionM con=new MySQLConexionM();
	@Override
	public int registrarVenta(String idVendedor, double monto) {
		
		int r=0;
		try {
			
			String sql="{Call usp_registrarVenta(?, ?)}";
			con.hacerConexion(sql, MySQLConexionM.CST);
			con.getCst().setString(1, idVendedor);
			con.getCst().setDouble(2, monto);
			
			System.out.println(idVendedor+" "+monto);
			
			r=con.getCst().executeUpdate();
			
		} catch (Exception e) {
			con.cerrarConexion();
		}
		return r;
	}

}
