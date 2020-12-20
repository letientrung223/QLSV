<%@ page import ="model.bean.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  Student std = (Student) request.getSession().getAttribute("student"); %>
	<form name= "form4" style="text-align: center;">
 	<table border ="1"  >
 	<caption> <B>Thông tin sinh viên </B></caption>
 		
 			<tr>
 				<th> Mã sinh viên </th>
 				<th> Họ và Tên</th>
 				<th> Khoa</th>
 				<th> Năm sinh </th>
 			</tr>		
 		<tr>
 			<td> <%= std.getMasv() %></td>
 			<td> <%= std.getHoten() %></td>
 			<td> <%= std.getKhoa() %></td>
 			<td> <%= std.getNamsinh() %></td> 		
 		</tr>
 	</table>
 	<a href="index.jsp" > Về trang chủ </a> <br>   
 	</form>
</body>
</html>