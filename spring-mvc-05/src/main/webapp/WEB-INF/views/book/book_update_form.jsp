<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 수정</title>
</head>
<body>
	<h1>도서 정보 수정</h1>

	<form action="member_update_action" method="post">
		Title: <input type="text" name="title" value="${vo.title}" readonly="readonly"> <br> 
		Publisher: <input type="text" name="publisher" value="${vo.publisher}"> <br> 
		Writer: <input type="text" name="writer" value="${vo.writer}"> <br> 
		Price: <input type="text" name="price" value="${vo.price}"> <br> 
		<br> <input type="submit" value="정 보 수 정"> <input type="reset" value="재 작 성">
	</form>
</body>
</html>