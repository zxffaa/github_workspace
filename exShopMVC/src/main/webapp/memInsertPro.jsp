<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${row==1}">
	<script>
		location.href="\index";
	</script>
</c:if>
<c:if test="${row==0}">
	<script>
		alert("등록오류");
		history.back();
	</script>
</c:if>
