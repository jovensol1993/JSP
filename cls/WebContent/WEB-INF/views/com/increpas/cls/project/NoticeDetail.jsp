<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Board List</title>
<link rel="stylesheet" type="text/css" href="/cls/css/w3.css">
<link rel="stylesheet" type="text/css" href="/cls/css/cls.css">
<script type="text/javascript" src="/cls/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/cls/js/notice.js"></script>

</head>
<body>
	<div class="w3-content mw800">
		<!-- top -->;
		<!-- 게시글 리스트 -->
		<div class="w3-col w3-margin-top w3-padding w3-card-4">
			<div class="w3-col w3-border w3-margin-top w3-center">
				<div class="w3-col m1 w3-light-grey w3-border-right">번호</div>
				<div class="w3-col m7 w3-light-grey w3-border-right">제목</div>
				<div class="w3-col m1 w3-light-grey w3-border-right">작성일</div>
				<div class="w3-col m1 w3-light-grey w3-border-right">조회수</div>
				<div class="w3-col m2 w3-light-grey w3-border-right">기능</div>
			</div>
			<div class="w3-col w3-border-left w3-border-right w3-margin-bottom">
				<form method="POST" action="/cls/project/noticeDelProc.cls"
					id="noticeDelProc" name="noticeDelProc">
					<input id="nno" name="nno" type="hidden">
					<c:forEach var="data" items="${LIST}">
						<div class="w3-col w3-center w3-border-bottom">
							<div class="w3-col m1 w3-border-right w3-margin-top">${data.nno}</div>
							<div class="w3-col m7  btn w3-margin-top">
								<span class="title w3-button" id="${data.nno}">${data.title}</span>
								<div class="w3-col m2 w3-border-right w3-margin-top w3-hide">${data.contents}</div>
							</div>
							<div class="w3-col m1 w3-border-right w3-margin-top"
								style="font-size: 5pt">${data.ndate}</div>
							<div class="w3-col m1 w3-border-right w3-margin-top">${data.hits}</div>
							<div
								class="w3-btn w3-col m1 w3-border-right w3-margin-top delbtn"
								id="d${data.nno}">삭제</div>
							<div
								class="w3-btn w3-col m1 w3-border-right w3-margin-top editbtn"
								id="d${data.nno}">편집</div>
						</div>
					</c:forEach>
				</form>
			</div>
		</div>
	</div>
	</div>
</body>
</html>