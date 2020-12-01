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
<script type="text/javascript" src="/cls/js/emp2.js"></script>
</head>
<body>
	<div class="w3-content mw750">
		<h1 class="w3-indigo w3-center w3-card-4 w3-padding w3-round-large">EmpList</h1>
		<div class="w3-col w3-margin-top w3-margin-bottom w3-card-4">
			
			<div class="w3-col m2  w3-blue w3-hover-aqua w3-left w3-margin-right w3-margin-bottom">사원번호</div> 
			<div class="w3-col m2  w3-blue w3-hover-aqua w3-left w3-margin-right w3-margin-bottom">사원이름</div>
			<div class="w3-col m2  w3-blue w3-hover-aqua w3-left w3-margin-right w3-margin-bottom">고용일자</div>
			<div class="w3-col m2  w3-blue w3-hover-aqua w3-left w3-margin-right w3-margin-bottom">상사번호</div>
			<div class="w3-col m2  w3-blue w3-hover-aqua w3-left w3-margin-right w3-margin-bottom">수상여금</div>
			
			<div class="w3-col m2  w3-red w3-hover-deep-orange w3-left w3-margin-right w3-button" id="empbtn">${EVO.empno}</div> 
			<div class="w3-col m2  w3-red w3-hover-deep-orange w3-left w3-margin-right  ">${EVO.ename}</div>
			<div class="w3-col m2  w3-red w3-hover-deep-orange w3-left w3-margin-right  ">${EVO.hiredate}</div>
			<div class="w3-col m2  w3-red w3-hover-deep-orange w3-left w3-margin-right  ">${EVO.mgr}</div>
			<div class="w3-col m2  w3-red w3-hover-deep-orange w3-left w3-margin-right  ">${EVO.comm}</div>
		</div>
		
		<div class="w3-hide w3-col w3-margin-top w3-margin-bottom w3-card-4 w3-blue" id="emsg">
			<div  class="w3-coL w3-red w3-hover-deep-orange w3-left w3-margin-right" id="empno"></div>
			<div  class="w3-col w3-red w3-hover-deep-orange w3-left w3-margin-right" id="ename"></div>
			<div  class="w3-col w3-red w3-hover-deep-orange w3-left w3-margin-right" id="hiredate"></div>
			<div  class="w3-col w3-red w3-hover-deep-orange w3-left w3-margin-right" id="mgr"></div>
			<div  class="w3-col w3-red w3-hover-deep-orange w3-left w3-margin-right" id="comm"></div>
		</div>
	</div>
</body>
</html>