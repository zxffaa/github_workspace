<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*"%>
<% 

request.setCharacterEncoding("utf-8");

ScoreDAO dao=ScoreDAO.getInstance();
StudentDTO dto = new StudentDTO();

dto.setHakbun(request.getParameter("hakbun"));
dto.setPhone1(request.getParameter("phone1"));
dto.setPhone2(request.getParameter("phone2"));
dto.setPhone3(request.getParameter("phone3"));

dto.setGender(request.getParameter("gender"));
dto.setBirth(request.getParameter("birth"));
dto.setRegdate(request.getParameter("regdate"));

System.out.println("dasd");
int row = dao.studentUpdate(dto);
System.out.println("dad");
if(row==1){
	System.out.println("sd");
%>
	<script>
		alert("수정되었습니다.");
	
		location.href="studentList.jsp";
	</script>
 <%
	}else{
 %>
 	<script>
 		alert("수정실패");
 		//history.back();
 		
 	</script>
 
 <%
	}
 %>