<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xóa thông tin sinh viên</title>
</head>
<body>
<form  name=f1 action="DeleteServlet" method="post">
			<table border="0" style="margin-right: auto; margin-left: auto;table-layout:fixed">
				<caption><h4>Xóa thông tin sinh viên</h2></caption>
					<tr >
						<td > Nhập mã sinh viên: </td>
						<td><input type='text' name = 'textmasv' ></td>
					</tr>
					<tr>
					<td> <input type= 'submit' name = 'delete' value ='Delete'></td>
					<td><a href="index.jsp" > Về trang chủ </a> <br></td>
					</tr>
			</table>
			
</form>
</body>
</html>