<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	<h1>도서 등록</h1>
	<!-- 
	GET 방식 전송: 데이터가 URL에 붙어 전송. 최대 길이 2000자. 파일 업로드 불가. 전송 데이터가 노출됨. 대부분의 웹 요청시 사용. 기본 전송방식
	POST 방식 전송: 데이터가 따로 스트림으로 전송. 전송길이 제한 없음. 파일 업로드 가능. 전송데이터 감춰짐(암호화 아님). <form> 사용하여 지정 가능. 회원가입, 로그인 시 주로 사용.
	
	 -->
	<form action="member_insert_action" method="post">
		title: <input type="text" name="title"> <br> 
		publisher: <input type="text" name="publisher"> <br> 
		writer: <input type="text" name="writer"> <br> 
		price: <input type="text" name="price"> <br> 
		<input type="submit" value="도서 등록 신청">
		<input type="reset" value="재 작 성">
	</form>
</body>
</html>