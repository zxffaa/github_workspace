<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Include/topmenu.jsp" %>
<%@ page import="java.util.*,com.jslhrd.exservlet.model.pds.*" %>
<% 
PdsDTO pds = (PdsDTO)request.getAttribute("pds");
%>
<html>
   <head>
      <title> 게시판 내용 보기 </title>
 <link rel="stylesheet" type="text/css" href="/stylesheet.css">
   <style type="text/css">
     td.title { padding:4px; background-color:#e3e9ff }
     td.content { padding:10px; line-height:1.6em; text-align:justify; }
     a.list { text-decoration:none;color:black;font-size:10pt; }
   </style>
   <script>
   function pds_del() {
	url="pds_delete?idx="+${pds.idx};
	window.open(url,"자료실 삭제","width=300,height=200")
}
   function pds_down(url) {
	   //URL(GET방식에서 한글 전송)
	   var encURL=encodeURL(url,'UTF-8');
	   location.href="/prs_down?filename=?"+encURL;
}
   </script>
 </head>

   <!--DB에서 검색한 자료를 화면에 출력  -->
 <body topmargin="0" leftmargin="0">
 <table border="0" width="800">
   <tr>
     <td width="20%"  height="500" bgcolor="#ecf1ef" valign="top">

<!--  로그인 폼 추가 -->
<%@ include file="/Include/login_form.jsp" %>
     </td>
     <td width="80%" valign="top">
       &nbsp;<br>
     <table border="0" width="90%" align="center">
       <tr>
         <td colspan="2"><img src="./Pds/img/bullet-01.gif"> 
           <font color="blue" size="3">참 좋은 자료실</font><font size="2"> - 자료읽기</font></td>
       </tr>
     </table>
     <p>

     <table border="0" width="90%" align="center" cellspacing="0" style="border-width:1px;border-color:#0066cc;border-style:outset;">
       <tr bgcolor="e3e9ff">
         <td class="title">
           <img src="./Pds/img/bullet-04.gif">   
           <font size="2" face="돋움">${pds.subject }
           </font></td></tr>
		<tr>  
			<td class="content">
				<p align="right"><font size="2" face="돋움">${pds.name} / ${pds.regdate} / ${pds.regdate}번 읽음
			    <p> ${pds.contents}</p>
			<% if(pds.getFilename() != null) { %>	
				<img src="/Pds/img/disk.gif" align="middle" width="22" height="20" border="0">&nbsp;
				<!--  <a href="/Pds/upload/<%= pds.getFilename() %>"><%= pds.getFilename() %></a>-->
				<a href="javascript:pds_down('${pds.filename}')"> <%= pds.getFilename() %> </a>	
			<% } %>	
				</font>
			</td>
		</tr>
	  </table>
	  <p align="center">
	  <font size="2">
		<a href="pds_modify?idx=<%=pds.getIdx()%>"><img src="./Pds/img/edit-1.gif" border="0"></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="pds_delete?idx=<%=pds.getIdx()%>"><img src="./Pds/img/del.gif" border="0"></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="pds_list"><img src="./Pds/img/list-2.gif" border="0"></a>
	  </font>
     </td>
  </tr>  
</table>  
<%@ include file="/Include/copyright.jsp" %>
</body>  
</html>


