<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<!--Se define la directiva taglib, para usar custom tag  -->
<%@ taglib uri="WEB-INF/libreria.tld" prefix="libreria" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- Incluimos su pagina del jstl  -->


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Venta</title>
</head>
<body>
<form action="GestionaVenta" method="post">
<input type="hidden" name="operacion" id="operacion" value="agregarVenta">
<center>
<div>
<img alt="" src="img/logo.png">
</div>
<fieldset>
<legend>Registrar Venta de Cuadros</legend>

<table>

<tr>
<td><label>Vendedor</label></td>
<td><input type="text" id="txtIdVendedor" name="txtIdVendedor" value="${sessionScope.s_usuario.usuario}" readonly="readonly"></td>
</tr>

<tr>
<td><label>Numero de Venta</label></td>
<td><input type="text" readonly="readonly" value="AUTOGENERADO"></td>
</tr>

<tr>
<td><label>IDProducto</label></td>
<td><input type="text" name="txtIdProducto" id="txtIdProducto" value="${param.idProd}"></td>
<td><input type="button" value="Buscar" onclick="location='GestionaProducto?operacion=listarProductos&tipoListado=listarProductosVenta'" > </td>
</tr>

<tr>
<td><label>Descripcion</label></td>
<td><input type="text" name="txtDescripcion" id="txtDescripcion" value="${param.desProd}"></td>
</tr>

<tr>
<td><label>Cantidad</label></td>
<td><input type="text" id="txtCantidad" name="txtCantidad" placeholder="Ingresar cantidad"  ></td>
</tr>

<tr>
<td><label>Precio</label></td>
<td><input type="text" id="txtPrecio" name="txtPrecio" placeholder="Ingresar precio"  value="${param.precio}"></td>
</tr>
</table>

<table>
<tr>
<td><input type="submit" value="Añadir producto" name="Enviar"></td>				
</tr>
</table>
</fieldset>
</center>
</form>

<jsp:include page="listadoPedidos.jsp" flush="true">
<jsp:param name="txtIdVendedor" value="${sessionScope.s_usuario.usuario}"/>
</jsp:include>


</body>
</html>