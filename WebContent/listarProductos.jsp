
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- Incluimos su pagina del jstl  -->
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>    <!-- Incluimos la directiva para el display tag  -->



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="css/tables.css" type="text/css">
<link rel="stylesheet" href="css/estilos.css" type="text/css"> <!-- instanciamos el css sabpe MAS--->
<link rel="stylesheet" type="text/css" href="css/displaytag.css">
<link rel="stylesheet" type="text/css" media="screen"href="css/screen.css" />

<title>Listado de Productos</title>
</head>
<body>



<center>
<h2>Listado de Productos</h2>


							
								
				<!-- en el name se puede capturar en el name defrente si es a nivel de request se pone
				el nombre del atribute  a nivel de request!!!  -->				
				<display:table        
									 name="${sessionScope.listadoProductos}"
									 id="ProductoDTO"
									 uid="models" 
									 style="background-color:white" requestURI="" cellspacing="1"
									 cellpadding="5" pagesize="5">
									 
				

									<display:column title="ID" property="idprod" sortable="true" />
									<display:column title="Producto" property="descripcion" sortable="true"/>
									<display:column title="Precio"   property="precio" sortable="true"/>
									<display:column title="Estado"   property="estado" sortable="true"/>
								</display:table>	
								
					<!-- En donde esta asignado el recurso?? -->
							
<!-- 					<a href="pedido.jsp" target="central"><h3>Regresar</h3> </a>				
 -->	
</center>

</body>
</html>