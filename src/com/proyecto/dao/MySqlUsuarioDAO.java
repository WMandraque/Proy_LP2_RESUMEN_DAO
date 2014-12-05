package com.proyecto.dao;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utils.MySQLConexion;
import utils.ClaseConexionMandraque;

import com.proyecto.beans.PersonaDTO;
import com.proyecto.beans.UsuarioDTO;
import com.proyecto.interfaces.UsuarioDAO;

//CAPA DE DATOS
public class MySqlUsuarioDAO implements UsuarioDAO {
	
	ClaseConexionMandraque ccm=new ClaseConexionMandraque();

	@Override
	public UsuarioDTO validarLogueo(String usuario, String clave) {

		UsuarioDTO usuarioX=null;
		Connection con=null;
		
		try {
			
			con=ClaseConexionMandraque.getConexion();
			
			String sql="{call usp_buscausuario(?, ?)}";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.CST);
			ccm.getCst().setString(1, usuario);
			ccm.getCst().setString(2, clave);
	
			ResultSet rs=ccm.getCst().executeQuery();
			
			if(rs.next()){
				usuarioX=new UsuarioDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6));
			}
			
		} catch (Exception e) {
			System.out.println("Error al validar usuario: "+e);
		}finally{
			ccm.cerrarConexionSentencias(con);
		}
		
		return usuarioX;
	}

	@Override
	public int insertarUsuario(String usuario, String clave, String nombre, String apellido, String fecha) {
		
		Date fechaD=null;
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd");
		int r=0;
		
		Connection con=null;
		
		try {
			
			con=ClaseConexionMandraque.getConexion();
	
		
			con.setAutoCommit(false);
			
			fechaD=sdf1.parse(fecha);
			String sql="{call usp_insertarUsuario(?, ?, ?, ?, ?)}";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.CST);
			ccm.getCst().setString(1, usuario);
			ccm.getCst().setString(2, clave);
			ccm.getCst().setString(3, nombre);
			ccm.getCst().setString(4, apellido);
			ccm.getCst().setString(5, sdf2.format(fechaD));
			
			r=ccm.getCst().executeUpdate();
		
			con.commit();
			
		} catch (Exception e) {
			
			System.out.println("Error al registrar usuario: "+e);
			try {
				con.rollback();
			} catch (SQLException e1) {
			e1.printStackTrace();
			}
			
		}finally{
			ccm.cerrarConexionSentencias(con);
		}
		return r;
	}

	@Override
	public int actualizarUsuario(String usuario, String clave, String nombre, String apellido) {
		
		int r=0;
		
		Connection con=null;
		
		try {
			
			con=ClaseConexionMandraque.getConexion();
			
			con.setAutoCommit(false);
			
			String sql="{Call usp_modificarUsuarios(?, ?, ?, ?)}";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.CST);
			ccm.getCst().setString(1, usuario);
			ccm.getCst().setString(2, clave);
			ccm.getCst().setString(3, nombre);
			ccm.getCst().setString(4, apellido);
			
			r=ccm.getCst().executeUpdate();
			
			con.commit();
			
		} catch (Exception e) {
			System.out.println("Error al actualizar usuario: "+e);
			try {
				con.rollback();
			} catch (SQLException e1) {
			e1.printStackTrace();
			}
		}finally{
	           ccm.cerrarConexionSentencias(con);
		}
		return r;
	}

	@Override
	public int eliminarUsuario(String usuario) {

		int r=0;
		
		Connection con=null;
		 try {
			 
			 con=ClaseConexionMandraque.getConexion();
			 con.setAutoCommit(false);
			 
			 String sql="delete from tb_usuario where usuario=?";
			 ccm.prepararSentencia(con, sql, ClaseConexionMandraque.PST);
			 ccm.getPst().setString(1, usuario);
			 
			 r=ccm.getPst().executeUpdate();
			 
			 con.commit();
			
		} catch (Exception e) {
			System.out.println("Error al eliminar  usuario: "+e);
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			ccm.cerrarConexionSentencias(con);;
		}
		return r;
	}

	@Override
	public List<UsuarioDTO> listadoUsuarios() {
		
		List<UsuarioDTO> listadoUsuario=new ArrayList<UsuarioDTO>();
		
		Connection con=null;
		
		try {
			
			con=ClaseConexionMandraque.getConexion();
		
			ccm.prepararSentencia(con,"select*from tb_usuario", ClaseConexionMandraque.PST);
			
			ResultSet rs=ccm.getPst().executeQuery();
			
			while(rs.next()){
				
				listadoUsuario.add(new UsuarioDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6)));
			}
		} catch (Exception e) {
			System.out.println("Error al listar usuarios: "+e);
		}finally{
			ccm.cerrarConexionSentencias(con);
		}
		
		
		return listadoUsuario;
	}

	@Override
	public UsuarioDTO buscarUsuario(String usuario) {
		
		UsuarioDTO usuarioX=null;
		Connection con=null;
		try {
			
			con=ClaseConexionMandraque.getConexion();
			
			String sql="select*From tb_usuario where usuario=?";
			ccm.prepararSentencia(con, sql, ClaseConexionMandraque.PST);
			ccm.getPst().setString(1, usuario);
			ResultSet rs=ccm.getPst().executeQuery();
			if(rs.next()){
				
		      usuarioX=new UsuarioDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6));
			}
			
		} catch (Exception e) {
			System.out.println("Error al buscar usuario: "+e);
		}finally{
			ccm.cerrarConexionSentencias(con);
		}
		return usuarioX;
	}

}
