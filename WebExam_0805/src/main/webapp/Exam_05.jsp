<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*" %>
 <% List<String>sList=new ArrayList();
 	//번호,이름,성별,생년월일,급여
 	sList.add("1000,김사원,M,901010,300");
 	sList.add("1001,이사원,F,931111,500");
 	sList.add("1002,박사원,F,890110,400");
 	sList.add("1003,공사원,M,920513,350");
 	sList.add("1004,윤사원,F,910321,290");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
	<tr>
		<td>
		사원번호
		</td>
		<td>
		사원성명
		</td>
		<td>
		성별
		</td>
		<td>
		생년월일
		</td>
		<td>
		급여
		</td>
	</tr>
	<%for(int i=0;i<sList.size();i++){
			String[] b=sList.get(i).split(",");
			%>
	<tr>
		<td>
		<%=b[0]%>
		</td>
		<td>
		<%=b[1]%>
		</td>
		<td>
		<%if(b[2].equalsIgnoreCase("M")){
			b[2]="남성";
		}else{
			b[2]="여성";
		}
		%>
		<%=b[2]%>
		</td>
		<td>
		<%
		String year=b[3].substring(0, 2);
		String month=b[3].substring(2, 4);
		String day=b[3].substring(4,6);
		%>
		<%=year%>년
		<%=month%>월
		<%=day%>일
		</td>
		<td>
		<%=b[4]%>
		</td>
		
	</tr>
	<% }%>
</table>
</body>
</html>