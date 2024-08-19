<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*,com.jslhrd.shop.model.*" %>    

<%
	int custno = Integer.parseInt(request.getParameter("custno"));
	MemberDAO dao=new MemberDAO();
	MemberDTO dto=dao.getMember(custno);
	String tel[]=dto.getPhone().split("-");
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function send(){
		alert("사원을 수정합니다");
		//유효성검사 생략
		frm.action="memberModify_pro.jsp"
		frm.submit();
	}
	
	function cancle(){
		alert("수정을 취소합니다");
		history.back();
	}

</script>
</head>
<body>
	<form name="frm" method="post" >
		<table border=1 width=500>
			<tr>
				<th colspan=2>회원정보수정</th>
			</tr>
			<tr>
				<th>회원번호</th>
				<td><input type="text" name="custno" readonly value="<%= dto.getCustno() %>"></td>
			</tr>
			<tr>
				<th>회원성명</th>
				<td><input type="text" name="custname" readonly value="<%= dto.getCustname() %>"></td>
			</tr>
			<tr>
				<th>회원전화</th>
				<td><input type="text" name="phone1" size=3 value="<%= tel[0] %>">-
					<input type="text" name="phone2" size=4 value="<%= tel[1] %>">-
					<input type="text" name="phone3" size=5 value="<%= tel[2] %>">
				</td>
			</tr>
			<tr>
				<th>회원성별</th>
				<td><input type="radio" name="gender" value="M" <% if(dto.getGender().equals("M")){ %> checked <% } %>>남자
					<input type="radio" name="gender" value="F" <% if(dto.getGender().equals("F")){ %> checked <% } %>>여자
				</td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td><input type="text" name="joindate" value="<%=dto.getJoindate() %>"></td>
			</tr>
			<tr>
				<th>고객등급</th>
				<td><select name="grade">
						<option>고객등급을 선택하세요</option>
						<option value="A" <% if(dto.getGrade().equals("A")){ %> selected <% } %>> VIP</option>
						<option value="B" <% if(dto.getGrade().equals("B")){ %> selected <% } %>>일반</option>
						<option value="C" <% if(dto.getGrade().equals("C")){ %> selected <% } %>>직원</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>도시코드</th>
				<td><select name="city">
						<option>도시를 선택하세요</option>
						<option value="01" <% if(dto.getCity().equals("01")){ %> selected <% } %>>서울</option>
						<option value="02" <% if(dto.getCity().equals("02")){ %> selected <% } %>>경기</option>
						<option value="03" <% if(dto.getCity().equals("03")){ %> selected <% } %>>인천</option>
						<option value="04" <% if(dto.getCity().equals("04")){ %> selected <% } %>>강원</option>
						<option value="05" <% if(dto.getCity().equals("05")){ %> selected <% } %>>충북</option>
						<option value="06" <% if(dto.getCity().equals("06")){ %> selected <% } %>>충남</option>
						<option value="07" <% if(dto.getCity().equals("07")){ %> selected <% } %>>전북</option>
						<option value="08" <% if(dto.getCity().equals("08")){ %> selected <% } %>>전남</option>
						<option value="09" <% if(dto.getCity().equals("09")){ %> selected <% } %>>경북</option>
						<option value="10" <% if(dto.getCity().equals("10")){ %> selected <% } %>>경남</option>
						<option value="11" <% if(dto.getCity().equals("11")){ %> selected <% } %>>제주</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan=2 align=center>
					<input type="button" value="수정하기" onClick="send()"> &nbsp;
					<input type="button" value="취소하기" onClick="cancle()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>