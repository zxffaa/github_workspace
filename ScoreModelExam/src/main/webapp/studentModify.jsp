<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*,java.util.*"%>
<%
	int hakbun = request.getParameter("custno"));
	MemberDAO dao=new MemberDAO();
	MemberDTO dto=dao.getMember(custno);
	String tel[]=dto.getPhone().split("-");
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>