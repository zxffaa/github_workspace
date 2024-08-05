<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
	String name="김사원";
	String gender="F";
	String birth="900715";
	String year=birth.substring(0, 2);
	String month=birth.substring(2, 4);
	String day=birth.substring(4,6);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
	<tr>
	<td>
	이름
	</td>
	<td>
	성별
	</td>
	<td>
	생년월일
	</td>
	</tr>
	<tr>
	<td>
	<%=name%>
	</td>
	<td>
	<%if(gender.equalsIgnoreCase("M")){
		gender="남성";
	}else{
		gender="여성";
	}
		%>
	<%=gender%>
	</td>
	<td>
	<%=year%>년
	<%=month%>월
	<%=day%>일
	</td>
	</tr>
</table>
</body>
</html>