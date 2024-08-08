<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	//전 페이지(exam_03.jsp)에서 넘어온 값 받기(request)
	String USER_NAME=request.getParameter("USER_NAME");
	String USER_ID=request.getParameter("USER_ID");
	String USER_PASSWORD=request.getParameter("USER_PASSWORD");
	String USER_PASSWORD_Check=request.getParameter("USER_PASSWORD_Check");
	String gender=request.getParameter("gender");
	String tel1=request.getParameter("tel1");
	String tel2=request.getParameter("tel2");
	String tel3=request.getParameter("tel3");
	String email1=request.getParameter("email1");
	String email2=request.getParameter("email2");
	String job=request.getParameter("job");
	String[] Kategorie=request.getParameterValues("Kategorie");
	String remarks=request.getParameter("remarks");
	
	out.print("이름: " +USER_NAME+"<br>");
	out.print("아이디: " +USER_ID+"<br>");
	out.print("비밀번호: " +USER_PASSWORD+"<br>");
	out.print("비밀번호 확인: " +USER_PASSWORD_Check+"<br>");
	out.print("성별: " +gender+"<br>");
	out.print("전화번호: " +tel1+"-"+tel2+"-"+tel3+"<br>");
	out.print("이메일: " +email1+"@"+email2+"<br>");
	out.print("직업: " +job+"<br>");
	out.print("관심분야: ");
	for(int i=0;i<Kategorie.length;i++){
		out.print(Kategorie[i]+" ");
	}
	out.print("<br>");
	out.print("기타: " +remarks+"<br>");
%>