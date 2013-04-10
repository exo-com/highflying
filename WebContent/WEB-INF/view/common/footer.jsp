<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="./css/footer.css"/>
<script type="text/javascript" src="./js/footer.js"></script>
<script type="text/javascript"
      src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCUhT-IzHqWeJk9LHcRn7LNZzQ26rYBHRU&sensor=false">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
</head>
<body>
<div id="footer">
	<div  id="footer_nav">
		<ul class="nav nav-pills">
			<li><a href="#">Twitter</a></li>
			<li><a href="#">Facebook</a></li>
			<li><a href="#map_modal" data-toggle="modal" onclick="initialize()">Location</a></li>
		</ul>
	</div>
</div>

<div class="modal hide fade" id="map_modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3 id="myModalLabel">Location</h3>
	</div>
	<div class="modal-body">
    	<div id="mapCanvas" style="width: 525px; height: 400px"></div>
	</div>
	<div class="modal-footer">
    	<a href="#" class="btn" data-dismiss="modal">Close</a>
	</div>
</div>
</body>
</html>