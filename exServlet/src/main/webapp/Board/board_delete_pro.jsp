<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.board.model.*"%>

<%
	request.setCharacterEncoding("utf-8");
	
	BoardDAO dao = BoardDAO.getInstance();
	BoardDTO dto = new BoardDTO();
	int idx = Integer.parseInt(request.getParameter("idx"));
	String pass = request.getParameter("pass");
	
	dto.setIdx(Integer.parseInt(request.getParameter("idx")));
	dto.setPass(request.getParameter("pass"));

	
	int row = dao.boardDelete(dto);
	
	if(row==1){
	%>
<script>
		//alear("삭제되었습니다");
		opener.location.replace("board_list.jsp");
		self.close();
	</script>
<% 
	}else{
%>
	<script>
		alert("삭제실패");
		history.back();
	</script>
<%
	}
%>
