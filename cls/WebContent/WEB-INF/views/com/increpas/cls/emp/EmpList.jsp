<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/cls/css/w3.css">
<link rel="stylesheet" type="text/css" href="/cls/css/cls.css">
<script type="text/javascript" src="/cls/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/cls/js/emp.js"></script>
</head>
<body>
	<div class="w3-content mw750">
		<h1 class="w3-indigo w3-center w3-card-4 w3-padding w3-round-large">EmpList</h1>
		<div class="w3-col w3-margin-top w3-margin-bottom w3-card-4">
			<form method="POST" action="/cls/emp/empInfo.cls" id="emp" name="emp"> 
				<input id="empno" name="empno" type="hidden" value=""> 
					<c:forEach var="data" items="${LIST}">
						<span class="w3-col m3 w3-button w3-red w3-hover-deep-orange w3-left w3-margin-right btn" id="${data.empno}">${data.ename}</span>
					</c:forEach>
			</form>	
		</div>
	</div>
</body>
</html>