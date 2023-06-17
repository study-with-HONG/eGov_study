<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl 문법 링크 -->
	<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!-- end -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 수정</title>
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
<form name="frm" method="post" action="deptUpdateSave.do">
	<table>
		<tr>
			<th>부서번호</th>
			<td><input type="text" name="dnum" value="${vo.dnum }" readonly="readonly"></td>
		</tr>
		<tr>
			<th>부서이름</th>
			<td><input type="text" name="dname" value="${vo.dname }"></td>
		</tr>
		<tr>
			<th>부서위치</th>
			<td><input type="text" name="dloc" value="${vo.dloc }"></td>
		</tr>
		<tr>
			<th colspan="2">
				<button type="submit">저장</button>
				<button type="reset">취소</button>
			</th>
		</tr>
	</table>
</form>
</body>
</html>