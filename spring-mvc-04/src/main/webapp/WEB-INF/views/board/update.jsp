<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정 폼</title>
</head>
<body>
	<h1>게시물 수정</h1>
	
	<form action="update_action" method="post">
		<!-- 게시물 번호를 싣는 방법
	 	1. readonly 속성이 있는 input 태그 사용 -> 사용자에게 게시글 번호가 노출됨
	 	2. hidden 태그를 사용하여 숨겨서 전송 -> 사용자에게 게시글 번호가 노출되지 않음. 주로 사용하는 방식!
	  	-->
		게시물 제목: <input type="text" name="title" value="${vo.title}"> <br> 
		게시물 작성일: ${vo.regdate} <br>
		게시물 저자: <input type="text" name="writer" value="${vo.writer}" readonly="readonly"> <br> 
		게시물 내용: <textarea rows="3" cols="40" name="content">${vo.content}</textarea> <br>
		게시물 암호: <input type="password" name="password"> 
		<br> <input type="submit" value="정 보 수 정"> <input type="reset" value="재 작 성">
	</form>
	
	<hr>	
		<h3><a href="../board">게시물 홈</a></h3>
		<h3><a href="list">게시물 목록</a></h3>
</body>
</html>