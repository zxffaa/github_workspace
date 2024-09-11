<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	
	if(row==1){
%>
	<script>
		alert("수정되었습니다");
		location.href="guest_list";
	</script>
<%
	}else{
%>	
	<script>
		alert("비밀번호가 맞지 않습다. \n 다름에 다시 .......");
		history.back();
	</script>
<%
	}
%>
