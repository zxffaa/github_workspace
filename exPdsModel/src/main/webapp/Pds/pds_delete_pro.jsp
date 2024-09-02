<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.pds.model.*,java.sql.*,com.oreilly.servlet.*,java.sql.*,com.oreilly.servlet.multipart.*,java.io.*"%>

<%
request.setCharacterEncoding("utf-8");

PdsDAO dao = PdsDAO.getInstance();
int idx = Integer.parseInt(request.getParameter("idx"));	
String pass = request.getParameter("pass");
	
String filename=dao.pdsFileSearch(idx);//첨부파일 검색
int row = dao.pdsDelete(idx, pass);

if(row==1){
	if(filename != null){
		ServletContext context = getServletContext();
		String path = context.getRealPath("Pds/upload/");// 파일 저장 경로
		//String path = request.getServletContext().getRealPath("/Pds/upload");			
		File file = new File(path+filename);
		if(file.exists()) {
			file.delete();
		}
	}
%>
<script>
	alert("삭제되었습니다.")
	opener.location.replace("pds_list.jsp");
	self.close();
</script>
<%
}else{
%>
<script>
	alert("비밀번호가 맞지않습니다.")
	history.back();
</script>
<%		
}
%>

