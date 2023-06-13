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
		<tr>
			<th>부서번호</th>
			<td>${vo.dnum }</td>
		</tr>
		<tr>
			<th>부서이름</th>
			<td>${vo.dname }</td>
		</tr>
		<tr>
			<th>부서위치</th>
			<td>${vo.dloc }</td>
		</tr>
		<tr>
			<th colspan="2">
				<button type="button">수정</button>
				<button type="button">삭제</button>
			</th>
		</tr>
	</table>
</body>
</html>