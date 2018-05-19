$(function() {
	$("#bioName").click(function() {
		findUser($("#bioNo").val());
	});
});
function findUser(bioNO) {
	var path = $("#pageContext").val()+"/service/selectBioNameByNo/";
	var jqXHR =$.ajax({
		url : path,
		method : "POST",
		data : {
			"bioNo" : bioNO
		}
	});
	jqXHR.done(function(data){
		if (data == null || data == undefined) {
			alert("没有此人");
		}
		$("#bioName").val(data);
	});
	jqXHR.fail(function(){
		alert("请求失败");
	});

}
