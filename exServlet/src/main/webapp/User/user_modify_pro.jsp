<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	if(row==1){
%>
	<script>
		location.href="index";
	</script>
<%
	}else{
%>	
	<script>
		alert("수정실패 비밀번호가 다릅니다.");
		history.back();
	</script>
<%
	}
%>