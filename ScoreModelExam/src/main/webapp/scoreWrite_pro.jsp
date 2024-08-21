<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.sql.*"%>
<%@ page import="com.jslhrd.score.model.*"%>
<% 
request.setCharacterEncoding("UTF-8");

ScoreDAO dao=ScoreDAO.getInstance();
ScoreDTO dto=new ScoreDTO();
dto.setHakbun(request.getParameter("hakbun"));
dto.setKor(Integer.parseInt(request.getParameter("kor")));
dto.setEng(Integer.parseInt(request.getParameter("eng")));
dto.setMat(Integer.parseInt(request.getParameter("mat")));
int row=dao.scoreInsert(dto);
if(row==1){
%>
<script>
		alert("등록되었습니다.");
		location.href="scoreWrite.jsp";
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
