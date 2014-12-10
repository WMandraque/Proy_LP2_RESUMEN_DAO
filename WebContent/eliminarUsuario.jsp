<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eliminar Usuario</title>
<link rel="stylesheet" href="css/estilos.css" type="text/css"> <!-- instanciamos el css -->
</head>
<body>

<form action="GestionaUsuario" method="post">
<center>
<fieldset>

<c:set var="myUsuario" value="${requestScope.usuarioX}"></c:set>

<legend>Eliminar usuarios</legend>
<input type="hidden" name="operacion" id="operacion" value="eliminarUsuario">
<table>

<tr>
<td><label>Usuario</label></td>
<td><input type="text" name="txtUsuario" id="txtUsuario" maxlength="4" placeholder="Ingresar usuario" required="requerid" value="${myUsuario.usuario}" disable></td>
<td><input type="button" value="buscar usuario" onclick="location='GestionaUsuario?operacion=listarUsuarios&tipoListado=listarUsuariosEliminar'"></td>
</tr>

<tr>
<td><label>Clave</label></td>
<td><input type="password" name="txtPassword" id="txtPassword" maxlength="5" placeholder="Ingresar password"  value="${myUsuario.clave}"></td>
</tr>

<tr>
<td><label>Nombre</label></td>
<td><input type="text" name="txtNombre" id="txtNombre" maxlength="15" placeholder="Ingresar nombre"  value="${myUsuario.nombre}"></td>
</tr>

<tr>
<td><label>Apellido</label></td>
<td><input type="text" name="txtApellido" id="txtApellido" maxlength="15" placeholder="Ingresar apellido"  value="${myUsuario.apellido}"></td>
</tr>


<tr>
<td><input type="submit" name="btnEliminar" id="btnEliminar" value="Eliminar"></td>
<td><input type="reset" name="btnLimpiar" id="btnLimpiar" value="Limpiar"></td>
</tr>
</table>


<label class="letras">${requestScope.mensaje}</label>


</fieldset>

</center>
</form>
</body>
</html>