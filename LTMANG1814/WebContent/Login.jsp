<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name= "form1" action="CheckLoginServlet" method="post" style="text-align: center;">
        <font color ="#FF99GF" > <H2> Login </H2></font> 
        <B><TH >User</TH></B>
        <TH><input type="text"  id = user name="id" size="30" required /></TH>
        <Br>  <Br>
        
        <B><TH >Pass</TH></B>
        <TH><input type="password"  id = pass name="pass" size="30" required /></TH>
        <Br> 
        <Br> 
   
        <TH > <input type=submit name=b1 value="Submit" "></TH><br>
        Hướng dẫn : user: admin <br>
        		    pass: 123456
    </form>
</body>
</html>
