
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
<link rel="stylesheet" type="text/css"media="screen"href="css/screen.css" />

<title>Buscar productos para engrampar en ventas</title>
</head>
<body>



<fieldset>

<center>
<legend>Buscar productos para engrampar en ventas</legend>


							
								
				<!-- en el name se puede capturar en el name defrente si es a nivel de request se pone
				el nombre del atribute  a nivel de request!!!  -->				
				<display:table 
									 name="${sessionScope.listadoProductos}"
									 id="ProductoDTO"
									 uid="models" 
									 style="background-color:white" requestURI="" cellspacing="1"
									 cellpadding="5" pagesize="10"  decorator="decorator.WProducto">
<%-- 									 
							<display:setProperty name="export.excel.filename" value="ListadoProductos.xls"/>
						    <display:setProperty name="export.pdf.filename"   value="ListadoProductos.pdf"/>
						    <display:setProperty name="export.xml.filename"   value="ListadoProductos.xml"/> --%>
						    
						    

									<display:column title="ID" property="idprod" sortable="true" />
									<display:column title="Producto" property="descripcion" sortable="true"/>
									<display:column title="Precio" property="precio" format="S/.{0,number, 00.00}" sortable="true"/>
									<display:column title="Estado" property="estado" sortable="true"/>
									<display:column title="Seleccionar" property="agregarCarrito"/>
								</display:table>	
								
					<!-- En donde esta asignado el recurso?? -->
							
<!-- 					<a href="registrarUsuario.jsp" target="central"> Regresar</a>				
 -->	
</fieldset>
</center>	


</body>
</html>