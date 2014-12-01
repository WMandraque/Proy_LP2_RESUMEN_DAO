<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SOCRATES INTRANET</title>
<link rel="stylesheet" href="css/estilos.css" type="text/css"> <!-- instanciamos el css ---->
</head>
<body>

	<form action="logueo" method="post">
		<center>
			<fieldset>
				<legend><label class="titulos">Ingresar datos</label> </legend>

				<table>

					<tr>
						<td><label>Usuario</label></td>
						<td><input type="text" id="txtUsuario" name="txtUsuario"
							maxlength="4" placeholder="Ingresar usuario" required="requerid"></td>
					</tr>

					<tr>
						<td><label>Clave</label></td>
						<td><input type="password" id="txtPassword"
							name="txtPassword" maxlength="5" placeholder="Ingresar password"
							required="requerid"></td>
					</tr>

					<tr>
						<td><input type="submit" class="button" id="btnIngresar" name="btnIngresar"
							value="Ingresar"></td>
						<td><input type="reset" class="button" id="btnLimpiar" name="btnLimpiar"
							value="Limpiar"></td>
					</tr>

				</table>

			</fieldset>
			
			<%
			String mensaje=(String)request.getAttribute("mensaje");
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