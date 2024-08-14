<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	alert("사원을 수정합니다");

	frm.action="memberModify.jsp"
	frm.submit();

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
					<th>회원번호(자동발생)</th>
					<td><input type="text" name="custno"></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="tel1">-<input type="text"
						name="tel2">-<input type="text" name="tel3"></td>
				</tr>
				<tr>
					<th>회원성별</th>
					<td><input type="radio" name="gender" value="m">남성 <input
						type="radio" name="gender" value="f">여성</td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate"></td>
				</tr>
				<tr>
					<th>고객등급</th>
					<td><select name="grade">
							<option>등급</option>
							<option value="A">VIP</option>
							<option value="B">일반</option>
							<option value="C">직원</option>
					</select></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><select name="city">
							<option>도시</option>
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
					</select></td>
				</tr>
				<tr>
				<th colspan="2">
				<input type="button" onclick="send()" value="등록하기">
				<input type="button" value="다시쓰기" onclick="cancel">
				<a href="index.jsp"><input type="button" value="홈으로"></a>
				</th>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>