<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.pds.model.*,java.sql.*,com.oreilly.servlet.*,java.sql.*,com.oreilly.servlet.multipart.*"%>
<%
	request.setCharacterEncoding("utf-8");
	PdsDAO dao=PdsDAO.getInstance();
	PdsDTO dto=new PdsDTO();
	
	ServletContext context=getServletContext();
	//파일저장경로
	String path=context.getRealPath("Pds/upload");
	String encType="UTF-8";
	int maxSize=2*1024*1024;//저장용량(2M)
	
	int row=0;
	try{
		//기본 지정
		MultipartRequest multi=new MultipartRequest(request,path,maxSize,encType,new DefaultFileRenamePolicy());
		//파일 중복시 이름을 바꿔서 추가해준다
		//new DefaultFileRenamePolicy()
		dto.setName(multi.getParameter("name"));
		dto.setEmail(multi.getParameter("email"));
		dto.setSubject(multi.getParameter("subject"));
		dto.setContents(multi.getParameter("contents"));
		dto.setPass(multi.getParameter("pass"));
		
		dto.setFilename(multi.getFilesystemName("filename"));
		String o_file_name=multi.getOriginalFileName("filename");
		
		row=dao.pdsWrite(dto);
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	if(row==1){
		response.sendRedirect("pds_list.jsp");
	}else{
%>
	<script>
	alert("등록실패");
	</script>
<% 
	}
%>
	