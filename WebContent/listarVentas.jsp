
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.ArrayList"%>
<%@page import="com.proyecto.beans.VentaDTO"%>

<%
HttpSession miSesion=request.getSession();
ArrayList<VentaDTO> listadoVentas=(ArrayList<VentaDTO>)miSesion.getAttribute("listadoVentas");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<center>

<fieldset>
<legend>Listado de Ventas</legend>

<table cellpadding="2" cellspacing="2" border="2">
<tr bgcolor="yellow" >
<td><label>Id Venta</label></td>
<td><label>Fecha de Venta</label></td>
<td><label>Id Vendedor</label></td>
<td><label>Monto</label></td>
</tr>

<%
for(int i=0; i<listadoVentas.size();i++){
	VentaDTO x=listadoVentas.get(i);
%>
<tr bgcolor="orange" >
<td><label><%=x.getNumvta()%></label></td>
<td><label><%=x.getFacceso()%></label></td>
<td><label><%=x.getVendedor()%></label></td>
<td><label><%=x.getMonto()%></label></td>
</tr>
<%	
}
%>




</table>

</fieldset>

</center>


</body>
</html>