<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
public void jspInit()
{
	String defaultUser= getServletConfig().getInitParameter("defaultUser");
	 ServletContext context= getServletContext(); 
	 context.setAttribute("user", defaultUser);
}

%>
The value of the default user name is: <%=
getServletConfig().getInitParameter("defaultUser")
%>

The value of the servlet context user name is:
<%= getServletContext().getAttribute("user") %>


</body>
</html>