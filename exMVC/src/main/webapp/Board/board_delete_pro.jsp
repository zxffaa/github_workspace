<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${row==1 }">
	<script>
		//alert("삭제되었습니다");
		//location.href="guest_list.do?page=${page}"";
		opener.location.replace("/Board?cmd=board_list&page=${page}");
		//opener.location.href="guest_list.do";
		self.close();
	</script>
</c:if>

<c:if test="${row==0 }">
	<script>
		alert("비밀번호 오류입니다.");
		history.back();
	</script>
</c:if>
