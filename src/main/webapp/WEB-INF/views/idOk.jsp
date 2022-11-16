<%@page import="com.heekwoncompany.test02.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberDto dto = (MemberDto)request.getAttribute("searchResult");
	
		if(dto == null){
	%>
			<script language="JavaScript">
						alert("없는 아이디 입니다!!!")
						history.go(-1);
			</script>
	<%
		}else{
	%>
			아이디 : ${searchResult.mid}<br>
			비밀번호 : ${searchResult.mpw}<br>
			이 름 : ${searchResult.mname}<br>
			이메일 : ${searchResult.memail}<br>
			가입일 : ${searchResult.mdate}<br>
	<%
		}
	%>
			
	

	
</body>
</html>