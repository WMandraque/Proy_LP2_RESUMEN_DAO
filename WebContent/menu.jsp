<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body bgcolor="yellow">


<center>Operaciones</center>

<dl>
<dt>Mantenimiento</dt>
<li><a href="registrarUsuario.jsp" target="central">Registrar Usuario</a></li>
<li><a href="actualizarUsuario.jsp" target="central">Actualizar Usuario</a></li>
<li><a href="eliminarUsuario.jsp" target="central">Eliminar Usuario</a></li>
<li><a href="GestionaUsuario?operacion=listarUsuarios" target="central">Listar Usuarios</a></li>
</dl>


<dl>
<dt>Venta</dt>
<li><a href="registrarVenta.jsp" target="central">Registrar Venta</a></li>
<li><a href="GestionaVenta?operacion=listarVentas" target="central">Listar Ventas</a></li>
</dl>

<dl>
<dt>Productos</dt>
<li><a href="GestionaProducto?operacion=listarProductos" target="central">Listar Productos</a></li>
</dl>


<dl>
<dt>Salir de esta pagina</dt>
<li><a href="cerrando" target="_top">Cerrar sesion</a></li>
</dl>

</body>
</html>