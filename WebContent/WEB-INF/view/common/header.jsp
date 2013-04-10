<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/header.css"/>
<link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
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
		<li class="btn"><a href="#">login</a></li>
		<li class="btn"><a href="#">register</a></li>
	</ul>
</div>
<div class="line_clear"></div>
</div>
</body>
</html>