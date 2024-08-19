<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function send(){
		alert("사원을 등록합니다");
		//유효성검사 생략
		frm.action="memberInsert_pro.jsp"
		frm.submit();
	}
	
	function cancle(){
		alert("등록을 취소합니다");
		history.back();
	}

</script>
</head>
<body>
	<form name="frm" method="post" >
		<table border=1 width=500>
			<tr>
				<th colspan=2>회원등록</th>
			</tr>
			<tr>
				<th>회원번호</th>
				<td><input type="text" name="custno"></td>
			</tr>
			<tr>
				<th>회원성명</th>
				<td><input type="text" name="custname"></td>
			</tr>
			<tr>
				<th>회원전화</th>
				<td><input type="text" name="phone1" size=3>-
					<input type="text" name="phone2" size=4>-
					<input type="text" name="phone3" size=5>
				</td>
			</tr>
			<tr>
				<th>회원성별</th>
				<td><input type="radio" name="gender" value="M">남자
					<input type="radio" name="gender" value="F">여자
				</td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td><input type="text" name="joindate"></td>
			</tr>
			<tr>
				<th>고객등급</th>
				<td><select name="grade">
						<option>고객등급을 선택하세요</option>
						<option value="A"> VIP</option>
						<option value="B">일반</option>
						<option value="C">직원</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>도시코드</th>
				<td><select name="city">
						<option>도시를 선택하세요</option>
						<option value="01">서울</option>
						<option value="02">경기</option>
						<option value="03">인천</option>
						<option value="04">강원</option>
						<option value="05">충북</option>
						<option value="06">충남</option>
						<option value="07">전북</option>
						<option value="08">전남</option>
						<option value="09">경북</option>
						<option value="10">경남</option>
						<option value="11">제주</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan=2 align=center>
					<input type="button" value="등록하기" onClick="send()"> &nbsp;
					<input type="button" value="다시쓰기" onClick="cancle()">
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>