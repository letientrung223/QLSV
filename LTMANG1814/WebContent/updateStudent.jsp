<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cập nhật thông tin sinh viên</title>
</head>
<body>
<center>
		<form  name=f1 action="UpdateServlet" method="post" >
			<table  border ="1">
				<caption><h4>Cập nhật thông tin sinh viên</h2></caption>
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
			 </table> <br>
					<tr >
						<td> <input type= 'submit' name = 'update' value ='Update'></td>
						<td> <input type= 'reset' value ='RESET' ></td>
					</tr>	
           
            <a href="index.jsp" > Về trang chủ </a> <br>
		</form>
		</center>

</body>
</html>