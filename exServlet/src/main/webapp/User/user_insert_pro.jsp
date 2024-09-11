<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	
	if(row==1){
%>
	<script>
		alert("회원가입되었습니다");
		location.href="/index";
	</script>
<%
	}else{
%>	
	<script>
		alert("등록실패 \n 다름에 다시 .......");
		history.back();
	</script>
<%
	}
%>
