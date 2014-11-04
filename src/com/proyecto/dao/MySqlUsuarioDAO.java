package com.proyecto.dao;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.MySQLConexion;

import com.proyecto.beans.UsuarioDTO;
import com.proyecto.interfaces.UsuarioDAO;

public class MySqlUsuarioDAO implements UsuarioDAO {
	
	Connection con=null;

	@Override
	public UsuarioDTO validarLogueo(String usuario, String clave) {
		
		CallableStatement cst=null;
		UsuarioDTO usuarioX=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="{call usp_buscausuario(?, ?)}";
			cst=con.prepareCall(sql);
			cst.setString(1, usuario);
			cst.setString(2, clave);
	
			ResultSet rs=cst.executeQuery();
			
			if(rs.next()){
				usuarioX=new UsuarioDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
			}
			
		} catch (Exception e) {
			System.out.println("Error al validar usuario: "+e);
		}finally{
			try {
				if(con!=null){con.close();}
				if(cst!=null){cst.close();}
			} catch (Exception e2) {
				System.out.println("Error con las conexiones: "+e2);
			}
		}
		
		return usuarioX;
	}

}
