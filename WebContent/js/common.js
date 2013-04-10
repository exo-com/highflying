a = 50;
$(document).ready(function(){
	logo();
	restart();
});
function erase(){
	
	var canvas, context1;
	canvas2 = document.getElementById("logo_can");
	context1 = canvas2.getContext('2d');
	
	if(a < 401){
		context1.arc(0, 0, a, 0, Math.PI * 2, true);
		context1.fillStyle = "#f0f0f0";
		context1.fill();
		
	}else{
		
		logo();
	}
	setTimeout("erase()", 1000);
	
}

function restart(){
	setTimeout("erase()", 3000);
}

function logo(){
	a = 50;
	var isFill = true;
	canvas1 = document.getElementById("logo_can");
	context = canvas1.getContext('2d');
	context.fillStyle = "blue";
	context.shadowColor = "red";
	context.shadowOffsetX = 3;
	context.shadowOffsetY = 3;
	context.shadowBlur = 1;
	context.textBaseline = "bottom";
	context.font = " bold 60px Arial";
	context.fillText("H", 15, 70);
	context.font = " bold 40px Arial";
	context.fillText("igh",60, 70);
	context.font = " bold 60px Arial";
	context.fillText("F", 140, 120);
	context.font = " bold 40px Arial";
	context.fillText("lying", 175, 120);
	restart();
}

