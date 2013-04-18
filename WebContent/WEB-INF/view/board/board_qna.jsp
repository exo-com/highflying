<%@page import="com.highflying.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="./css/index.css"/>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="./css/common.css"/>
<link rel="stylesheet" type="text/css" href="./css/board_main.css"/>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="./js/common.js"></script>
<script type="text/javascript" src="./js/bootstrap.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>높게 날아보자</title>
</head>

<body>
<%@ include file="../common/header.jsp" %>
<!-- 여기부터 코딩 시작 -->
<% List<BoardDto> qnaList = (List<BoardDto>)request.getAttribute("qnaList"); 
%>
<div id="view">
	<div id="featureArea">
		<div class="wrapper">
			<ul id="feature-ul">
				<li class="nav">
					<div class="gallery-feature">
						<h2>Question & Answer </h2>
						<p>질문 하고 답하기</p>
					</div>
					
					<div class="line_clear"></div>
				</li>
			</ul>
		</div>
	</div>
	<div class="content">
		<div class="wrapper">
			<ul class="unstyled">
				<li><span class="span1">No</span><span class="span1">Date</span><span class="span2">Title</span><span class="span1">Writer</span></li><div class="line_clear"></div>
			<%	for(BoardDto bDto : qnaList){ %>
					<li><span class="span1"><%=bDto.getNo() %></span><span class="span1"><%=bDto.getCreatedate() %></span><span class="span2"><%=bDto.getBoardtitle() %></span><span class="span1"><%=bDto.getName() %></span></li><div class="line_clear"></div>		
			<%	}%>
			</ul>
		</div>
		<div>
			<ul class="unstyled">
				<li><button type="button" class="btn btn-primary">글쓰기</button></li>
				<li><button type="button" class="btn btn-primary">메인으로</button>
			</ul>
		</div>
	</div>
</div>
<!-- 여기까지 코딩 끝 -->
<%@ include file="../common/footer.jsp" %>
<script type="text/javascript" src="./js/index.js"></script>
<script>
$("#menu5").addClass("active");
$("#menu1").removeClass("active");
$("#menu2").removeClass("active");
$("#menu3").removeClass("active");
$("#menu4").removeClass("active");
$("#menu6").removeClass("active");
</script>
</body>
