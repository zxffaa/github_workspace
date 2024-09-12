 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int row = (int)request.getAttribute("row");

	if(row==1){
%>
		   <script language="javascript">
		   //location.href="board_list?page=${page}";
		   window.opener.location.replace("board_list?&page=${page}")
		   self.close();
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