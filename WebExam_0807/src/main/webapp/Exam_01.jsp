<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
select.sel{ width:100px; }
</style>
</head>
<body>
<p align="center"><a href="index.jsp">홈 바로가기</a></p>
<br>
	<form action="">
		<!-- name은 자바에서 쓰는 변수명(name이 같으면 배열로 본다) id는 중복불가 -->
		아이디: <input type="text" name="id" id=""> <br>
		비밀번호: <input type="password" name="pass" id=""> <br>
		취미선택: 
		야구<input type="checkbox" name="aa">
		농구<input type="checkbox" name="aa">
		축구<input type="checkbox" name="aa">
		배구<input type="checkbox" name="aa">
		<br>
		성별:
		<input type="radio" name="gender"> 남성
		<input type="radio" name="gender"> 여성
		<br>
		직업:<select name="job" class="sel">
			<option>학생</option>
			<option>주부</option>
			<option>회사원</option>
			<option>공무원</option>
			<option>변호사</option>
			<option>자영업</option>
			<option>기타</option>
		</select>
		<br>
		자기소개:<textarea rows="2" cols="30" name=""></textarea>
		<br>
		<input type="button" value="등록">
		<input type="button" value="취소"> 
	</form>
</body>
</html>