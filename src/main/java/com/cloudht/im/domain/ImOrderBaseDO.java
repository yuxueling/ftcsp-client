package com.cloudht.im.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 进口订单信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 10:53:43
 */
public class ImOrderBaseDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long imOrderBaseId;
	//委托方
	private Long ftClientId;
	//订单号
	private String orderNo;
	//供应商名称
	private String supplierName;
	//供应商地址
	private String supplierAddress;
	//币别
	private String currency;
	//价格条款
	private String priceTerms;
	//结汇方式
	private String settlementWay;
	//贸易方式
	private String tradeWay;
	//原产地
	private String originSourcePlace;
	//起运港
	private String departurePort;
	//转运港
	private String transitPort;
	//目的港
	private String destinationPort;
	//溢短装%
	private Float moreLess;
	//总数量
	private Integer totalQuantity;
	//总金额
	private Long totalAmount;
	//备注
	private String remark;
	//是否货运保险：0-否，1-是
	private Integer isCargoInsurance;
	//保险险别
	private String insuranceCoverage;
	//保险比率
	private Float insuranceRate;
	//投保金额
	private Long insuranceAmount;
	//审核状态：0-未提交，1-待预审，2-待专家预审，3-已撤销，4-已预审
	private Integer auditStatus;
	//是否已删除：0-否，1-是
	private Integer isDeleted;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setImOrderBaseId(Long imOrderBaseId) {
		this.imOrderBaseId = imOrderBaseId;
	}
	/**
	 * 获取：主键
	 */
	public Long getImOrderBaseId() {
		return imOrderBaseId;
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
	 * 设置：订单号
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * 获取：订单号
	 */
	public String getOrderNo() {
		return orderNo;
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
	 * 设置：贸易方式
	 */
	public void setTradeWay(String tradeWay) {
		this.tradeWay = tradeWay;
	}
	/**
	 * 获取：贸易方式
	 */
	public String getTradeWay() {
		return tradeWay;
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
	 * 设置：审核状态：0-未提交，1-待预审，2-待专家预审，3-已撤销，4-已预审
	 */
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * 获取：审核状态：0-未提交，1-待预审，2-待专家预审，3-已撤销，4-已预审
	 */
	public Integer getAuditStatus() {
		return auditStatus;
	}
	/**
	 * 设置：是否已删除：0-否，1-是
	 */
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	/**
	 * 获取：是否已删除：0-否，1-是
	 */
	public Integer getIsDeleted() {
		return isDeleted;
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
