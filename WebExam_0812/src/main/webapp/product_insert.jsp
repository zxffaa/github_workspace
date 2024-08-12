<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{ border:2px solid black; width:400px; height:200px;}
table td{border:1px solid black;}
</style>
<script>
	function check() {
		if(frm.insert_bun.value==""){
			alert("입출고번호가 없습니다");
			frm.insert_bun.focus();
			return
		}
		if(frm.product_code.value==""){
			alert("제품코드가 없습니다");
			frm.product_code.focus();
			return
		}
		if (!frm.insert[0].checked && !frm.insert[1].checked) {
            alert("입출고를 선택하세요");
            return;
        }
		if(frm.product_count.value==""){
			alert("수량을 입력해주세요");
			frm.product_count.focus();
			return
		}
		if(frm.product_day.value==""){
			alert("거래일자가 없습니다");
			frm.product_day.focus();
			return
		}
		if (frm.account.selectedIndex == 0) {
            alert("거래처를 선택하세요");
            return;
        }
		frm.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<h1>입출고등록</h1>
		<form action="product_insert_ok.jsp" name="frm">
			<table>
				<tr>
					<td>입출고번호</td>
					<td><input type="text" name="insert_bun"></td>
				</tr>
				<tr>
					<td>제품코드</td>
					<td><input type="text" name="product_code"></td>
				</tr>
				<tr>
				<td>입출고구분</td>
					<td>
					<input type="radio" name="insert" value="I">입고 
					<input type="radio" name="insert" value="O">출고
					</td>
				</tr>
				<tr>
					<td>수량</td>
					<td><input type="text" name="product_count"></td>
				</tr>
				<tr>
					<td>거래일자</td>
					<td><input type="text" name="product_day"></td>
				</tr>
				<tr>
				<td>거래처명</td>
				<td>
				<select name="account">
				<option >거래처명</option>
				<option value="10">서울공장</option>
				<option value="20">울산공장</option>
				<option value="30">부산상사</option>
				<option value="40">광주상사</option>
				<option value="50">대전상사</option>
				</select>
				</td>
				</tr>
				<tr>
				<th colspan="2">
				<input type="button" name="ins" value="입출고등록" onclick="check()">
				<input type="reset" name="re" value="다시쓰기">
				<a href="index.jsp"><input type="button" name="homeback" value="홈으로"></a>
				</th>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>