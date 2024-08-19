<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.jslhrd.shop.model.*" %>    

<%
	MemberDAO dao = new MemberDAO();
	//회원수 조회
	int cnt = dao.memberCount();
	//회원목록 조회
	List<MemberDTO> list = dao.memberList();

%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1 width=700>
		<tr>
			<th colspan=7>회원목록조회/수정(회원수 : <%= cnt %> 명)</th>
		</tr>
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>성별</th>
			<th>가입일자</th>
			<th>고객등급</th>
			<th>거주지역</th>
		</tr>
<%
	for(MemberDTO dto : list){
		String gender="여자";
		if(dto.getGender().equals("M"))
			gender="남자";
%>		
		<tr>
			<td><a href="memberModify.jsp?custno=<%= dto.getCustno() %>"><%= dto.getCustno() %></a></td>
			<td><%= dto.getCustname() %></td>
			<td><%= dto.getPhone() %></td>
			<td><%= gender %></td>
			<td><%= dto.getJoindate() %></td>
			<td><%= dto.getGrade() %></td>
			<td><%= dto.getCity() %></td>
		</tr>
<%
	}
%>		
	</table>
</body>
</html>