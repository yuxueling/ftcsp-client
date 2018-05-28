package com.cloudht.ex.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 出口订单确认信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
public class OrderConfirmDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Long exOrderConfirmId;
	//出口订单头主键
	private Long exOrderHeaderId;
	//已确认证件（多选“，”分隔）：00-商检，01-订舱，02-报关，03-提单确认，04-结汇单证，05-产地证
	private String credentials;
	//操作类型：0-非全套操作，1-全套操作，2-客户制单
	private Integer operationType;
	//备注
	private String remark;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：ID
	 */
	public void setExOrderConfirmId(Long exOrderConfirmId) {
		this.exOrderConfirmId = exOrderConfirmId;
	}
	/**
	 * 获取：ID
	 */
	public Long getExOrderConfirmId() {
		return exOrderConfirmId;
	}
	/**
	 * 设置：出口订单头主键
	 */
	public void setExOrderHeaderId(Long exOrderHeaderId) {
		this.exOrderHeaderId = exOrderHeaderId;
	}
	/**
	 * 获取：出口订单头主键
	 */
	public Long getExOrderHeaderId() {
		return exOrderHeaderId;
	}
	/**
	 * 设置：已确认证件（多选“，”分隔）：00-商检，01-订舱，02-报关，03-提单确认，04-结汇单证，05-产地证
	 */
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	/**
	 * 获取：已确认证件（多选“，”分隔）：00-商检，01-订舱，02-报关，03-提单确认，04-结汇单证，05-产地证
	 */
	public String getCredentials() {
		return credentials;
	}
	/**
	 * 设置：操作类型：0-非全套操作，1-全套操作，2-客户制单
	 */
	public void setOperationType(Integer operationType) {
		this.operationType = operationType;
	}
	/**
	 * 获取：操作类型：0-非全套操作，1-全套操作，2-客户制单
	 */
	public Integer getOperationType() {
		return operationType;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：创建时间
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}
	/**
	 * 设置：修改时间
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getGmtModified() {
		return gmtModified;
	}
}
