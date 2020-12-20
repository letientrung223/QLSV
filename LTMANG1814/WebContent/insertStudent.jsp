<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm thông tin sinh viên</title>
</head>
<body>
<center>
		<form  name=f1 action="InsertServlet" method="post">
			<table border="0" style="margin-right: auto; margin-left: auto;table-layout:fixed">
				<caption><h4>Thêm thông tin sinh viên</h2></caption>
					<tr >
						<td > Mã sinh viên: </td>
						<td><input type='text' name = 'textmasv' required></td>
					</tr>
	
					<tr >
						<td > Họ tên: </td>
						<td><input type='text' name = 'texthoten' required></td>
					</tr>

					<tr >
						<td > Khoa:</td> 
						<td><input type='text' name = 'textKhoa' required></td>
					</tr>
					<tr >
						<td > Năm sinh:</td>
						<td><input type='text' name = 'textNamsinh' required></td>
					</tr>

					<tr >
						<td> <input type= 'submit' value ='Insert'></td>
						<td> <input type= 'reset' value ='Reset' ></td> 
					</tr>
					
            </table>
            <a href="index.jsp"> Về trang chủ </a>
		</form>
		</center>

</body>
</html>