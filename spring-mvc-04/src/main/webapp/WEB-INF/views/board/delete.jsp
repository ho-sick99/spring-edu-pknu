<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제 폼(delete.jsp)</title>
</head>
<body>
	<h2>게시글 "${vo.title}"을 삭제하시겠습니까?</h2>
	<form action="delete" method="post">
		<input type="hidden" name="no" value="${vo.no}">
		게시물 암호를 입력하세요: <input type="password" name="passwd"> <br> 
		<input type="submit" value="삭 제"> <input type="reset" value="재 작 성">

		<hr>	
		<h3><a href="../board">게시물 홈</a></h3>
		<h3><a href="list">게시물 목록</a></h3>
	</form>
</body>
</html>