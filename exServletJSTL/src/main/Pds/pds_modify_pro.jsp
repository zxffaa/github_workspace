<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int sw = (int)request.getAttribute("sw");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(sw==1){
%>
		   <script language="javascript">
     		//location.replace("pds_list?&page="+${page});
   		   window.opener.location.replace("pds_list?&page=${page}");
     	</script>
<%
	}else{
%>		
		    <script language="javascript">
     			alert("비밀번호가 맞지 않습니다.\n\n글 작성시의 비밀번호를 입력해 주세요.");
     			history.back();
   			</script>
<%
	}
%>	
</body>
</html>