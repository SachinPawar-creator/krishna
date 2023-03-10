<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Testing JSP's</h1>

	<%!public int data(int a, int b)

	{

		return a + b;

	}%>



	<%
	int i = 1;
	%>

	<%
	int k;
	k = data(265, 362);
	%>
	<br> The value of k is:
	<%=k%>!


	<%
	for (i = 0; i < 5; i++) {
	%>
	<br> The value of i is
	<%=i%>


	<%
	}
	%>


</body>
</html>