<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${row==1}">
	<script>
		alert("등록되었습니다");
		location.href="guest_list.do";
	</script>
</c:if>

<c:if test="${row==0}">
	<script>
		alert("서버오류");
		location.back();
	</script>
</c:if>