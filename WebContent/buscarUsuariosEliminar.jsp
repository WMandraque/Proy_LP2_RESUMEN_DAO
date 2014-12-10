
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">

<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="css/tables.css" type="text/css">
<link rel="stylesheet" href="css/estilos.css" type="text/css"> <!-- instanciamos el css sabpe MAS--->
<link rel="stylesheet" type="text/css" href="css/displaytag.css">
<link rel="stylesheet" type="text/css"
media="screen"href="css/screen.css" />

<title>Buscar usuarios para eliminar</title>
</head>
<body>


<fieldset>

<center>
<legend>Buscar usuarios para eliminar</legend>


														
								
				<display:table
									name="${sessionScope.listadoUsuarios}" 
									 id="UsuarioDTO"
									 uid="models" 
									 style="background-color:white" requestURI="" cellspacing="1"
									 cellpadding="5" pagesize="5"
									 decorator="decorator.DWrapperUsuarioE"
									 >
		
									<display:column title="Usuario" property="usuario" sortable="true" />
									<display:column title="Clave" property="clave" />
									<display:column title="Nombre" property="nombre" />
									<display:column title="Apellido" property="apellido" />
									<display:column title="Fecha de Registro" property="facceso" />
									<display:column title="Estado" property="estado" />
									<display:column title="Recurso" property="recurso" />
								</display:table>	
									
</fieldset>

</center>	


</body>
</html>