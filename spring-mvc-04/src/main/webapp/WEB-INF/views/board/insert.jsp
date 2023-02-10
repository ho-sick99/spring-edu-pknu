<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성 화면(insert.jsp)</title>
</head>
<body>
	<h1>게시물 작성</h1>

	<form action="insert" method="post">
		게시물 제목: <input type="text" name="title"> <br> 게시물 작성자: <input
			type="text" name="writer"> <br> 게시물 암호: <input
			type="password" name="passwd"> <br> 게시물 내용: <br>
		<textarea rows="3" cols="50" name="content"></textarea>
		<br> <input type="submit" value="글 등 록"> <input
			type="reset" value="재 작 성">

		<hr>	
		<h3><a href="../board">게시물 홈</a></h3>
		<h3><a href="list">게시물 목록</a></h3>
	</form>
</body>
</html>