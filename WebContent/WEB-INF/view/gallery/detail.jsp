<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="./css/font-awesome.css"/>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="./css/common.css"/>
<link rel="stylesheet" type="text/css" href="./css/detail.css"/>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="./js/common.js"></script>
<script type="text/javascript" src="./js/bootstrap.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>높게 날아보자</title>
</head>

<body>
<%@ include file="../common/header.jsp" %>
<!-- 여기부터 코딩 시작 -->
<div id="wrapper">
	<div id="picture_slide">
		<img id="image" src='./img/galaxys4.jpg' alt="Galaxy S4"/>
	</div>
	<div id="spec">
		<div id="product_name"><span class="span2">제품명</span>Galaxy S4</div>
		<div id="product_company"><span class="span2">제조사</span>Samsung</div>
		<div id="product_os"><span class="span2">운영체제</span>Android 4.2.2</div>
		<div id="product_process"><span class="span2">프로세서</span>1.6GHz 옥타코어 엑시노스</div>
		<div id="product_display"><span class="span2">디스플레이</span>5인치 Full HD 슈퍼 아몰레드</div>
		<div id="product_resolution"><span class="span2">해상도</span>1,920 x 1,080 / 441 ppi</div>
		<div id="product_memory"><span class="span2">메모리</span>2GB LPDDR3</div>
		<div id="product_storage"><span class="span2">저장공간</span>16 / 32 / 64 GB + microSD</div>
		<div id="product_backCamera"><span class="span2">후면 카메라</span>1,300만 화소</div>
		<div id="product_frontCamera"><span class="span2">전면 카메라</span>200만 화소</div>
		<div id="product_network"><spna class="span2">네트워크</spna>GSM / EDGE / UMTS / DC-HSPA+ / LTE</div>
		<div id="product_wifi"><span class="span2">와이파이</span>WiFi 802.11 a / ac / b / g / n, HT80</div>
		<div id="product_connectivity"><span class="span2">Connectivity</span>NFC / MHL 2.0 / IR LED</div>
		<div id="product_battery"><span class="span2">배터리</span>2,600mAh</div>
		<div id="product_size"><span class="span2">크기 / 무게</span>136.6 X 69.8 X 7.9 mm / 130g</div>
	</div>
</div>
<!-- 여기까지 코딩 끝 -->
<%@ include file="../common/footer.jsp" %>
<script type="text/javascript" src="./js/detail.js"></script>
<script>
$("#menu2").addClass("active");
$("#menu1").removeClass("active");
$("#menu3").removeClass("active");
$("#menu4").removeClass("active");
$("#menu5").removeClass("active");
$("#menu6").removeClass("active");
</script>
</body>
</html>