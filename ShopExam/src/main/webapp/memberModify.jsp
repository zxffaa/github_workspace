<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>
<%
	int custno = Integer.parseInt(request.getParameter("custno"));
	request.setCharacterEncoding("UTF-8");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs=null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	} catch (Exception e) {
		e.printStackTrace();
	}
	String sql="select * from tbl_member where custno=?";
	pstmt=conn.prepareStatement(sql);
	pstmt.setInt(1,custno);
	rs=pstmt.executeQuery();
	rs.next();
	String tel[]=rs.getString("phone").split("-");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table {
	border: 2px solid black;
}

table th {
	border: 1px solid black;
}

table td {
	border: 1px solid black;
}

table td.textareas {
	height: 1px;
	width: 10px;
}
</style>
<script>
function send() {
	if(frm.custno.value==""){
		alert("회원번호 입력해주세요");
		frm.custno.focus();
		return;
	}
	if(frm.custname.value==""){
		alert("회원이름 입력해주세요");
		frm.custname.focus();
		return;
	}
	if(frm.tel1.value==""){
		alert("전화번호 입력해주세요");
		frm.tel1.focus();
		return;
	}
	if(frm.tel2.value==""){
		alert("전화번호 입력해주세요");
		frm.tel2.focus();
		return;
	}
	if(frm.tel3.value==""){
		alert("전화번호 입력해주세요");
		frm.tel3.focus();
		return;
	}
	if(!frm.gender[0].checked&&!frm.gender[1].checked){
		alert("성별체크해주세요");
		return;
	}
	if(frm.joindate.value==""){
		alert("가입일자 입력해주세요");
		frm.joindate.focus();
		return;
	}
	if (frm.grade.selectedIndex == 0) {
        alert("고객등급을 선택하세요");
        return;
    }
	alert("등록되었습니다");
	frm.submit();
}
function cancel() {
	
}
</script>
<body>
	<div align="center">
		<form name="frm" action="memberInsert_pro.jsp">
			<h1>회원수정</h1>
			<table>
				<tr>
					<th>회원번호</th>
					<td><input type="text" name="custno" readonly="readonly" value="<%=rs.getInt("custno")%>"></td>

				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname" readonly="readonly" value="<%=rs.getString("custname")%>"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="tel1" value="<%=tel[0]%>">-<input type="text"
						name="tel2" value="<%=tel[1]%>">-<input type="text" name="tel3" value="<%=tel[2]%>"></td>
				</tr>
				<tr>
					<th>회원성별</th>
					<td><input type="radio" name="gender" value="m" <% if(rs.getString("gender").equalsIgnoreCase("M")){ %> checked <% } %>>남자
 
					<input type="radio" name="gender" value="f" <% if(rs.getString("gender").equalsIgnoreCase("F")){ %> checked <% } %>>여성
					</td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate" value="<%=rs.getString("joindate")%>"></td>
				</tr>
				<tr>
					<th>고객등급</th>
					<td><select name="grade">
							<option>등급</option>
							<option value="A" <% if(rs.getString("grade").equalsIgnoreCase("A")){ %> selected <% } %>>VIP</option>
							<option value="B" <% if(rs.getString("grade").equalsIgnoreCase("B")){ %> selected <% } %>>일반</option>
							<option value="C" <% if(rs.getString("grade").equalsIgnoreCase("C")){ %> selected <% } %>>직원</option>
					</select></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><select name="city">
							<option>도시</option>
							<option value="01" <% if(rs.getString("city").equals("01")){ %> selected <% } %>>서울</option>
							<option value="02" <% if(rs.getString("city").equals("02")){ %> selected <% } %>>경기</option>
							<option value="03" <% if(rs.getString("city").equals("03")){ %> selected <% } %>>인천</option>
							<option value="04" <% if(rs.getString("city").equals("04")){ %> selected <% } %>>강원</option>
							<option value="05" <% if(rs.getString("city").equals("05")){ %> selected <% } %>>충북</option>
							<option value="06" <% if(rs.getString("city").equals("06")){ %> selected <% } %>>충남</option>
							<option value="07" <% if(rs.getString("city").equals("07")){ %> selected <% } %>>전북</option>
							<option value="08" <% if(rs.getString("city").equals("08")){ %> selected <% } %>>전남</option>
							<option value="09" <% if(rs.getString("city").equals("09")){ %> selected <% } %>>경북</option>
							<option value="10" <% if(rs.getString("city").equals("10")){ %> selected <% } %>>경남</option>
							<option value="11" <% if(rs.getString("city").equals("11")){ %> selected <% } %>>제주</option>
					</select></td>
				</tr>
				<tr>
					<th colspan="2"><input type="button" onclick="send()"
						value="등록하기"> <input type="button" value="다시쓰기"
						onclick="cancel"> <a href="index.jsp"><input
							type="button" value="홈으로"></a></th>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>