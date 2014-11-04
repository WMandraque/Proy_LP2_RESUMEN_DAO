<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SOCRATES INTRANET</title>
</head>
<body>

	<form action="logueo">
		<center>
			<fieldset>
				<legend>Ingresar datos</legend>

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
						<td><input type="submit" id="btnIngresar" name="btnIngresar"
							value="Ingresar"></td>
						<td><input type="reset" id="btnLimpiar" name="btnLimpiar"
							value="Limpiar"></td>
					</tr>

				</table>

			</fieldset>
			
			<%
			  String mensaje=(String)request.getAttribute("mensaje");
			if(mensaje!=null){
				out.print(mensaje);
			}
			%>
		</center>
	</form>

</body>
</html>