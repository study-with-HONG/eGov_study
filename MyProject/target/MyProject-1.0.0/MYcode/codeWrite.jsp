<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코드 입력창</title>
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

<script type="text/javascript">
	function fn_submit() {
		if(document.frm.name.value == ""){
			alert("이름을 입력해주세요.");
			document.frm.name.focus();
			
			return false;
		}
		
		document.frm.submit();
	}
</script>

<body>
	<form name="frm" method="post" action="codeSave.do">
		<table>
			<tr>
				<th>분류</th>
				<td>
					<select name="groupid">
						<option value="1">Job(업무)</option>
						<option value="2">Hobby(취미)</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<th colspan="2">
					<button type="submit" onclick="fn_submit();return false;">저장</button>
					<button type="reset">취소</button>
				</th>
			</tr>
		</table>
	</form>
</body>
</html>