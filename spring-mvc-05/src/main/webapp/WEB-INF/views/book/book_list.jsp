<%@page import="com.jhmoon.mvc05.vo.BookVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	<h1>회원 목록</h1>
	<h3>회원 수: ${bookList.size()}</h3>
	<ul>
		<c:forEach items="${bookList}" var="vo">
			<li><a href="book_detail?title=${vo.title}">Title: ${vo.title} (저자: ${vo.writer})</a></li>
		</c:forEach>

	</ul>
</body>
</html>