<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- Incluimos su pagina del jstl  -->
<%--     <c:choose>
    <c:when test="${sessionScope.datos==null}">
    <jsp:forward page="logueo.jsp"></jsp:forward>
    </c:when>
    </c:choose> --%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div>

<img alt="" src="img/logo.png">
</div>

	<h1>Carro de compras</h1>
	<fieldset style="width: 400px;background-color: silver;">
		<form action="" method="post">
		
		
		<table>
			<tr>
				<td><label>Cod producto:</label></td>
				<td><input type="text" name="item" value="${param.id}"> <a href="GestionaProducto?operacion=listarProductos"><img alt="" src="img/lupa.png"> </a></td>
			</tr>
			<tr>
				<td>Descripción :</td>
				<td><input type="text" name="nombre" value="${param.nombre}"></td>
			</tr>
			<tr>
				<td>Precio :</td>
				<td><input type="text" name="precio" value="${param.precio}"></td>
			</tr>
			<tr>
				<td>Cantidad:</td>
				<td><input type="text" name="cantidad"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Añadir" name="Enviar"></td>
				
			</tr>
			<tr>
				<td><a href="#">Cerrar Sesión</a></td>
				
			</tr>
		</table>
		</form>
	</fieldset>
	<br>
	<jsp:include page="listaitems.jsp" />
</body>
</html>