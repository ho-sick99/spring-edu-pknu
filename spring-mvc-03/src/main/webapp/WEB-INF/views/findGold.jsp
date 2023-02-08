<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>금광찾기</title>
</head>
<body>
	<h1>금광찾기</h1>
	<h2>금을 찾아보세요!</h2>
	<h3>X, Y 좌표를 입력하여 금이 있는 좌표를 찾으세요</h3>

	<form action="">
		X 좌표: <input type="number" name="x">
		Y 좌표: <input type="number" name="y"> 
		<input type="submit" value="정답 확인">
	</form>
	<h2>${msg}</h2>

</body>
</html>