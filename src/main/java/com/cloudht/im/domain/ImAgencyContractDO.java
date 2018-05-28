package com.cloudht.im.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 进口代理合同
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 10:53:43
 */
public class ImAgencyContractDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long imAgencyContractId;
	//委托方
	private Long ftClientId;
	//供应商名称
	private String supplierName;
	//供应商地址
	private String supplierAddress;
	//代理合同号
	private String agencyContractNo;
	//签约日期
	private Date agencyContractDate;
	//签约地
	private String agencyContractPlace;
	//币别
	private String currency;
	//价格条款
	private String priceTerms;
	//结汇方式
	private String settlementWay;
	//原产地
	private String originSourcePlace;
	//起运港
	private String departurePort;
	//转运港
	private String transitPort;
	//目的港
	private String destinationPort;
	//付款期限
	private Date paymentTermDate;
	//装运期限
	private Date shipmentDeadline;
	//保证金比率%
	private Float marginRatio;
	//溢短装%
	private Float moreLess;
	//总数量
	private Integer totalQuantity;
	//总金额
	private Long totalAmount;
	//是否货运保险：0-否，1-是
	private Integer isCargoInsurance;
	//保险险别
	private String insuranceCoverage;
	//保险比率
	private Float insuranceRate;
	//投保金额
	private Long insuranceAmount;
	//备注
	private String remark;
	//代理合同号
	private String imContractNo;
	//签约日期
	private Date imContractDate;
	//签约地
	private String imContractPlace;
	//进口合同附件ID
	private Long imContractFileId;
	//代理合同附件ID
	private Long agencyContractFileId;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setImAgencyContractId(Long imAgencyContractId) {
		this.imAgencyContractId = imAgencyContractId;
	}
	/**
	 * 获取：主键
	 */
	public Long getImAgencyContractId() {
		return imAgencyContractId;
	}
	/**
	 * 设置：委托方
	 */
	public void setFtClientId(Long ftClientId) {
		this.ftClientId = ftClientId;
	}
	/**
	 * 获取：委托方
	 */
	public Long getFtClientId() {
		return ftClientId;
	}
	/**
	 * 设置：供应商名称
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * 获取：供应商名称
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * 设置：供应商地址
	 */
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	/**
	 * 获取：供应商地址
	 */
	public String getSupplierAddress() {
		return supplierAddress;
	}
	/**
	 * 设置：代理合同号
	 */
	public void setAgencyContractNo(String agencyContractNo) {
		this.agencyContractNo = agencyContractNo;
	}
	/**
	 * 获取：代理合同号
	 */
	public String getAgencyContractNo() {
		return agencyContractNo;
	}
	/**
	 * 设置：签约日期
	 */
	public void setAgencyContractDate(Date agencyContractDate) {
		this.agencyContractDate = agencyContractDate;
	}
	/**
	 * 获取：签约日期
	 */
	public Date getAgencyContractDate() {
		return agencyContractDate;
	}
	/**
	 * 设置：签约地
	 */
	public void setAgencyContractPlace(String agencyContractPlace) {
		this.agencyContractPlace = agencyContractPlace;
	}
	/**
	 * 获取：签约地
	 */
	public String getAgencyContractPlace() {
		return agencyContractPlace;
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
	 * 设置：原产地
	 */
	public void setOriginSourcePlace(String originSourcePlace) {
		this.originSourcePlace = originSourcePlace;
	}
	/**
	 * 获取：原产地
	 */
	public String getOriginSourcePlace() {
		return originSourcePlace;
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
	 * 设置：付款期限
	 */
	public void setPaymentTermDate(Date paymentTermDate) {
		this.paymentTermDate = paymentTermDate;
	}
	/**
	 * 获取：付款期限
	 */
	public Date getPaymentTermDate() {
		return paymentTermDate;
	}
	/**
	 * 设置：装运期限
	 */
	public void setShipmentDeadline(Date shipmentDeadline) {
		this.shipmentDeadline = shipmentDeadline;
	}
	/**
	 * 获取：装运期限
	 */
	public Date getShipmentDeadline() {
		return shipmentDeadline;
	}
	/**
	 * 设置：保证金比率%
	 */
	public void setMarginRatio(Float marginRatio) {
		this.marginRatio = marginRatio;
	}
	/**
	 * 获取：保证金比率%
	 */
	public Float getMarginRatio() {
		return marginRatio;
	}
	/**
	 * 设置：溢短装%
	 */
	public void setMoreLess(Float moreLess) {
		this.moreLess = moreLess;
	}
	/**
	 * 获取：溢短装%
	 */
	public Float getMoreLess() {
		return moreLess;
	}
	/**
	 * 设置：总数量
	 */
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	/**
	 * 获取：总数量
	 */
	public Integer getTotalQuantity() {
		return totalQuantity;
	}
	/**
	 * 设置：总金额
	 */
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * 获取：总金额
	 */
	public Long getTotalAmount() {
		return totalAmount;
	}
	/**
	 * 设置：是否货运保险：0-否，1-是
	 */
	public void setIsCargoInsurance(Integer isCargoInsurance) {
		this.isCargoInsurance = isCargoInsurance;
	}
	/**
	 * 获取：是否货运保险：0-否，1-是
	 */
	public Integer getIsCargoInsurance() {
		return isCargoInsurance;
	}
	/**
	 * 设置：保险险别
	 */
	public void setInsuranceCoverage(String insuranceCoverage) {
		this.insuranceCoverage = insuranceCoverage;
	}
	/**
	 * 获取：保险险别
	 */
	public String getInsuranceCoverage() {
		return insuranceCoverage;
	}
	/**
	 * 设置：保险比率
	 */
	public void setInsuranceRate(Float insuranceRate) {
		this.insuranceRate = insuranceRate;
	}
	/**
	 * 获取：保险比率
	 */
	public Float getInsuranceRate() {
		return insuranceRate;
	}
	/**
	 * 设置：投保金额
	 */
	public void setInsuranceAmount(Long insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	/**
	 * 获取：投保金额
	 */
	public Long getInsuranceAmount() {
		return insuranceAmount;
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
	 * 设置：代理合同号
	 */
	public void setImContractNo(String imContractNo) {
		this.imContractNo = imContractNo;
	}
	/**
	 * 获取：代理合同号
	 */
	public String getImContractNo() {
		return imContractNo;
	}
	/**
	 * 设置：签约日期
	 */
	public void setImContractDate(Date imContractDate) {
		this.imContractDate = imContractDate;
	}
	/**
	 * 获取：签约日期
	 */
	public Date getImContractDate() {
		return imContractDate;
	}
	/**
	 * 设置：签约地
	 */
	public void setImContractPlace(String imContractPlace) {
		this.imContractPlace = imContractPlace;
	}
	/**
	 * 获取：签约地
	 */
	public String getImContractPlace() {
		return imContractPlace;
	}
	/**
	 * 设置：进口合同附件ID
	 */
	public void setImContractFileId(Long imContractFileId) {
		this.imContractFileId = imContractFileId;
	}
	/**
	 * 获取：进口合同附件ID
	 */
	public Long getImContractFileId() {
		return imContractFileId;
	}
	/**
	 * 设置：代理合同附件ID
	 */
	public void setAgencyContractFileId(Long agencyContractFileId) {
		this.agencyContractFileId = agencyContractFileId;
	}
	/**
	 * 获取：代理合同附件ID
	 */
	public Long getAgencyContractFileId() {
		return agencyContractFileId;
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
