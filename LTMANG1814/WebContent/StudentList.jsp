<%@ page import=" model.bean.Student" %>
<%@ page import=" java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách sinh viên</title>
</head>
<body>
  <% List <Student> stList =(List <Student>) request.getSession().getAttribute("stList"); %>
 	<form name= "form2" style="text-align: center;">
 	<table border ="1" style="width: 50%" height ="50%" >
 	<caption> <B>Danh sách sinh viên </B></caption>
 		
 			<tr>
 				<th> Mã sinh viên </th>
 				<th> Họ và Tên</th>
 				<th> Khoa</th>
 				<th> Năm sinh </th>
 				
 			</tr>
 		<% for (Student st : stList) {%>
 		<tr>
 			<td> <%= st.getMasv() %></td>
 			<td> <%= st.getHoten() %></td>
 			<td> <%= st.getKhoa() %></td>
 			<td> <%= st.getNamsinh() %></td> 
 			
 		</tr>
 		<%}%>
 	</table>
 	</form>
 	<a href="index.jsp" > Về trang chủ </a> <br>
</body>
</html>