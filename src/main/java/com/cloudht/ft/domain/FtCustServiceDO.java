package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 国外客户业务信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public class FtCustServiceDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer ftCustServiceId;
	//客户编码
	private Integer ftCustId;
	//币别
	private String currency;
	//价格条款
	private String priceTerms;
	//结汇方式
	private String settlementWay;
	//起运港
	private String departurePort;
	//转运港
	private String transitPort;
	//目的港
	private String destinationPort;
	//运抵国
	private String destinationCountry;
	//船公司名称
	private String shipCompanyName;
	//货代公司
	private String forwarderCompanyName;
	//信用险生效日
	private Date creditInsuranceEffectDate;
	//信用险买方代码
	private String creditInsuranceBuyerNo;
	//信用额度
	private Integer creditLine;
	//信用险申请号
	private String creditInsuranceApplicationNo;
	//信用险结算方式
	private String creditInsuranceSettleWay;
	//结算期限
	private Date settleDeadline;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;
	//是否删除：0-否，1-是
	private Integer isDelete;

	/**
	 * 设置：主键
	 */
	public void setFtCustServiceId(Integer ftCustServiceId) {
		this.ftCustServiceId = ftCustServiceId;
	}
	/**
	 * 获取：主键
	 */
	public Integer getFtCustServiceId() {
		return ftCustServiceId;
	}
	/**
	 * 设置：客户编码
	 */
	public void setFtCustId(Integer ftCustId) {
		this.ftCustId = ftCustId;
	}
	/**
	 * 获取：客户编码
	 */
	public Integer getFtCustId() {
		return ftCustId;
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
	 * 设置：价格条款
	 */
	public void setPriceTerms(String priceTerms) {
		this.priceTerms = priceTerms;
	}
	/**
	 * 获取：价格条款
	 */
	public String getPriceTerms() {
		return priceTerms;
	}
	/**
	 * 设置：结汇方式
	 */
	public void setSettlementWay(String settlementWay) {
		this.settlementWay = settlementWay;
	}
	/**
	 * 获取：结汇方式
	 */
	public String getSettlementWay() {
		return settlementWay;
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
	 * 设置：转运港
	 */
	public void setTransitPort(String transitPort) {
		this.transitPort = transitPort;
	}
	/**
	 * 获取：转运港
	 */
	public String getTransitPort() {
		return transitPort;
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
	 * 设置：运抵国
	 */
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	/**
	 * 获取：运抵国
	 */
	public String getDestinationCountry() {
		return destinationCountry;
	}
	/**
	 * 设置：船公司名称
	 */
	public void setShipCompanyName(String shipCompanyName) {
		this.shipCompanyName = shipCompanyName;
	}
	/**
	 * 获取：船公司名称
	 */
	public String getShipCompanyName() {
		return shipCompanyName;
	}
	/**
	 * 设置：货代公司
	 */
	public void setForwarderCompanyName(String forwarderCompanyName) {
		this.forwarderCompanyName = forwarderCompanyName;
	}
	/**
	 * 获取：货代公司
	 */
	public String getForwarderCompanyName() {
		return forwarderCompanyName;
	}
	/**
	 * 设置：信用险生效日
	 */
	public void setCreditInsuranceEffectDate(Date creditInsuranceEffectDate) {
		this.creditInsuranceEffectDate = creditInsuranceEffectDate;
	}
	/**
	 * 获取：信用险生效日
	 */
	public Date getCreditInsuranceEffectDate() {
		return creditInsuranceEffectDate;
	}
	/**
	 * 设置：信用险买方代码
	 */
	public void setCreditInsuranceBuyerNo(String creditInsuranceBuyerNo) {
		this.creditInsuranceBuyerNo = creditInsuranceBuyerNo;
	}
	/**
	 * 获取：信用险买方代码
	 */
	public String getCreditInsuranceBuyerNo() {
		return creditInsuranceBuyerNo;
	}
	/**
	 * 设置：信用额度
	 */
	public void setCreditLine(Integer creditLine) {
		this.creditLine = creditLine;
	}
	/**
	 * 获取：信用额度
	 */
	public Integer getCreditLine() {
		return creditLine;
	}
	/**
	 * 设置：信用险申请号
	 */
	public void setCreditInsuranceApplicationNo(String creditInsuranceApplicationNo) {
		this.creditInsuranceApplicationNo = creditInsuranceApplicationNo;
	}
	/**
	 * 获取：信用险申请号
	 */
	public String getCreditInsuranceApplicationNo() {
		return creditInsuranceApplicationNo;
	}
	/**
	 * 设置：信用险结算方式
	 */
	public void setCreditInsuranceSettleWay(String creditInsuranceSettleWay) {
		this.creditInsuranceSettleWay = creditInsuranceSettleWay;
	}
	/**
	 * 获取：信用险结算方式
	 */
	public String getCreditInsuranceSettleWay() {
		return creditInsuranceSettleWay;
	}
	/**
	 * 设置：结算期限
	 */
	public void setSettleDeadline(Date settleDeadline) {
		this.settleDeadline = settleDeadline;
	}
	/**
	 * 获取：结算期限
	 */
	public Date getSettleDeadline() {
		return settleDeadline;
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
	/**
	 * 设置：是否删除：0-否，1-是
	 */
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：是否删除：0-否，1-是
	 */
	public Integer getIsDelete() {
		return isDelete;
	}
}
