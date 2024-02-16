<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int dan =Integer.parseInt(request.getParameter("dan"));
			System.out.println(dan) ;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단 프로그램</h1>
	<h2><%=dan %>단</h2>
	<table border="1">

			<%
				for(int  i=2; i<=9; i++){
			%>
			<tr>
				<td><%=dan %></td>
				<td><%=i %></td>
				<td><%=dan*i %></td>
			</tr>		
			<% 
			}
			
			%>			
				
	</table>
</body>
</html>