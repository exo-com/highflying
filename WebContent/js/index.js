var leftHeight, rightHeight;

$(document).ready(function(){
	leftHeight = $("#section_left").height();
	rightHeight = $("#section_right").height();
	if(leftHeight >= rightHeight){
		$("#section_right").css("height", leftHeight);
	}else {
		$("#section_left").css("height", rightHeight);
	}
});

$("#section_left").click(function(){
	$.ajax({
		type:"get",
		url:"modal.do",
		dataType: "json",
		data:"",
		success : function(data){
			var result = [];
			$(data.people).each(function(key, val){
				result.push(val.firstName + ", " + val.lastName);
			});
			alert(result);
		},
		error:function(xhr, status, error){
			alert("test");
		}
	});
});

/*function onDataReceived(data){
	var result = [];
	for(var property in data){
		var value = object[property];
		if(value){
			result.push(property.toString() + ' : ' + value);
		}
		return '{' + result.join(', ') + '}';
	}
};*/