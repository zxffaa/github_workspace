<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.*"%>
<%
int eno = Integer.parseInt(request.getParameter("sawonbun"));
String ename = request.getParameter("sawonname");
String job = request.getParameter("sawonjob");
String manager = request.getParameter("sawonmanager");
String hiredate = request.getParameter("sawonhiredate");
int salary = Integer.parseInt(request.getParameter("sawonsalary"));
int commission = Integer.parseInt(request.getParameter("sawoncommission"));
int dno = Integer.parseInt(request.getParameter("sawondeptnum"));

request.setCharacterEncoding("UTF-8");
Connection conn = null;
PreparedStatement pstmt = null;
try {
	Class.forName("oracle.jdbc.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
} catch (Exception e) {
	e.printStackTrace();
}
int row = 0;
String sql = "insert into emp(eno,ename,job,manager,hiredate,salary,commission,dno)values(?,?,?,?,?,?,?,?)";
pstmt = conn.prepareStatement(sql);
pstmt.setInt(1, eno);
pstmt.setString(2, ename);
pstmt.setString(3, job);
pstmt.setString(4, manager);
pstmt.setString(5, hiredate);
pstmt.setInt(6, salary);
pstmt.setInt(7, commission);
pstmt.setInt(8, dno);
row = pstmt.executeUpdate();
%>
<body>
	<%
	if (row == 1) {
	%>
	<h3>등록되어있습니다</h3>
	<%
	} else {
	%>
	<h3>등록실패</h3>
	<%
	}
	%>
	<a href="index.jsp">홈으로</a>
</body>
