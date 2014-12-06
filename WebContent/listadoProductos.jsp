
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- Incluimos su pagina del jstl  -->
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>    <!-- Incluimos la directiva para el display tag  -->



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="css/tables.css" type="text/css">
<link rel="stylesheet" href="css/estilos.css" type="text/css">
<link rel="stylesheet" type="text/css" href="css/displaytag.css">
<link rel="stylesheet" type="text/css"
media="screen"href="css/screen.css" />

<title>Listado de Productos</title>
</head>
<body>



<fieldset>

<center>
<legend>Listado de Productos</legend>


							
								
								
				<display:table 
									name="${sessionScope.listadoProductos}"
									 id="ProductoDTO"
									 uid="models" 
									 style="background-color:white" requestURI="" cellspacing="1"
									 cellpadding="5" pagesize="3" export="true" decorator="decorator.Wrapper">
									 
							<display:setProperty name="export.excel.filename" value="ListadoProductos.xls"/>
						    <display:setProperty name="export.pdf.filename"   value="ListadoProductos.pdf"/>
						    <display:setProperty name="export.xml.filename"   value="ListadoProductos.xml"/>

									<display:column title="ID" property="idprod" sortable="true" />
									<display:column title="Producto" property="descripcion" sortable="true"/>
									<display:column title="Precio" property="precio" sortable="true"/>
									<display:column title="Estado" property="estado" sortable="true"/>
									<display:column title="Recurso" property="recurso"/>
								</display:table>	
								
					<!-- En donde esta asignado el recurso?? -->
							
					<a href="registrarUsuario.jsp" target="central"> Regresar</a>				
	
</fieldset>

</center>	


</body>
</html>