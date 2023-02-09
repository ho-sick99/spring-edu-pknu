<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h1>회원 가입</h1>
	<!-- 
	GET 방식 전송: 데이터가 URL에 붙어 전송. 최대 길이 2000자. 파일 업로드 불가. 전송 데이터가 노출됨. 대부분의 웹 요청시 사용. 기본 전송방식
	POST 방식 전송: 데이터가 따로 스트림으로 전송. 전송길이 제한 없음. 파일 업로드 가능. 전송데이터 감춰짐(암호화 아님). <form> 사용하여 지정 가능. 회원가입, 로그인 시 주로 사용.
	
	 -->
	<form action="member_insert_action" method="post">
		회원 아이디: <input type="text" name="mid"> <br> 
		회원 이름: <input type="text" name="mname"> <br> 
		비밀번호: <input type="password" name="mpwd"> <br> 
		회원 소개: <textarea rows="3" cols="40" name="mintro"></textarea> <br> 
		<input type="submit" value="가 입 신 청">
		<input type="reset" value="재 작 성">
	</form>
</body>
</html>