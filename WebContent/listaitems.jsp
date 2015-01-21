<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2>Listado de pedidos</h2>



	<fieldset style="width: 1000px;background-color: silver;">
	
	
	
		<form action="" method="post">
		
		
			<table border="1">
			<thead style="background-color:#C9FCC6;">
			<tr bgcolor="orange">
				<td>ID PRODUCTO</td>
				<td>DESCRICION</td>
				<td>CANTIDAD</td>
				<td>PRECIO</td>
				<td>OPERACION</td>
			</tr>
			</thead>
			<c:set var="precioTotal" scope="application" value=""></c:set>
			<c:forEach items="${sessionScope.carrito}" var="lista">
			<tr bgcolor="yellow">
			
				<td>${lista.idProducto}</td>
				<td>${lista.desProd}</td>
				<td>${lista.cantidad}</td>
				<td>${lista.precio}</td>
				<td><a href="GestionaVenta?operacion=eliminarItem&idProducto=${lista.idProducto}">Eliminar</a> </td>
			</tr>
			</c:forEach>
				<%-- <TFOOT>
               <TR><td>precio total: ${precioTotal}</td> </TR>
               </TFOOT> --%>
		</table>
		
		
		
		<br><br><br>
		<table>
			<tr>
				<td><input type="submit" value="Comprar" name="Enviar"></td>
				
			</tr>
			
		</table>
		</form>
	</fieldset>

</body>
</html>