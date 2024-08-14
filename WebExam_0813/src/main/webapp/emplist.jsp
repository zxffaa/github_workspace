<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	String sql="select * from emp";
	pstmt=conn.prepareStatement(sql);
	rs=pstmt.executeQuery();
	
	
%>



<style>
table{ border:2px solid black; width:600px}
table td{ border:1px solid black; text-align:center;}
table th{ border:1px solid black;}
table td.money{text-align:right;}
</style>
</head>
<body>
<div align="center">
	<table>
	<tr>
	<th colspan="8">전체사원리스트</th>
	</tr>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>직업</th>
			<th>상사번호</th>
			<th>입사일자</th>
			<th>연봉</th>
			<th>커미션</th>
			<th>부서번호</th>
		</tr>
<%
while(rs.next()){
	String year=rs.getString("hiredate").substring(0,4);
String month=rs.getString("hiredate").substring(5,7);
String day=rs.getString("hiredate").substring(8,10);
	
%>
		<tr>
			<td><%=rs.getInt("eno")%></td>
			<td><%=rs.getString("ename")%></td>
			<td><%=rs.getString("job") %></td>
			<td><%=rs.getInt("manager")%></td>
			<td><%=year%>년<%=month%>월<%=day%>일</td>
			<td class="money"><%=rs.getInt("salary")%></td>
			<td class="money"><%=rs.getInt("commission")%></td>
			<td class="money"><%=rs.getInt("dno")%></td>
		</tr>
<% 
}
%>
	</table>
	<br>
	<a href="index.jsp">홈으로</a>
</div>
</body>
</html>