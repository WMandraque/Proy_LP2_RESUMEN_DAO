package com.proyecto.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;

import utils.ClaseConexionMandraque;
import utils.MySQLConexion;

import com.proyecto.beans.VentaDTO;
import com.proyecto.interfaces.VentaDAO;

public class MySqlVentaDAO implements VentaDAO {

	ClaseConexionMandraque ccm=new ClaseConexionMandraque();
	@Override
	
	public int registrarVenta(VentaDTO ventaX) {
	   
		
		Connection con=null;
		int r=0;
				
		try {
			
			con=ClaseConexionMandraque.getConexion();
			
			
			con.setAutoCommit(false);
			
			String sql="{Call usp_registrarVenta(?)}";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.CST);
			ccm.getCst().setString(1, ventaX.getVendedor());

			ccm.getCst().executeUpdate();
			
			String sql2="{Call usp_registrarDetalleVenta(?, ?, ?)}";
			ccm.prepararSentencia(con, sql2, ClaseConexionMandraque.CST);
			ccm.getCst().setString(1, ventaX.getIdProducto());
			ccm.getCst().setInt(2, ventaX.getCantidad());
			ccm.getCst().setDouble(3, ventaX.getPrecio());
			
			r=ccm.getCst().executeUpdate();
			
		     con.commit();
			
		} catch (Exception e) {
			System.out.println("Error al registrar venta: "+e);
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}finally{
			
			ccm.cerrarConexionSentencias(con);
	
		}
		
		return r;
	}
	
	public ArrayList<VentaDTO> listarVentas(){
		
		ArrayList<VentaDTO> listarVentas=new ArrayList<VentaDTO>();
		Connection con=null;
		
		try {
			
			con=ClaseConexionMandraque.getConexion();
			
			String sql="select*from tb_ventas";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.PST);
			ResultSet rs=ccm.getPst().executeQuery();
		
			while(rs.next()){
				
				listarVentas.add(new VentaDTO(rs.getInt(1), rs.getDate(2), rs.getString(3)));
			}
			
			rs.close();
			

		} catch (Exception e) {
			System.out.println("Error al listar ventas: "+e);
		}finally{
			
			ccm.cerrarConexionSentencias(con);
		}
		
		return listarVentas;
	}

}
