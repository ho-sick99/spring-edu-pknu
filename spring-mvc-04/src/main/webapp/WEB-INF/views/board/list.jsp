<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록(list.jsp)</title>
</head>
<body>
	<h1>게시물 목록</h1>
	<h2>게시물 개수: ${boardList.size()}</h2>
	<table>
		<tr>
			<th>번호</th>
			<th>제 목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${boardList}" var="b">
			<tr>
				<th>${b.no}</th>
				<th><a href="detail?no=${b.no}">${b.title}</a></th>
				<th>${b.writer}</th>
				<th>${b.regdate}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>