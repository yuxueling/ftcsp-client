package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 17:59:26
 */
public class ExOrderOperationDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exOrderOperationId;
	//出口订单头主键
	private Long exOrderHeaderId;
	//操作人ID
	private String operatorId;
	//操作人姓名
	private String operatorName;
	//已制作托单：0-否，1-是
	private Integer isShipOrder;
	//已制作报检：0-否，1-是
	private Integer isCustomsInspection;
	//已制作报关：0-否，1-是
	private Integer isCustomsDeclaration;
	//已制作产地证：0-否，1-是
	private Integer isOriginCertificate;
	//已制作议付单证：0-否，1-是
	private Integer isNegotiation;
	//已制作托收：0-否，1-是
	private Integer isCollection;
	//已制作订单环节：0-否，1-是
	private Integer isOrderLink;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExOrderOperationId(Long exOrderOperationId) {
		this.exOrderOperationId = exOrderOperationId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExOrderOperationId() {
		return exOrderOperationId;
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
	 * 设置：操作人ID
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 获取：操作人ID
	 */
	public String getOperatorId() {
		return operatorId;
	}
	/**
	 * 设置：操作人姓名
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	/**
	 * 获取：操作人姓名
	 */
	public String getOperatorName() {
		return operatorName;
	}
	/**
	 * 设置：已制作托单：0-否，1-是
	 */
	public void setIsShipOrder(Integer isShipOrder) {
		this.isShipOrder = isShipOrder;
	}
	/**
	 * 获取：已制作托单：0-否，1-是
	 */
	public Integer getIsShipOrder() {
		return isShipOrder;
	}
	/**
	 * 设置：已制作报检：0-否，1-是
	 */
	public void setIsCustomsInspection(Integer isCustomsInspection) {
		this.isCustomsInspection = isCustomsInspection;
	}
	/**
	 * 获取：已制作报检：0-否，1-是
	 */
	public Integer getIsCustomsInspection() {
		return isCustomsInspection;
	}
	/**
	 * 设置：已制作报关：0-否，1-是
	 */
	public void setIsCustomsDeclaration(Integer isCustomsDeclaration) {
		this.isCustomsDeclaration = isCustomsDeclaration;
	}
	/**
	 * 获取：已制作报关：0-否，1-是
	 */
	public Integer getIsCustomsDeclaration() {
		return isCustomsDeclaration;
	}
	/**
	 * 设置：已制作产地证：0-否，1-是
	 */
	public void setIsOriginCertificate(Integer isOriginCertificate) {
		this.isOriginCertificate = isOriginCertificate;
	}
	/**
	 * 获取：已制作产地证：0-否，1-是
	 */
	public Integer getIsOriginCertificate() {
		return isOriginCertificate;
	}
	/**
	 * 设置：已制作议付单证：0-否，1-是
	 */
	public void setIsNegotiation(Integer isNegotiation) {
		this.isNegotiation = isNegotiation;
	}
	/**
	 * 获取：已制作议付单证：0-否，1-是
	 */
	public Integer getIsNegotiation() {
		return isNegotiation;
	}
	/**
	 * 设置：已制作托收：0-否，1-是
	 */
	public void setIsCollection(Integer isCollection) {
		this.isCollection = isCollection;
	}
	/**
	 * 获取：已制作托收：0-否，1-是
	 */
	public Integer getIsCollection() {
		return isCollection;
	}
	/**
	 * 设置：已制作订单环节：0-否，1-是
	 */
	public void setIsOrderLink(Integer isOrderLink) {
		this.isOrderLink = isOrderLink;
	}
	/**
	 * 获取：已制作订单环节：0-否，1-是
	 */
	public Integer getIsOrderLink() {
		return isOrderLink;
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
