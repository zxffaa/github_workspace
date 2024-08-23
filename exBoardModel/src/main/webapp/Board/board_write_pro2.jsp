<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.board.model.*" %>

<%
	request.setCharacterEncoding("utf-8");
	
	BoardDAO dao = BoardDAO.getInstance();
	BoardDTO dto = new BoardDTO();
	
	dto.setName(request.getParameter("name"));
	dto.setEmail(request.getParameter("email"));
	dto.setSubject(request.getParameter("subject"));
	dto.setContents(request.getParameter("contents"));
	dto.setPass(request.getParameter("pass"));
	//테스트
	//out.print(dto.getName());
	
	int row = dao.boardWrite(dto);
	if(row==1){
%>
	<script>
		alert("등록되었습니다");
		location.href="board_list.jsp";
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