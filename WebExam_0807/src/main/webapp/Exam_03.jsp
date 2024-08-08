<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<head>
<title>회원 가입 페이지</title>
<script>
        function send() {
            if (user.USER_NAME.value == "") {
                alert("이름을 입력하세요");
                user.USER_NAME.focus();
                return;
            }
            if (user.USER_ID.value == "") {
                alert("아이디를 입력하세요");
                user.USER_ID.focus();
                return;
            }
            if (user.USER_PASSWORD.value == "") {
                alert("비밀번호를 입력하세요");
                user.USER_PASSWORD.focus();
                return;
            }
            if (user.USER_PASSWORD_Check.value == "") {
                alert("비밀번호를 재입력하세요");
                user.USER_PASSWORD_Check.focus();
                return;
            }
            if (user.USER_PASSWORD.value != user.USER_PASSWORD_Check.value) {
                alert("비밀번호가 일치하지 않습니다");
                user.USER_PASSWORD_Check.focus();
                return;
            }
            // 라디오 버튼 체크
            if (!user.gender[0].checked && !user.gender[1].checked) {
                alert("성별을 선택하세요");
                return;
            }
            if (user.tel2.value == "") {
                alert("전화번호를 입력하세요");
                user.tel2.focus();
                return;
            }
            if (user.tel3.value == "") {
                alert("전화번호를 입력하세요");
                user.tel3.focus();
                return;
            }
            // 직업유무
            if (user.job.selectedIndex == 0) {
                alert("직업을 선택하세요");
                return;
            }
            // 체크박스 체크
            let flag = 0;
            for (let i = 0; i < user.Kategorie.length; i++) {
                if (user.Kategorie[i].checked) {
                    flag = 1;
                    break;
                }
            }
            if (!flag) {
                alert("관심분야는 1개 이상 선택해주세요");
                return;
            }
            user.submit();
        }
        function mailCheck() {
        	  if (user.email_domain.selectedIndex == 0) {
                  user.email2.readOnly=false;
              }else{
            	  user.email2.readOnly=true;
            	  user.email2.value=user.email_domain.value;
              }
		}
    </script>
</head>
<body>
	<h1 align="center">회원 가입 페이지</h1>
	<div align="center">
		<!--<form name="user" method="post" action="Exam_03_OK.jsp">-->
		<form name="user" method="post" action="Exam_03_OK2.jsp">
			<table>
				<tr>
					<th colspan="2">회원기본정보</th>
				</tr>
				<tr>
					<td>사용자이름</td>
					<td><input type="text" name="USER_NAME" id="USER_NAME"></td>
				</tr>
				<tr>
					<td>사용자아이디</td>
					<td><input type="text" name="USER_ID" id="USER_ID"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
					<input type="password" name="USER_PASSWORD"id="USER_PASSWORD">
					</td>
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="USER_PASSWORD_Check" id="USER_PASSWORD_Check">
					</td>
				</tr>
				<tr>
					<td>성별 확인</td>
					<td>
					<input type="radio" name="gender" value="m" checked>남자
					<input type="radio" name="gender" value="f">여자
					</td>
				</tr>
				<tr>
					<td>연락처</td>
					<td><select name="tel1">
							<option value="010">010</option>
							<option value="011">011</option>
							<option value="02">02</option>
							<option value="031">031</option>
							<option value="032">032</option>
							<option value="062">062</option>
							<option value="033">033</option>
					</select> - <input type="text" name="tel2"> - <input type="text"name="tel3">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" name="email1"> @ <input type="text" name="email2"> <select name="email_domain" onchange="mailCheck()">
							<option>직접입력</option>
							<option value="gmail.com">gmail.com</option>
							<option value="naver.com">naver.com</option>
							<option value="nate.com">nate.com</option>
							<option value="daum.net">daum.net</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>직업</td>
					<td><select name="job">
							<option>직업을 선택하세요</option>
							<option value="housekeeper">가정주부</option>
							<option value="student">학생</option>
							<option value="employee">회사원</option>
							<option value="public_official">공무원</option>
							<option value="accountant">회계사</option>
							<option value="lawyer">변호사</option>
							<option value="etc">기타</option>
					</select></td>
				</tr>
				<tr>
					<td>관심분야</td>
					<td><input type="checkbox" name="Kategorie" value="golf">골프
						<input type="checkbox" name="Kategorie" value="soccer">축구
						<input type="checkbox" name="Kategorie" value="baseball">야구
						<input type="checkbox" name="Kategorie" value="basketball">농구
						<input type="checkbox" name="Kategorie" value="volleyball">배구
					</td>
				</tr>
				<tr>
					<td>기타(한마디)</td>
					<td><textarea rows="10" cols="50" name="remarks"></textarea></td>
				</tr>
				<tr>
					<th colspan="2"><input type="submit" value="가입하기1">&nbsp;&nbsp;
						<input type="button" value="가입하기2" onclick="send()">&nbsp;&nbsp;
						<input type="reset" value="다시쓰기"> &nbsp;&nbsp; <input
						type="button" value="돌아가기"></th>
				</tr>
			</table>
		</form>
	</div>
	<p align="center">
		<a href="index.jsp">홈 바로가기</a>
	</p>
</body>
</html>