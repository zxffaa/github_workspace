<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	
	if(row==1){
%>
	<script>
		alert("등록되었습니다");
		location.href="guest_list";
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
