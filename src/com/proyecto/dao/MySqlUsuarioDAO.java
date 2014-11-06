package com.proyecto.dao;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utils.MySQLConexion;

import com.proyecto.beans.PersonaDTO;
import com.proyecto.beans.UsuarioDTO;
import com.proyecto.interfaces.UsuarioDAO;

public class MySqlUsuarioDAO implements UsuarioDAO {
	
	Connection con=null;

	@Override
	public PersonaDTO validarLogueo(String usuario, String clave) {
		
		CallableStatement cst=null;
		PersonaDTO usuarioX=null;
		
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

	@Override
	public int insertarUsuario(String usuario, String clave, String nombre, String apellido, String fecha) {
		
		CallableStatement cst=null;
		Date fechaD=null;
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd");
		int r=0;
		
		try {
			
			fechaD=sdf1.parse(fecha);
			
			con=MySQLConexion.getConexion();
			String sql="{call usp_insertarUsuario(?, ?, ?, ?, ?)}";
			cst=con.prepareCall(sql);
			cst.setString(1, usuario);
			cst.setString(2, clave);
			cst.setString(3, nombre);
			cst.setString(4, apellido);
			cst.setString(5, sdf2.format(fechaD));
			
			r=cst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al registrar usuario: "+e);
		}finally{

			try {
				
				if (con!=null) {con.close();}
				if (cst!=null) {cst.close();}
				
			} catch (Exception e) {
				System.out.println("Error con las conexiones: "+e);
			}
			
		}
		return r;
	}

	@Override
	public int actualizarUsuario(String usuario, String clave, String nombre, String apellido) {
		
		CallableStatement  cst=null;
		int r=0;
		
		try {
			
			con=MySQLConexion.getConexion();
			String sql="{Call usp_modificarUsuarios(?, ?, ?, ?)}";
			cst=con.prepareCall(sql);
			cst.setString(1, usuario);
			cst.setString(2, clave);
			cst.setString(3, nombre);
			cst.setString(4, apellido);
			
			r=cst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error al actualizar usuario: "+e);
		}finally{
			try{
				if(con!=null){con.close();}
				if(cst!=null){cst.close();}
			}catch(Exception e){
				System.out.println("Error en las conexiones");
			}
		}
		return r;
	}

	@Override
	public int eliminarUsuario(String usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PersonaDTO> listadoUsuarios() {
		
		PreparedStatement pst=null;
		List<PersonaDTO> listadoUsuario=new ArrayList<PersonaDTO>();
		
		try {
			
			con=MySQLConexion.getConexion();
			pst=con.prepareStatement("select*from tb_usuario");
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				
				listadoUsuario.add(new UsuarioDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5)));
			}
		} catch (Exception e) {
			System.out.println("Error al listar usuarios: "+e);
		}finally{
			try{
				if(con!=null){con.close();}
				if(pst!=null){pst.close();}
			}catch(Exception e){
				System.out.println("Error en las conexiones: "+e);
			}
		}
		
		
		return listadoUsuario;
	}

}
