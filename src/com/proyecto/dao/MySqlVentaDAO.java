package com.proyecto.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import utils.MySQLConexionM;

import com.proyecto.beans.VentaDTO;
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
	
	public ArrayList<VentaDTO> listarVentas(){
		
		ArrayList<VentaDTO> listarVentas=new ArrayList<VentaDTO>();
		
		try {
			
			String sql="select*from tb_ventas";
			con.hacerConexion(sql, MySQLConexionM.PST);
			ResultSet rs=con.getPst().executeQuery();
			
			while(rs.next()){
				
				listarVentas.add(new VentaDTO(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getDouble(4)));
			}
			
		} catch (Exception e) {
			System.out.println("Error al registrar venta: "+e);
		}finally{
			con.cerrarConexion();
		}
		
		return listarVentas;
	}

}
