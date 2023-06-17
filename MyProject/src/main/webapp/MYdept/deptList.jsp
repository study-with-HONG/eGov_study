<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl 문법 링크 -->
	<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!-- end -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 목록</title>
</head>

<style>
	table{
		width: 400px;
		border-collapse: collapse; /* 셀 사이 간격 없애기 */
	}
	th, td{
		border: 1px solid #cccccc;
		padding: 5px;
	}
</style>

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
				<td><a href="deptDetail.do?deptNO=${list.dnum }">${list.dname}</a></td>
				<td>${list.dloc}</td>
			</tr>
		</c:forEach>
		<!-- 반복문 -->
	</table>	<br>
	
	<div style="width:400px;  text-align: center;">
		<button type="button" onclick="location='deptWrite.do'">부서입력</button>
	</div>
</body>
</html>