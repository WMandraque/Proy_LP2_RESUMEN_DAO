<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.Date"%>    
<%@ page import="java.text.SimpleDateFormat"%>    

<% 
   Date fecha=new Date();
   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");

%>

<%
String mensaje=(String)request.getAttribute("mensaje");
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/estilos.css" type="text/css"> <!-- instanciamos el css -->
</head>
<body>

<form action="registrarUsuario" method="post">
<center>
<fieldset>


<legend><label class="titulos">Registrar Usuario</label> </legend>

<table>

<tr>
<td><label>Usuario</label></td>
<td><input type="text" name="txtUsuario" id="txtUsuario" maxlength="4" placeholder="Ingresar usuario" required="requerid"></td>
</tr>

<tr>
<td><label>Clave</label></td>
<td><input type="password" name="txtPassword" id="txtPassword" maxlength="5" placeholder="Ingresar password" required="requerid"></td>
</tr>

<tr>
<td><label>Nombre</label></td>
<td><input type="text" name="txtNombre" id="txtNombre" maxlength="15" placeholder="Ingresar nombre" required="requerid"></td>
</tr>

<tr>
<td><label>Apellido</label></td>
<td><input type="text" name="txtApellido" id="txtApellido" maxlength="15" placeholder="Ingresar apellido" required="requerid"></td>
</tr>

<tr>
<td><label>Fecha</label></td>
<td><input type="text" name="txtFecha" id="txtFecha" maxlength="15" value=<%=sdf.format(fecha)%> readonly="readonly"></td>
</tr>

<tr>
<td><input type="submit" name="btnRegistrar" id="btnRegistrar" value="Registrar"></td>
<td><input type="reset" name="btnLimpiar" id="btnLimpiar" value="Limpiar"></td>
</tr>

</table>



</fieldset>

<%
if(mensaje!=null){
%>
<label><%=mensaje%></label>
<%
}
%>
</center>
</form>

</body>
</html>