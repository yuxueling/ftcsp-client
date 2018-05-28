package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 议付信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
public class ExNegotiationBaseDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exNegotiationBaseId;
	//发票号
	private String invoiceNo;
	//信用证号
	private String creditLetter;
	//国外客户订单号
	private String foreignOrderNo;
	//我们订单号
	private String ourOrderNo;
	//出口商
	private String exportMerchant;
	//客户公司抬头
	private String customerCompanyName;
	//出运日期
	private Date shipDate;
	//运输方式
	private String transportMode;
	//原产国
	private String originCountry;
	//运输与付款条款
	private String transportPayTerms;
	//起运港
	private String departurePort;
	//目的港
	private String destinationPort;
	//币别
	private String currency;
	//议付状态：0-未议付，1-正常议付，2-异常议付
	private Integer negotiationStatus;
	//议付日期
	private Date negotiationDate;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExNegotiationBaseId(Long exNegotiationBaseId) {
		this.exNegotiationBaseId = exNegotiationBaseId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExNegotiationBaseId() {
		return exNegotiationBaseId;
	}
	/**
	 * 设置：发票号
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	/**
	 * 获取：发票号
	 */
	public String getInvoiceNo() {
		return invoiceNo;
	}
	/**
	 * 设置：信用证号
	 */
	public void setCreditLetter(String creditLetter) {
		this.creditLetter = creditLetter;
	}
	/**
	 * 获取：信用证号
	 */
	public String getCreditLetter() {
		return creditLetter;
	}
	/**
	 * 设置：国外客户订单号
	 */
	public void setForeignOrderNo(String foreignOrderNo) {
		this.foreignOrderNo = foreignOrderNo;
	}
	/**
	 * 获取：国外客户订单号
	 */
	public String getForeignOrderNo() {
		return foreignOrderNo;
	}
	/**
	 * 设置：我们订单号
	 */
	public void setOurOrderNo(String ourOrderNo) {
		this.ourOrderNo = ourOrderNo;
	}
	/**
	 * 获取：我们订单号
	 */
	public String getOurOrderNo() {
		return ourOrderNo;
	}
	/**
	 * 设置：出口商
	 */
	public void setExportMerchant(String exportMerchant) {
		this.exportMerchant = exportMerchant;
	}
	/**
	 * 获取：出口商
	 */
	public String getExportMerchant() {
		return exportMerchant;
	}
	/**
	 * 设置：客户公司抬头
	 */
	public void setCustomerCompanyName(String customerCompanyName) {
		this.customerCompanyName = customerCompanyName;
	}
	/**
	 * 获取：客户公司抬头
	 */
	public String getCustomerCompanyName() {
		return customerCompanyName;
	}
	/**
	 * 设置：出运日期
	 */
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	/**
	 * 获取：出运日期
	 */
	public Date getShipDate() {
		return shipDate;
	}
	/**
	 * 设置：运输方式
	 */
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	/**
	 * 获取：运输方式
	 */
	public String getTransportMode() {
		return transportMode;
	}
	/**
	 * 设置：原产国
	 */
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	/**
	 * 获取：原产国
	 */
	public String getOriginCountry() {
		return originCountry;
	}
	/**
	 * 设置：运输与付款条款
	 */
	public void setTransportPayTerms(String transportPayTerms) {
		this.transportPayTerms = transportPayTerms;
	}
	/**
	 * 获取：运输与付款条款
	 */
	public String getTransportPayTerms() {
		return transportPayTerms;
	}
	/**
	 * 设置：起运港
	 */
	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}
	/**
	 * 获取：起运港
	 */
	public String getDeparturePort() {
		return departurePort;
	}
	/**
	 * 设置：目的港
	 */
	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}
	/**
	 * 获取：目的港
	 */
	public String getDestinationPort() {
		return destinationPort;
	}
	/**
	 * 设置：币别
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * 获取：币别
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * 设置：议付状态：0-未议付，1-正常议付，2-异常议付
	 */
	public void setNegotiationStatus(Integer negotiationStatus) {
		this.negotiationStatus = negotiationStatus;
	}
	/**
	 * 获取：议付状态：0-未议付，1-正常议付，2-异常议付
	 */
	public Integer getNegotiationStatus() {
		return negotiationStatus;
	}
	/**
	 * 设置：议付日期
	 */
	public void setNegotiationDate(Date negotiationDate) {
		this.negotiationDate = negotiationDate;
	}
	/**
	 * 获取：议付日期
	 */
	public Date getNegotiationDate() {
		return negotiationDate;
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
