
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib uri="http://displaytag.sf.net" prefix="display"%>    <!-- Incluimos la directiva para el display tag  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




							
								
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
							
					<a href="registrarUsuario.jsp" target="central"> Regresar</a>				
	








</body>
</html>