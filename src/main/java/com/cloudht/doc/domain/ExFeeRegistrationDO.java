package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 费用明细登记
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
public class ExFeeRegistrationDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exFeeRegistrationId;
	//发票编号
	private String invoiceNo;
	//委托方
	private Long ftClientId;
	//费用类型
	private String costType;
	//币别
	private String currency;
	//金额
	private Long amount;
	//汇率
	private Float exchangeRate;
	//本位币金额
	private Long localCurrency;
	//登记日期
	private Date registrationDate;
	//登记人
	private String registrant;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExFeeRegistrationId(Long exFeeRegistrationId) {
		this.exFeeRegistrationId = exFeeRegistrationId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExFeeRegistrationId() {
		return exFeeRegistrationId;
	}
	/**
	 * 设置：发票编号
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	/**
	 * 获取：发票编号
	 */
	public String getInvoiceNo() {
		return invoiceNo;
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
	 * 设置：费用类型
	 */
	public void setCostType(String costType) {
		this.costType = costType;
	}
	/**
	 * 获取：费用类型
	 */
	public String getCostType() {
		return costType;
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
	 * 设置：金额
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	/**
	 * 获取：金额
	 */
	public Long getAmount() {
		return amount;
	}
	/**
	 * 设置：汇率
	 */
	public void setExchangeRate(Float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	/**
	 * 获取：汇率
	 */
	public Float getExchangeRate() {
		return exchangeRate;
	}
	/**
	 * 设置：本位币金额
	 */
	public void setLocalCurrency(Long localCurrency) {
		this.localCurrency = localCurrency;
	}
	/**
	 * 获取：本位币金额
	 */
	public Long getLocalCurrency() {
		return localCurrency;
	}
	/**
	 * 设置：登记日期
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * 设置：登记人
	 */
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	/**
	 * 获取：登记人
	 */
	public String getRegistrant() {
		return registrant;
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
