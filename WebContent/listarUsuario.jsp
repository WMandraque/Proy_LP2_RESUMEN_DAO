<%@page import="com.proyecto.beans.UsuarioDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ page import="com.proyecto.beans.UsuarioDTO"%>
<%@ page import="java.util.ArrayList"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<fieldset>
<legend>Listado de Usuarios</legend>

							<display:table 
									name="${requestScope.listadoUsuarios}" id="UsuarioDTO"
									uid="models" 
									style="background-color:white" requestURI="" cellspacing="1"
									cellpadding="5">

									<display:column title="Usuario" property="usuario" />
									<display:column title="Clave" property="clave" />
									<display:column title="Nombre" property="nombre" />
									<display:column title="Apellido" property="apellido" />
									<display:column title="Fecha de Registro" property="facceso" />
									<display:column title="Estado" property="estado" />
								</display:table>



</fieldset>




</body>
</html>