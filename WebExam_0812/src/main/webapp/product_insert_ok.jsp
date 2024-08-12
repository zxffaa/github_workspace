<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String insert_bun = request.getParameter("insert_bun");
String product_code = request.getParameter("product_code");
String insert = request.getParameter("insert");
if(insert.equalsIgnoreCase("I")){
	insert="입고";
}else{
	insert="출고";
}
String product_count = request.getParameter("product_count");
String product_day = request.getParameter("product_day");
String year=product_day.substring(0, 4);
String month=product_day.substring(4,6);
String day=product_day.substring(6,8);
String company = "";
int account = Integer.parseInt(request.getParameter("account"));
	switch (account) {
		case 10:
			company = "서울공장";
			break;
		case 20:
			company = "울산공장";
			break;
		case 30:
			company = "부산상사";
			break;
		case 40:
			company = "광주공장";
			break;
		case 50:
			company = "대전상사";
			break;
		default:
			break;
	}
%>
<style>
table{ border:2px solid black; width:400px; height:200px;}
table td{border:1px solid black;}
</style>
<body>
<div align="center">
<table>
				<tr>
					<td>입출고번호</td>
					<td><%=insert_bun%></td>
				</tr>
				<tr>
					<td>제품코드</td>
					<td><%=product_code%></td>
				</tr>
				<tr>
				<td>입출고구분</td>
				<td><%=insert%></td>
				</tr>
				<tr>
					<td>수량</td>
					<td><%=product_count%></td>
				</tr>
				<tr>
					<td>거래일자</td>
					<td><%=year%>년<%=month%>월<%=day%>일</td>
				</tr>
				<tr>
				<td>거래처명</td>
				<td><%=company%></td>
				</tr>
				<tr>
				<th colspan="2">
				<a href="product_insert.jsp"><input type="button" value="돌아가기"></a>
				<a href="index.jsp"><input type="button" value="홈으로"></a>
				</th>
				</tr>
			</table>
			</div>
</body>
