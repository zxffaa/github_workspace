<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.guest.model.*" %>

<%
	request.setCharacterEncoding("utf-8");
	GuestDAO dao = GuestDAO.getInstance();
	GuestDTO dto=new GuestDTO();
	
	
	dto.setSubject(request.getParameter("subject"));
	dto.setContents(request.getParameter("contents"));
	dto.setIdx(Integer.parseInt(request.getParameter("idx")));
	int row = dao.GuestModify(dto);
	if(row==1){
		response.sendRedirect("guest_list.jsp");
	}else{
%>
	<script>
		alert("수정실패");
		history.back();
	</script>
    
<%
	}
%>