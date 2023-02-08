<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>숫자맞추기 게임</h1>
	<h2>1~100 사이 숫자를 맞춰보라</h2>
	<!-- action을 비우면 자기자신값을 가짐 -->
	<form action="">
		숫자 : <input type="number" name="num"> <input type="submit"
			value="정답 확인">
	</form>
	<h2>${msg}</h2>
	${com_num} ${count}
</body>
</html>