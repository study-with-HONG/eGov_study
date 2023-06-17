<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 입력창</title>
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
	<form name="frm" method="post" action="deptSave.do">
		<table>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="dnum"></td>
			</tr>
			<tr>
				<th>부서이름</th>
				<td><input type="text" name="dname"></td>
			</tr>
			<tr>
				<th>부서위치</th>
				<td><input type="text" name="dloc"></td>
			</tr>
			<tr>
				<th colspan="2">
					<button type="submit">저장</button>
					<button type="button" onclick="location='deptList.do'">취소</button>
				</th>
			</tr>
		</table>
	</form>
</body>
</html>