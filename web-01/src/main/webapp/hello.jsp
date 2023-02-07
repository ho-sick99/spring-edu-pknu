<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로</title>
</head>
<body>
	<h1>헬로 jsp</h1>
	<h2>이번주 추천 로또번호</h2>
	<%
	// 실행시킬 자바코드 선언
	HashSet<Integer> hs = new HashSet<Integer>();
	while (hs.size() < 6) {
		int r = (int) (Math.random() * 45 + 1);
		hs.add(r);
	} //end while
	%>
	추천번호:
	<%=hs%>
</body>
</html>