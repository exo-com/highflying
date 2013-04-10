<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="./css/video_main.css"/>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="./css/common.css"/>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="./js/common.js"></script>
<script type="text/javascript" src="./js/bootstrap.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>높게 날아보자</title>
</head>

<body>
<%@ include file="../common/header.jsp" %>
<!-- 여기부터 코딩 시작 -->
<div id="view">
	<div id="featureArea">
		<div class="wrapper">
			<ul id="feature-ul">
				<li class="nav">
					<div class="gallery-feature">
						<h2>Videos of Smart Phone</h2>
						<p>스마트폰의 광고 영상을 볼수 있습니다.</p>
					</div>
					
					<div class="line_clear"></div>
				</li>
			</ul>
		</div>
	</div>
	<div class="content">
		<div class="wrapper">
			<iframe width="560" height="315" src="http://www.youtube.com/embed/2LHv1FPd1Ec" frameborder="0" allowfullscreen></iframe>
		</div>
	</div>
</div>
<!-- 여기까지 코딩 끝 -->
<%@ include file="../common/footer.jsp" %>
<script type="text/javascript" src="./js/index.js"></script>
<script>
$("#menu3").addClass("active");
$("#menu1").removeClass("active");
$("#menu2").removeClass("active");
$("#menu4").removeClass("active");
$("#menu5").removeClass("active");
$("#menu6").removeClass("active");
</script>
</body>
