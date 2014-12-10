
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %> <!-- Definimos la etiqueta  -->



<html>



<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/estilos.css" type="text/css">
<link rel="stylesheet" href="css/tables.css" type="text/css">
<link rel="stylesheet" type="text/css" href="css/displaytag.css">
<link rel="stylesheet" type="text/css"media="screen"href="css/screen.css" />

<title>Listado de Ventas</title>
</head>
<body>



<center>

<fieldset>
<legend>Listado de Ventas</legend>


<display:table 
              name="${sessionScope.listadoVentas}" 
              cellspacing="1"
              export="true"
              >
<display:setProperty name="export.pdf.filename" value="listadoVentas"></display:setProperty>
<display:setProperty name="export.excel.filename" value="listadoVentas"></display:setProperty>

<display:column title="Num Venta"      property="numvta" sortable="true"></display:column>
<display:column title="Fecha de Venta" property="facceso" sortable="true"></display:column>
<display:column title="Vendedor"       property="vendedor" sortable="true"></display:column>

</display:table>

<a href="registrarVenta.jsp"><label class="letras">Regresar</label></a>

</fieldset>


</center>


</body>
</html>