<%@page import="com.proyecto.beans.UsuarioDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.List" %>

<%
List<UsuarioDTO> listadoUsuario=(List<UsuarioDTO>)request.getAttribute("listadoUsuarios");

%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

<fieldset>
<legend>Listado de Usuarios</legend>

<table cellpadding="2" cellspacing="2" border="2">
<tr bgcolor="yellow" >
<td><label>Usuario</label></td>
<td><label>Clave</label></td>
<td><label>Nombre</label></td>
<td><label>Apellido</label></td>
<td><label>Fecha Registro</label></td>
<td><label>Estado</label></td>
</tr>

<%
for(int i=0; i<listadoUsuario.size(); i++){
	
	UsuarioDTO usuarioX=listadoUsuario.get(i);
%>
<tr bgcolor="skyblue" >
<td><%=usuarioX.getUsuario()%></td>
<td><%=usuarioX.getClave()%></td>
<td><%=usuarioX.getNombre()%></td>
<td><%=usuarioX.getApellido()%></td>
<td><%=usuarioX.getFacceso()%></td>
<td><%=usuarioX.getEstado()%></td>
</tr>
	
<%	
}
%>


</table>

</fieldset>

</center>


</body>
</html>