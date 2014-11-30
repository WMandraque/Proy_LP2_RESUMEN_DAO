package com.proyecto.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;

import utils.MySQLConexionM;

import com.proyecto.beans.VentaDTO;
import com.proyecto.interfaces.VentaDAO;

public class MySqlVentaDAO implements VentaDAO {

	MySQLConexionM con=new MySQLConexionM();
	@Override
	
	public int registrarVenta(String idVendedor) {
		
		int r=0;
		try {
			
			String sql="{Call usp_registrarVenta(?)}";
			con.prepararSentencia(sql, MySQLConexionM.CST);
			con.getCst().setString(1, idVendedor);

			r=con.getCst().executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error al registrar venta: "+e);
		}finally{
			con.cerrarConexion();
		}
		
		return r;
	}
	
	public ArrayList<VentaDTO> listarVentas(){
		
		ArrayList<VentaDTO> listarVentas=new ArrayList<VentaDTO>();
		
		try {
			
			String sql="select*from tb_ventas";
			con.prepararSentencia(sql, MySQLConexionM.PST);
			ResultSet rs=con.getPst().executeQuery();
		
			
			while(rs.next()){
				
				listarVentas.add(new VentaDTO(rs.getInt(1), rs.getDate(2), rs.getString(3)));
			}
			

		} catch (Exception e) {
			System.out.println("Error al listar ventas: "+e);
		}finally{
			
			con.cerrarConexion();
		}
		
		return listarVentas;
	}

}
