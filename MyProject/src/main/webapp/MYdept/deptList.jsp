<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl 문법 링크 -->
	<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!-- end -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<caption>부서목록</caption>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
			
		<!-- 반복문 -->
		<c:forEach var="list" items="${list}" varStatus="status">
			<tr>
				<td>${list.dnum}</td>
				<td>${list.dname}</td>
				<td>${list.dloc}</td>
			</tr>
		</c:forEach>
		<!-- 반복문 -->
	</table>
</body>
</html>