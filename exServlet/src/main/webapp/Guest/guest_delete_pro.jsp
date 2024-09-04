<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");

	
	if(row==1){
%>
	<script>
		opener.location.href="guest_list";
		self.close();
	</script>
<%
	}else{
%>	
	<script>
		alert("비밀번호가 맞지 않습니다");
		history.back();
	</script>
<%
	}
%>
