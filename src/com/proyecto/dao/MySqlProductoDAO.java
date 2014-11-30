package com.proyecto.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import utils.MySQLConexionM;

import com.proyecto.beans.ProductoDTO;
import com.proyecto.interfaces.ProductoDAO;

public class MySqlProductoDAO implements ProductoDAO {
	
	MySQLConexionM con=new MySQLConexionM();

	@Override
	public ArrayList<ProductoDTO> listadoProducto() {
		ArrayList<ProductoDTO> listadoProductos=new ArrayList<ProductoDTO>();
		
		try {
			
			String sql="Select*From tb_productos where estado=1";
			con.prepararSentencia(sql, MySQLConexionM.PST);
			ResultSet rs=con.getPst().executeQuery();
			
			while(rs.next()){
				
				listadoProductos.add(new ProductoDTO(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getBoolean(4)));
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Error al listar productos: "+e);
		}finally{
			
			con.cerrarConexion();
		}
		return listadoProductos;
	}

}
