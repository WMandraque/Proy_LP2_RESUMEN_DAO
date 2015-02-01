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

<center>
<h2>Listado de Pedidos</h2>
<fieldset style="width: 1000px;background-color:silver;">

	
	
		<form action="GestionaVenta" method="post">
		<input type="hidden" name="operacion" value="registrarVenta">
		<input type="hidden" name="txtIdVendedor" value="${param.txtIdVendedor}">
		<table border="1">
			<thead style="background-color:#C9FCC6;">
						<tr bgcolor="orange">
							<td>ID PRODUCTO</td>
							<td>DESCRICION</td>
							<td>CANTIDAD</td>
							<td>PRECIO UNIDA</td>
							<td>PRECIO TOTAL</td>
							<td>OPERACION</td>
						</tr>
			</thead>
			
			<c:forEach items="${sessionScope.s_listadoPedidos}" var="lista">
						<tr bgcolor="yellow">
							<td>${lista.idProducto}</td>
							<td>${lista.desProd}</td>
							<td>${lista.cantidad}</td>
							<td>${lista.precio}</td>
							<td>${lista.precioTotal}</td>
							<td><a href="GestionaVenta?operacion=eliminarItem&idProducto=${lista.idProducto}">Eliminar</a></td>
						</tr>
			</c:forEach>
				<tfoot>
               <tr bgcolor="white"><td>Precio Total: ${sessionScope.s_precioTotal}</td></tr>
               </tfoot>
		</table>
		
		
		
		<br><br><br>
		<table>
			<tr>
				<td><input type="submit" value="Comprar" name="Enviar"></td>
			</tr>
			
		</table>
		</form>
	</fieldset>
</center>	
</body>
</html>