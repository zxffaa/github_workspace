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
	}else if(row==0){
%>	
	<script>
		alert("비밀번호가 틀립니다");
		history.back();
	</script>
<%
	}else{
%>
<script>
		alert("아이디가 존재하지 않습니다");
		history.back();
	</script>
<%	
	}
%>