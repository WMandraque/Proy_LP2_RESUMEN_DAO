<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<!--Se define la directiva taglib, para usar custom tag  -->
<%@ taglib uri="WEB-INF/libreria.tld" prefix="libreria" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<!--  uri= es el identificador de recursos, prefix=es nombe para usarlo-->

<%
HttpSession miSesion=request.getSession();
String idVendedor=(String)miSesion.getAttribute("idVendedor");
%> 
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Venta</title>
</head>
<body>

<form action="GestionaVenta" method="post">
<div>

<img alt="" src="img/logo.png">
</div>
<center>
<fieldset>
<legend>Registrar Venta</legend>
<input type="hidden" name="operacion" id="operacion" value="agregarVenta">

<table>
<tr>
<td><label>Vendedor</label></td>
<td><input type="text" id="txtIdVendedor" name="txtIdVendedor" value=<%=idVendedor%> readonly="readonly"></td>
</tr>

<tr>
<td><label>Numero de Venta</label></td>
<td><input type="text" readonly="readonly" value="AUTOGENERADO"></td>
</tr>

<tr>
<td><label>IDProducto</label></td>
<!-- <td><libreria:cboProductos/> -->
<td><input type="text" name="txtIdProducto" id="txtIdProducto" value="${param.idProd}"></td>
<td><input type="button" value="Buscar" onclick="location='GestionaProducto?operacion=listarProductos&tipoListado=listarProductosVenta'" > </td>
</tr>

<tr>
<td><label>Descripcion</label></td>
<!-- <td><libreria:cboProductos/> -->
<td><input type="text" name="txtDescripcion" id="txtDescripcion" value="${param.desProd}"></td>
</tr>

<tr>
<td><label>Cantidad</label></td>
<td><input type="text" id="txtCantidad" name="txtCantidad" placeholder="Ingresar cantidad" required="requerid" ></td>
</tr>

<tr>
<td><label>Precio</label></td>
<td><input type="text" id="txtPrecio" name="txtPrecio" placeholder="Ingresar precio" required="requerid" value="${param.precio}"></td>
</tr>


<tr>
<!-- <td><input type="submit" id="btnRegistrar" name="btnRegistrar" value="Registrar"></td>
<td><input type="submit" id="btnLimpiar" name="btnLimpiar" value="Limpiar"></td> --><tr>
				<td><input type="submit" value="Añadir" name="Enviar"></td>
				
			</tr>
</table>

<jsp:include page="listaitems.jsp" />

</fieldset>
</center>
</form>

</body>
</html>