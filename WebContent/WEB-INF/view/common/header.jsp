<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/header.css"/>
<link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<script type="text/javascript" src="./js/header.js"></script>
</head>
<body>
<div id="header">
<div id="logo">
	<a href="index.do"><canvas id="logo_can"></canvas></a>
</div>

<div id="main_nav">
	<ul id="main_nav_ul" class="lnb nav nav-pills">
		<li id="menu1" class="active"><a href="index.do">Home</a></li>
		<li id="menu2" class=""><a href="gallery_main.do">Gallery</a></li>
		<li id="menu3" class=""><a href="video_main.do">Videos</a></li>
		<li id="menu4" class=""><a href="portfolio_main.do">Portfolio</a></li>
		<li id="menu5" class=""><a href="board_main.do">Board</a></li>
		<li id="menu6" class=""><a href="#">About</a></li>
	</ul>
</div>
<div id="member-nav">
	<ul id="member-nav_ul" class="nav">
		<li class="btn"><a href="#loginModal" data-toggle="modal">login</a></li>
		<li class="btn"><a href="#registerModal" data-toggle="modal">register</a></li>
	</ul>
</div>
<div class="line_clear"></div>
</div>
<!-- Login Modal -->
<div id="loginModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3 id="myModalLabel">Log In</h3>
	</div>
	<div class="modal-body">
		<span class="span1">아이디</span><input type="text" id="userId" name="userId"><div class="line_clear"></div>
		<span class="span1">비밀번호</span><input type="password" id="password" name="password">
	</div>
	<div class="modal-footer">
		<button class="btn btn-success" data-dismiss="modal" aria-hidden="true">Login</button>
		<button class="btn btn-danger" data-dismiss="modal" aria-hidden="true">Cancel</button>
	</div>
</div>
<!-- Login Modal End -->
<!-- Login Modal -->
<div id="registerModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3 id="myModalLabel">Log In</h3>
	</div>
	<div class="modal-body">
		<ul class="unstyled">
			<li><span class="span2">아이디</span><input type="text" id="userId" name="userId"><div class="line_clear"></div></li>
			<li><span class="span2">비밀번호</span><input type="password" id="password" name="password"><div class="line_clear"></div></li>
			<li><span class="span2">비밀번호확인</span><input type="password" id="repassword" name="repassword"><div class="line_clear"></div></li>
			<li><span class="span2">이메일</span><input type="text" id="email" name="email"><div class="line_clear"></div></li>
		</ul>
	</div>
	<div class="modal-footer">
		<button class="btn btn-success" data-dismiss="modal" aria-hidden="true">Register</button>
		<button class="btn btn-danger" data-dismiss="modal" aria-hidden="true">Cancel</button>
	</div>
</div>
<!-- Login Modal End -->
</body>
</html>