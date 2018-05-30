$().ready(function() {
	validateRule();
    load();
});

$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});
function save() {
	$.ajax({
		cache : true,
		type : "POST",
		url : "/ex/orderHeader/save",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
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

var prefix = "/ex/orderCommodity";

function load() {
    $('#exampleTable')
        .bootstrapTable(
            {
                method : 'get', // 服务器数据的请求方式 get or post
                url : prefix + "/list", // 服务器数据的加载地址
                //	showRefresh : true,
                //	showToggle : true,
                //	showColumns : true,
                iconSize : 'outline',
                toolbar : '#exampleToolbar',
                striped : true, // 设置为true会有隔行变色效果
                dataType : "json", // 服务器返回的数据类型
                pagination : true, // 设置为true会在底部显示分页条
                // queryParamsType : "limit",
                // //设置为limit则会发送符合RESTFull格式的参数
                singleSelect : false, // 设置为true将禁止多选
                // contentType : "application/x-www-form-urlencoded",
                // //发送到服务器的数据编码类型
                pageSize : 10, // 如果设置了分页，每页数据条数
                pageNumber : 1, // 如果设置了分布，首页页码
                //search : true, // 是否显示搜索框
                showColumns : false, // 是否显示内容下拉框（选择显示的列）
                sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                queryParams : function(params) {
                    return {
                        //说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit: params.limit,
                        offset:params.offset
                        // name:$('#searchName').val(),
                        // username:$('#searchName').val()
                    };
                },
                // //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
                // queryParamsType = 'limit' ,返回参数必须包含
                // limit, offset, search, sort, order 否则, 需要包含:
                // pageSize, pageNumber, searchText, sortName,
                // sortOrder.
                // 返回false将会终止请求
                columns : [
                    {
                        visible : false,
                        field : 'exOrderCommodityId',
                        title : '主键'
                    },
                    {
                        visible : false,
                        field : 'exOrderHeaderId',
                        title : '出口订单头主键'
                    },
                    {
                        visible : false,
                        field : 'manufacturer',
                        title : '生产厂家'
                    },
                    {
                        visible : false,
                        field : 'manufacturerCode',
                        title : '生产厂家编号'
                    },
                    {
                        visible : false,
                        field : 'factoryArticleNo',
                        title : '公司货号'
                    },
                    {
                        field : 'customsCode',
                        title : '海关编码'
                    },
                    {
                        visible : false,
                        field : 'taxRefundRate',
                        title : '退税率%'
                    },
                    {
                        visible : false,
                        field : 'shipMarkInfo',
                        title : '唛头信息'
                    },
                    {
                        field : 'chineseName',
                        title : '中文品名'
                    },
                    {
                        field : 'englishName',
                        title : '英文品名'
                    },
                    {
                        visible : false,
                        field : 'declareElement',
                        title : '申报要素'
                    },
                    {
                        field : 'pkgs',
                        title : '包装数量'
                    },
                    {
                        visible : false,
                        field : 'pkgsUnit',
                        title : '包装数量单位'
                    },
                    {
                        field : 'totalQuantity',
                        title : '总数量'
                    },
                    {
                        visible : false,
                        field : 'totalQuantityUnit',
                        title : '总数量单位'
                    },
                    {
                        visible : false,
                        field : 'packSizeLength',
                        title : '包装尺寸-长mm'
                    },
                    {
                        visible : false,
                        field : 'packSizeWidth',
                        title : '包装尺寸-宽mm'
                    },
                    {
                        visible : false,
                        field : 'packSizeHeight',
                        title : '包装尺寸-高mm'
                    },
                    {
                        field : 'totalVolume',
                        title : '总体积m*m*m'
                    },
                    {
                        visible : false,
                        field : 'unitRoughWeight',
                        title : '单位毛重kg'
                    },
                    {
                        field : 'totalRoughWeight',
                        title : '总毛重kg'
                    },
                    {
                        visible : false,
                        field : 'unitNetWeight',
                        title : '单位净重kg'
                    },
                    {
                        field : 'totalNetWeight',
                        title : '总净重kg'
                    },
                    {
                        field : 'purchaseUnitPrice',
                        title : '采购单价'
                    },
                    {
                        field : 'purchaseTotalPrice',
                        title : '采购总价'
                    },
                    {
                        field : 'exportUnitPrice',
                        title : '出口单价'
                    },
                    {
                        field : 'exportTotalPrice',
                        title : '出口总价'
                    },
                    {
                        visible : false,
                        field : 'gmtCreate',
                        title : '创建时间'
                    },
                    {
                        visible : false,
                        field : 'gmtModified',
                        title : '修改时间'
                    },
                    {
                        visible : false,
                        title : '操作',
                        field : 'id',
                        align : 'center',
                        formatter : function(value, row, index) {
                            var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
                                + row.exOrderCommodityId
                                + '\')"><i class="fa fa-edit"></i></a> ';
                            var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
                                + row.exOrderCommodityId
                                + '\')"><i class="fa fa-remove"></i></a> ';
                            var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
                                + row.exOrderCommodityId
                                + '\')"><i class="fa fa-key"></i></a> ';
                            return e + d ;
                        }
                    } ]
            });
}
function reLoad() {
    $('#exampleTable').bootstrapTable('refresh');
}
function commodity() {
    var perLayer=layer.open({
        type : 2,
        title : '添加-订单商品',
        maxmin : true,
        shadeClose : false, // 点击遮罩关闭层
        area : [ '800px', '520px' ],
        content : prefix + '/commodity' // iframe的url
    });
    layer.full(perLayer);
}