<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="./css/index.css"/>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="./css/common.css"/>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="./js/common.js"></script>
<script type="text/javascript" src="./js/bootstrap.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>높게 날아보자</title>
</head>

<body>
<%@ include file="./common/header.jsp" %>
<!-- 여기부터 코딩 시작 -->
<div id="view">
	<div id="featureArea">
		<div class="wrapper">
			<ul id="feature-ul">
				<li class="nav">
					<div class="phone-info">
						<h2>Mobile & Smart Phone</h2>
						<h4>New Product <i class="icon-hand-right"></i> iPhone</h4>
						<a href="detail.do"><button type="button" class="btn btn-primary">Detail</button></a>
					</div>
					<div class="phone-image"><img src="./img/galaxy-SIII.png"/></div>
					<div class="line_clear"></div>
				</li>
			</ul>
		</div>
	</div>
	<div class="content">
		<div class="wrapper">
			<div id="featureColumes">
				<section>
					<h3>Design</h3>
					<p>편의성을 극대화한 사용환경<br/>
					 인간중심 사용환경</p>
				</section>
				<section>
					<img src=""/>
					<h3>Human</h3>
					<p>편의성을 극대화한 사용환경<br/>
					 인간중심 사용환경</p>
				</section>
				<section>
					<img src=""/>
					<h3>Creative</h3>
					<p>편의성을 극대화한 사용환경<br/>
					 인간중심 사용환경</p>
				</section>
				<section>
					<img src=""/>
					<h3>Life</h3>
					<p>편의성을 극대화한 사용환경<br/>
					 인간중심 사용환경</p>
				</section>
			</div>
			<div class="line_clear"></div>
			<section id ="section_left" class="customerLeft">
				<div class="inner">
					<h4>Our Galaxy Smartphones</h4>
					<p>Experience the premium entertainment and innovative features that make Galaxy monile devices truly brilliant.</p>
				</div>
				<div class="logo">
					<a href="#">more<i class=" icon-chevron-right"></i><i class=" icon-chevron-right"></i></a>
				</div>
			</section>
			<section id="section_right" class="customerRight">
				<div class="inner">
					<h4>Why you'll love an iPhone.</h4>
					<p>iPhone owners love their iPhone. And not just because of the Retina display. Or the amazing camera. Or the long battery life. It's all those things plus the fact that iPhone is just so easy to use.</p>
				</div>
				<div class="logo">
					<a href="#">more<i class=" icon-chevron-right"></i><i class=" icon-chevron-right"></i></a>
				</div>
			</section>
		</div>
		<div class="line_clear"></div>
	</div>
</div>
<div>
</div>
<!-- 여기까지 코딩 끝 -->
<%@ include file="./common/footer.jsp" %>
<script type="text/javascript" src="./js/index.js"></script>
</body>
</html>