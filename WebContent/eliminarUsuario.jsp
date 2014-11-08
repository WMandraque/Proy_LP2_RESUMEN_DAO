<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
String mensaje=(String)request.getAttribute("mensaje");

%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="eliminarUsuario">
<center>
<fieldset>

<legend>Eliminar usuarios</legend>

<table>

<tr>
<td><label>Usuario</label></td>
<td><input type="text" name="txtUsuario" id="txtUsuario" maxlength="4" placeholder="Ingresar usuario" required="requerid"></td>
</tr>

<tr>
<td><input type="submit" name="btnEliminar" id="btnEliminar" value="Eliminar"></td>
<td><input type="reset" name="btnLimpiar" id="btnLimpiar" value="Limpiar"></td>
</tr>
</table>


</fieldset>

<%
  if(mensaje!=null){
%>
<label class="letras"><%=mensaje %></label>	  
<%
  }
%>

</center>
</form>
</body>
</html>