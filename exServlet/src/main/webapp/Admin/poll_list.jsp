<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<title>설문조사 관리 - 관리자페이지</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css"> 
<!-- 
body,td,tr,table{font-size:9pt; font-family:tahoma;color:#666666;line-height:160%;} 

A:link {font-family:tahoma;font-size:9pt;color:#666666;text-decoration:none;} 
A:visited {font-family:tahoma;font-size:9pt;color:#666666;text-decoration:none;} 
A:active {font-family:tahoma;font-size:9pt;color:#666666;text-decoration:none;} 
A:hover {font-family:tahoma;font-size:9pt;color:#009900;text-decoration:underline;} 
--> 
</style> 


</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td>  <!--  top menu -->  </td>
	</tr>
	<tr>
		<td align="center" height="100%" valign=middle><br>
			<table width="30%" border="1" cellspacing="0" cellpadding="3" bgcolor="#FFCC66" bordercolor="#FFFFFF" bordercolorlight="#000000">
				<tr> 
					<td height=40 align="center" style="font-size: 15px;"><b>설문조사 리스트</b></a></b></td>
				</tr>
			</table><br>
			<table width="80%" border="0" cellspacing="0" cellpadding="0">
				<tr>
                    <td height="20">* 총 등록수 : <font color=red>20</font> 건</td>
                </tr>
                <tr>
					<td>
						<table width="100%" border="0" cellpadding="6" cellspacing="1" bgcolor="DDDDDD">
							<tr bgcolor="EcECEC">
								<td width="15%" align="center" bgcolor="EcECEC"><strong>번호</strong></td>
								<td align="center" bgcolor="EcECEC"><strong>설문제목</strong></td>
								<td width="20%" align="center"><strong>등록일자</strong></td>
							</tr>
							<tr>
								<td align="center" bgcolor="#FFFFFF">5</td>
								<td bgcolor="#FFFFFF"><a href="" class="unnamed1">설문제목입니다</a></td>
								<td align="center" bgcolor="#FFFFFF">2019-01-01</td>
							</tr>
							<tr>
								<td height="35" colspan="10" align="center" bgcolor="#FFFFFF"><font face="돋움" size="2">[1][2][3]</font></td>
							</tr>
							<form>
							<!-- 검색어를 이용하여 글제목, 작성자, 글내용 중에 하나를 입력 받아 처리하기 위한 부분 -->
							<tr>
								<td colspan="10" align="center" bgcolor="#FFFFFF"><table width="610" border="0" cellspacing="0" cellpadding="0">
                            <tr>
								<td width=80% height="30" colspan="2" align="right">
									<select name="search" class="textfield">
										<option value="question">설문제목</option>
									</select>
									<input name="key" type="text" class="textfield" size="30" value=""></td>
								<td width=20% align="right">
									<a href=""><b>[검색]</b></a>  &nbsp;
									<a href="poll_write.jsp"><b>[글쓰기]</b></a>
								</td>
                            </tr>
							</form>			
                        </table>
					</td>
                </tr>
            </table>
		</td>
     </tr>
</table>
</body>
</html>
