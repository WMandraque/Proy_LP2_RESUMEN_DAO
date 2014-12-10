
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- Incluimos su pagina del jstl  -->
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="css/tables.css" type="text/css">
<link rel="stylesheet" href="css/estilos.css" type="text/css"> <!-- instanciamos el css sabpe MAS--->
<link rel="stylesheet" type="text/css" href="css/displaytag.css">
<link rel="stylesheet" type="text/css"
media="screen"href="css/screen.css" />

<title>Listado de Usuaios</title>
</head>
<body>



<fieldset>

<center>
<legend>Listado de Usuarios</legend>


														
								
				<display:table
									name="${sessionScope.listadoUsuarios}" 
									 id="UsuarioDTO"
									 uid="models" 
									 style="background-color:white" requestURI="" cellspacing="1"
									 cellpadding="5" pagesize="5" export="true">
									 <display:setProperty name="export.excel.filename" value="ListadoUsuarios.xls"/>
									 <display:setProperty name="export.pdf.filename" value="ListadoUsuarios.pdf"/>

									<display:column title="Usuario" property="usuario" sortable="true" />
									<display:column title="Clave" property="clave" />
									<display:column title="Nombre" property="nombre" />
									<display:column title="Apellido" property="apellido" />
									<display:column title="Fecha de Registro" property="facceso" />
									<display:column title="Estado" property="estado" />
								</display:table>	
								
					
					<label class="letras">${sessionScope.mensaje}</label> <br>
							
					<a href="registrarUsuario.jsp" target="central"> Regresar</a>				
	
</fieldset>

</center>	


</body>
</html>