
var prefix = "/ex/orderService"
$(function() {
	load();
});

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
									checkbox : true
								},
																{
									field : 'exOrderServiceId', 
									title : 'ID' 
								},
																{
									field : 'exOrderHeaderId', 
									title : '出口订单头主键' 
								},
																{
									field : 'specifyShipCompany', 
									title : '指定船公司' 
								},
																{
									field : 'appointForwarderType', 
									title : '指定货代类型:0-平台指定，1-自己指定' 
								},
																{
									field : 'forwarderCompanyName', 
									title : '货代公司' 
								},
																{
									field : 'contact', 
									title : '联系人' 
								},
																{
									field : 'phone', 
									title : '手机' 
								},
																{
									field : 'fax', 
									title : '传真' 
								},
																{
									field : 'companyAddress', 
									title : '公司地址' 
								},
																{
									field : 'customsBrokerName', 
									title : '报关行名称' 
								},
																{
									field : 'customsBrokerCode', 
									title : '报关行代码' 
								},
																{
									field : 'entryNoticeFileId', 
									title : '进仓通知书文件ID' 
								},
																{
									field : 'encasementType', 
									title : '装箱方式：0-拼箱，1-整柜，2-拼车？，3-整车？' 
								},
																{
									field : 'insuranceFinanceService', 
									title : '保险或融资服务(多选“,”分隔):00-信用保险,01-退税融资,02-LC融资,03-其他融资' 
								},
																{
									field : 'pkgs', 
									title : '总包装数' 
								},
																{
									field : 'totalVolume', 
									title : '总体积' 
								},
																{
									field : 'totalRoughWeight', 
									title : '总毛重' 
								},
																{
									field : 'totalNetWeight', 
									title : '总净重' 
								},
																{
									field : 'totalAmount', 
									title : '总金额' 
								},
																{
									field : 'foreignExgCost', 
									title : '换汇成本' 
								},
																{
									field : 'gmtCreate', 
									title : '创建时间' 
								},
																{
									field : 'gmtModified', 
									title : '修改时间' 
								},
																{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.exOrderServiceId
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.exOrderServiceId
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.exOrderServiceId
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'exOrderServiceId' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['exOrderServiceId'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}