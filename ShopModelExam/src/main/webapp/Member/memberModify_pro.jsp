<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.shop.model.*" %>    

<%
	request.setCharacterEncoding("utf-8");

	MemberDAO dao = new MemberDAO();
	MemberDTO dto = new MemberDTO();
	
	String phone = request.getParameter("phone1") + "-" +
					request.getParameter("phone2") + "-" +
					request.getParameter("phone3");
	dto.setPhone(phone);
	dto.setGender(request.getParameter("gender"));
	dto.setJoindate(request.getParameter("joindate"));
	dto.setGrade(request.getParameter("grade"));
	dto.setCity(request.getParameter("city"));
	
	int row = dao.memberUpdate(dto);
	
	if(row==1){
%>
	<script>
		alert("수정되었습니다.");
		//location.href="../index.jsp";
		location.href="memberList.jsp";
	</script>
 <%
	}else{
 %>
 	<script>
 		alert("수정실패");
 		history.back();
 		
 	</script>
 
 <%
	}
 %>
 
