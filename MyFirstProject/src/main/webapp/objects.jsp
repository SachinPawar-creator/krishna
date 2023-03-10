<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
       String userName= request.getParameter("userName"); 

if(userName!=null)
{
	session.setAttribute("name", userName);
	application.setAttribute("name", userName);
	pageContext.setAttribute("name", userName);
	pageContext.setAttribute("name", userName, PageContext.APPLICATION_SCOPE);

}


%>
<br>
UserName of the session is <%=userName %>
 <br>
UserName for the application is <%=application.getAttribute("name") %>
<br>
userNaem for the page context is <%=pageContext.getAttribute("name") %>
<br>
userNaem for the session is context is <%=session.getAttribute("name") %>
<br>

</body>
</html>