$().ready(function() {
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});
function save() {
	debugger;
	$.ajax({
		cache : true,
		type : "POST",
		url : "/ex/orderHeader/save",
		data : JSON.stringify(vm.$data.orderHeader),// 你的formid
        dataType: "json",
        contentType: "application/json",
		async : false,
		error : function(request) {
			debugger;
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			debugger;
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : icon + "请输入姓名"
			}
		}
	})
}

var vm = new Vue({
    el:'#rrapp',
    data:{
		orderHeader:{},
		q:{
			sss:1
		}
    },
    methods: {

	}
});