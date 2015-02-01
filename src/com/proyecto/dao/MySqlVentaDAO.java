package com.proyecto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.ClaseConexionMandraque;
import com.proyecto.beans.VentaDTO;
import com.proyecto.interfaces.VentaDAO;

public class MySqlVentaDAO implements VentaDAO {

	ClaseConexionMandraque ccm=new ClaseConexionMandraque();
	Connection con=null;
	
	@Override
	public int registrarVenta(VentaDTO ventaX) {
	   
		
		
		int r=0;
				
		try {
			
			con=ClaseConexionMandraque.getConexion();
			
			
			con.setAutoCommit(false);
			String sql="{Call usp_registrarVenta(?, ?)}";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.CST);
			ccm.getCst().setString(1, ventaX.getVendedor());
			ccm.getCst().registerOutParameter(2, java.sql.Types.INTEGER);
			ccm.getCst().executeUpdate();
			
			int numvta=ccm.getCst().getInt(2);
			for (int i = 0; i < ventaX.getListadoPedidos().size(); i++) 
			{
				String sql2="{Call usp_registrarDetalleVenta(?, ?, ?, ?)}";
				ccm.prepararSentencia(con, sql2, ClaseConexionMandraque.CST);
				ccm.getCst().setInt(1, numvta);
				ccm.getCst().setString(2, ventaX.getListadoPedidos().get(i).getIdProducto());
				ccm.getCst().setInt(3, ventaX.getListadoPedidos().get(i).getCantidad());
				ccm.getCst().setDouble(4, ventaX.getListadoPedidos().get(i).getPrecio());
				ccm.getCst().executeUpdate();
			}
		     
			con.commit();
			r=1;
		}
		catch (Exception e) 
		{
			System.out.println("Error al registrar venta: "+e);
			try 
			{
				con.rollback();
			} 
			catch (SQLException e1)
			{
				e1.printStackTrace();
			}
			
		}
		finally
		{
			ccm.cerrarConexionSentencias(con);
		}
		
		return r;
	}
	
	public ArrayList<VentaDTO> listarVentas()
	{
		
		ArrayList<VentaDTO> listarVentas=new ArrayList<VentaDTO>();		
		try 
		{
			
			con=ClaseConexionMandraque.getConexion();
			
			String sql="select*from tb_ventas";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.PST);
			ResultSet rs=ccm.getPst().executeQuery();
		
			while(rs.next())
			{
				
				listarVentas.add(new VentaDTO(rs.getInt(1), rs.getDate(2), rs.getString(3)));
			}
			
			rs.close();
			

		} 
		catch (Exception e) 
		{
			System.out.println("Error al listar ventas: "+e);
		}
		finally
		{
			ccm.cerrarConexionSentencias(con);
		}
		
		return listarVentas;
	}

}
