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
import utils.MySQLConexionM;

import com.proyecto.beans.PersonaDTO;
import com.proyecto.beans.UsuarioDTO;
import com.proyecto.interfaces.UsuarioDAO;

//CAPA DE DATOS
public class MySqlUsuarioDAO implements UsuarioDAO {
	
	MySQLConexionM con=new MySQLConexionM();

	@Override
	public UsuarioDTO validarLogueo(String usuario, String clave) {

		UsuarioDTO usuarioX=null;
		
		try {
			
			String sql="{call usp_buscausuario(?, ?)}";
			con.hacerConexion(sql, MySQLConexionM.CST);
			con.getCst().setString(1, usuario);
			con.getCst().setString(2, clave);
	
			ResultSet rs=con.getCst().executeQuery();
			
			if(rs.next()){
				usuarioX=new UsuarioDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
			}
			
		} catch (Exception e) {
			System.out.println("Error al validar usuario: "+e);
		}finally{
			con.cerrarConexion();
		}
		
		return usuarioX;
	}

	@Override
	public int insertarUsuario(String usuario, String clave, String nombre, String apellido, String fecha) {
		
		Date fechaD=null;
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd");
		int r=0;
		
		try {
			
			fechaD=sdf1.parse(fecha);
			String sql="{call usp_insertarUsuario(?, ?, ?, ?, ?)}";
			con.hacerConexion(sql, MySQLConexionM.CST);
			con.getCst().setString(1, usuario);
			con.getCst().setString(2, clave);
			con.getCst().setString(3, nombre);
			con.getCst().setString(4, apellido);
			con.getCst().setString(5, sdf2.format(fechaD));
			
			r=con.getCst().executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al registrar usuario: "+e);
		}finally{
			con.cerrarConexion();
		}
		return r;
	}

	@Override
	public int actualizarUsuario(String usuario, String clave, String nombre, String apellido) {
		
		int r=0;
		
		try {
			
			
			String sql="{Call usp_modificarUsuarios(?, ?, ?, ?)}";
			con.hacerConexion(sql, MySQLConexionM.CST);
			con.getCst().setString(1, usuario);
			con.getCst().setString(2, clave);
			con.getCst().setString(3, nombre);
			con.getCst().setString(4, apellido);
			
			r=con.getCst().executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error al actualizar usuario: "+e);
		}finally{
	           con.cerrarConexion();
		}
		return r;
	}

	@Override
	public int eliminarUsuario(String usuario) {

		int r=0;
		 try {
			 String sql="delete from tb_usuario where usuario=?";
			 con.hacerConexion(sql, MySQLConexionM.PST);
			 con.getPst().setString(1, usuario);
			 
			 r=con.getPst().executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error al eliminar usuario: "+e);
		}finally{
			con.cerrarConexion();
		}
		return r;
	}

	@Override
	public List<UsuarioDTO> listadoUsuarios() {
		
		List<UsuarioDTO> listadoUsuario=new ArrayList<UsuarioDTO>();
		
		try {
		
			con.hacerConexion("select*from tb_usuario", MySQLConexionM.PST);
			
			ResultSet rs=con.getPst().executeQuery();
			
			while(rs.next()){
				
				listadoUsuario.add(new UsuarioDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5)));
			}
		} catch (Exception e) {
			System.out.println("Error al listar usuarios: "+e);
		}finally{
			con.cerrarConexion();
		}
		
		
		return listadoUsuario;
	}

	@Override
	public UsuarioDTO buscarUsuario(String usuario) {
		
		UsuarioDTO usuarioX=null;
		try {
			
			String sql="select*From tb_usuario where usuario=?";
			con.hacerConexion(sql, MySQLConexionM.PST);
			con.getPst().setString(1, usuario);
			ResultSet rs=con.getPst().executeQuery();
			if(rs.next()){
				
		      usuarioX=new UsuarioDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
			}
			
		} catch (Exception e) {
			System.out.println("Error al buscar usuario: "+e);
		}finally{
			con.cerrarConexion();
		}
		return usuarioX;
	}

}
