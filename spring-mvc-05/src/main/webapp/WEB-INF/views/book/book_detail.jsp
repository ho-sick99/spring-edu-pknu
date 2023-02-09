<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서 정보</h1>
	title: ${vo.title}<br>
	publisher: ${vo.publisher}<br>
	writer: ${vo.writer}<br>
	price: ${vo.price}<br>
	
	<h3><a href="./">홈</a></h3>
	<h3><a href="book_list">도서 목록</a></h3>
	<h3><a href="book_update_form?mid=${vo.title}">도서 정보 수정</a></h3>
	<h3><a href="book_delete_form?mid=${vo.title}">도서 정보 삭제</a></h3> 
</body>
</html>