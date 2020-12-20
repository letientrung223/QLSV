<%@ page import=" model.bean.Account" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1> Thong tin account </H1>
<%
	Account a = (Account)request.getSession().getAttribute("account");
	if (a!=null)
		{
%>
			id  : <%= a.getId()  %><br>
			pass: <%= a.getPass()  %><br>
			info:<%= a.getInfo() %>
<%		} 
	else{ 
	response.sendRedirect("LoginServlet");
	} 
%>
</body>
</html>