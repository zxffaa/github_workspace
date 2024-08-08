<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
//전 페이지(exam_03.jsp)에서 넘어온 값 받기(request)
String USER_NAME = request.getParameter("USER_NAME");
String USER_ID = request.getParameter("USER_ID");
String USER_PASSWORD = request.getParameter("USER_PASSWORD");
String USER_PASSWORD_Check = request.getParameter("USER_PASSWORD_Check");
String gender = request.getParameter("gender");
String tel1 = request.getParameter("tel1");
String tel2 = request.getParameter("tel2");
String tel3 = request.getParameter("tel3");
String email1 = request.getParameter("email1");
String email2 = request.getParameter("email2");
String job = request.getParameter("job");
String[] Kategorie = request.getParameterValues("Kategorie");
String remarks = request.getParameter("remarks");
%>

<body>
<div align="center">
<h1>입력한 정보</h1>
	<table border=1 width=300>
		<tr>
			<td>이름</td>
			<td><%=USER_NAME%></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%=USER_ID%></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=USER_PASSWORD%></td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
				<%
				if (USER_PASSWORD.equalsIgnoreCase("M")) {
					out.print("남성" + "<br>");
				} else {
					out.print("여성" + "<br>");
				}
				%>
			</td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><%=tel1%>-<%=tel2%>-<%=tel3%></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><%=email1%>@<%=email2%></td>
		</tr>
		<tr>
			<td>일</td>
			<td><%=job%></td>
		</tr>
		<tr>
			<td>관심분야</td>
			<td>
				<%
				for (int i = 0; i < Kategorie.length; i++) {
					out.print(Kategorie[i] + " ");
				}
				out.print("<br>");
				%>
			</td>
		</tr>
		<tr>
			<td>기타의견</td>
			<td><%=remarks%></td>
		</tr>
	</table>
	</div>
</body>