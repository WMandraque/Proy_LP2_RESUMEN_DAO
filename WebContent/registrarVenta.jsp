<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="WEB-INF/libreria.tld" prefix=
"libreria" %>

<!--  uri= es el identificador de recursos, prefix=es nombe para usarlo-->

<%
HttpSession miSesion=request.getSession();
String idVendedor=(String)miSesion.getAttribute("idVendedor");
%>

<script src="js/libs/jquery-1.11.1.min.js"></script>     
<script src="js/mylibs/validCampoFranz.js"></script>
<script type="text/javascript">

 $(function(){
    //Para escribir solo numeros    
    $('#txtPrecio').validCampoFranz('0123456789');
    $('#txtCantidad').validCampoFranz('0123456789');
}); 
</script>    




 
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Venta</title>
</head>
<body>

<form action="registrarVenta" method="post" id="frmRegistrarVenta">

<center>
<fieldset>
<legend>Registrar Venta</legend>

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
<td><label>Producto</label></td>
<td><libreria:comboproductos2/>
</tr>

<tr>
<td><label>Cantidad</label></td>
<td><input type="text" id="txtCantidad" name="txtCantidad" placeholder="Ingresar cantidad" required="requerid" ></td>
</tr>

<tr>
<td><label>Precio</label></td>
<td><input type="text" id="txtPrecio" name="txtPrecio" placeholder="Ingresar precio" required="requerid"></td>
</tr>


<tr>
<td><input type="submit" id="btnRegistrar" name="btnRegistrar" value="Registrar"></td>
<td><input type="submit" id="btnLimpiar" name="btnLimpiar" value="Limpiar"></td>

</table>

</fieldset>
</center>
</form>

</body>
</html>