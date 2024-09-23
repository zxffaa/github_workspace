<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
  int bun=Integer.parseInt(request.getParameter("sawonnum"));
  String name=request.getParameter("sawon_name");
  String gen=request.getParameter("gen");
  if(gen.equalsIgnoreCase("M")){
	  gen="남성";
  }else{
	  gen="여성";
  }
  String job=request.getParameter("sawonjob");
  String phone=request.getParameter("sawon_phone");
  String date=request.getParameter("sawon_date");
  String deptdoe=request.getParameter("sawon_deptcode");
  
  out.print(bun);
%>