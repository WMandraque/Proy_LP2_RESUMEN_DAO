package com.proyecto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import utils.ClaseConexionMandraque;

import com.proyecto.beans.ProductoDTO;
import com.proyecto.interfaces.ProductoDAO;

public class MySqlProductoDAO implements ProductoDAO {
	
	ClaseConexionMandraque ccm=new ClaseConexionMandraque();

	@Override
	public ArrayList<ProductoDTO> listadoProducto() {
		
		ArrayList<ProductoDTO> listadoProductos=new ArrayList<ProductoDTO>();
		Connection con=null;
		
		try {
			
			con=ClaseConexionMandraque.getConexion();
			
			String sql="Select*From tb_productos where estado=1";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.PST);
			ResultSet rs=ccm.getPst().executeQuery();
            System.out.println("Hizo query");
			while(rs.next()){
				
				listadoProductos.add(new ProductoDTO(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getBoolean(4)));
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Error al listar productos: "+e);
		}finally{
			
			ccm.cerrarConexionSentencias(con);
		}
		return listadoProductos;
	}

}
