<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.sql.*"%>
<%@ page import="com.jslhrd.score.model.*"%>
<% 
request.setCharacterEncoding("UTF-8");

ScoreDAO dao=ScoreDAO.getInstance();
StudentDTO dto=new StudentDTO();
dto.setHakbun(request.getParameter("hakbun"));
dto.setName(request.getParameter("name"));
dto.setPhone1(request.getParameter("phone1"));
dto.setPhone2(request.getParameter("phone2"));
dto.setPhone3(request.getParameter("phone3"));
dto.setBirth(request.getParameter("birth"));
dto.setGender(request.getParameter("gender"));
dto.setRegdate(request.getParameter("regdate"));
int row=dao.StudentCount(dto);
if(row==1){
%>
<script>
		alert("등록되었습니다.");
		location.href="studentWrite.jsp";
	</script>
 <%
	}else{
 %>
 	<script>
 		alert("등록실패");
 		history.back();
 		
 	</script>
 
 <%
	}
 %>
