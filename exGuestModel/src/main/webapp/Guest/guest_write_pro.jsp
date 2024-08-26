<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.guest.model.*" %>
<% 
	request.setCharacterEncoding("utf-8");
	GuestDAO dao=GuestDAO.getInstance();
	GuestDTO dto=new GuestDTO();
	
	dto.setName(request.getParameter("name"));
	dto.setSubject(request.getParameter("subject"));
	dto.setContents(request.getParameter("contents"));
	
	int row=dao.GuestWrite(dto);
	if(row==1){
		response.sendRedirect("guest_list.jsp");
	}else{
%>
	<script>
		alert("등록실패");
		history.back();
	</script>
    
<%
	}
%> 