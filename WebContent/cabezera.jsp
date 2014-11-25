<%@page import="com.proyecto.beans.UsuarioDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">

<hr>
<center><label>SOCRATE INTRANET</label> </center>
<hr>

<%
		String datos = (String) request.getAttribute("datos");
		if (datos != null)
			out.println("Bienvenido: <b>" + datos + "</b>");
%>

<%
        HttpSession miSession=request.getSession();
		String datosSession = (String) miSession.getAttribute("datos");
		if (datosSession == null){
%>			
			<jsp:forward page="logueo.jsp"></jsp:forward>
<%			
		}else{
			out.println("Bienvenido: <b>" + datosSession + "</b>");
		}
			
%>


</body>
</html>