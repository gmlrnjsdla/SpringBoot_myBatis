<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<style>
	td{
		font-family:"맑은 고딕";	
	}
	table{
		border: 1px solid #dddddd;
		border-radius: 10px;
	}
	th, td{
		border-top : 1px solid #dddddd;
		padding-top:5px;
		padding-bottom:5px;
	}
	img{
		
		width:300px;
		margin:20px 0 20px 220px;
	}
</style>
<head>
<meta charset="UTF-8">
<title>회원 명부</title>
</head>
<body>
	<img src="resources/image/spring.png">

	<table width="800"  cellpadding="0" cellspacing="0">
		<tr bgcolor="skyblue" height="30">
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이 름</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
		<c:forEach items="${minfo}" var="minfo">
		<tr align="center" height="25">
			<td>${minfo.mid}</td>
			<td>${minfo.mpw}</td>
			<td>${minfo.mname}</td>
			<td>${minfo.memail}</td>
			<td>${minfo.mdate}</td>
		</tr>
		</c:forEach>
	</table>
	<input type="button" value="회원가입" onclick="javascript:window.location='join'" style="margin-left:720px; margin-top:10px;">
</body>
</html>