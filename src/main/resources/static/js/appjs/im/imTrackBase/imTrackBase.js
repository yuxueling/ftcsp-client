
var prefix = "/im/imTrackBase"
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
								},{
									field : 'agencyContractNo', 
									title : '代理合同号' 
								},{
									field : 'customsDeclarationNo', 
									title : '报关单号' 
								},{
									field : 'arrivalDate', 
									title : '到港日期' 
								},{
									field : 'linkStatus', 
									title : '报关状态' 
								},{
									field : 'customsDeclarationAmount', 
									title : '报关金额' 
								},{
									field : 'billLadingNo', 
									title : '提单号' 
								},/*
																{
									field : 'imTrackBaseId', 
									title : '主键' 
								},
																
																{
									field : 'ftClientId', 
									title : '委托方' 
								},
																
																{
									field : 'ecdiCompanyName', 
									title : '委托报关报检单位' 
								},
																{
									field : 'contact', 
									title : '联系人' 
								},
																{
									field : 'telephone', 
									title : '电话' 
								},
																{
									field : 'encasementType', 
									title : '装箱方式',
									formatter : function(value,row,index) {
										var JSON1={'0':'拼箱','1':'整柜','2':'拼车','3':'整车'};
										return JSON1[value];
									}
								},
																{
									field : 'twentyGpNum', 
									title : '20GP数量' 
								},
																{
									field : 'fortyGpNum', 
									title : '40GP数量' 
								},
																{
									field : 'fortyHqNum', 
									title : '40HQ数量'
								},
																{
									field : 'tradeWay', 
									title : '贸易方式' 
								},
																{
									field : 'settlementWay', 
									title : '结汇方式' 
								},
																{
									field : 'transportationMode', 
									title : '运输方式' 
								},
																{
									field : 'isWoodPackage', 
									title : '是否木制包装' 
								},
																
																{
									field : 'importPort', 
									title : '进口港口' 
								},
																
																
																{
									field : 'isStorage', 
									title : '是否入库' 
								},
																{
									field : 'storageDate', 
									title : '入库日期' 
								},
																{
									field : 'isCargoPropertyTransfer', 
									title : '是否货权转移' 
								},
																{
									field : 'isViolation', 
									title : '是否违规' 
								},
																{
									field : 'penaltyDepartment', 
									title : '处罚单位' 
								},
																{
									field : 'penaltyAmount', 
									title : '处罚金额' 
								},
																{
									field : 'penaltyDate', 
									title : '处罚日期' 
								},
																{
									field : 'remark', 
									title : '备注' 
								},
																{
									field : 'gmtCreate', 
									title : '创建时间' 
								},
																{
									field : 'gmtModified', 
									title : '修改时间' 
								},*/
																{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.imTrackBaseId
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.imTrackBaseId
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.imTrackBaseId
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
				'imTrackBaseId' : id
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
			ids[i] = row['imTrackBaseId'];
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