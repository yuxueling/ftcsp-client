package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 订单环节信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 16:34:02
 */
public class ExOrderLinkDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exOrderLinkId;
	//订单编号
	private String orderNo;
	//环节名称
	private String linkName;
	//环节状态
	private String linkStatus;
	//完成时间
	private Date finishDate;
	//备注
	private String remark;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExOrderLinkId(Long exOrderLinkId) {
		this.exOrderLinkId = exOrderLinkId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExOrderLinkId() {
		return exOrderLinkId;
	}
	/**
	 * 设置：订单编号
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * 获取：订单编号
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * 设置：环节名称
	 */
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	/**
	 * 获取：环节名称
	 */
	public String getLinkName() {
		return linkName;
	}
	/**
	 * 设置：环节状态
	 */
	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}
	/**
	 * 获取：环节状态
	 */
	public String getLinkStatus() {
		return linkStatus;
	}
	/**
	 * 设置：完成时间
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	/**
	 * 获取：完成时间
	 */
	public Date getFinishDate() {
		return finishDate;
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
