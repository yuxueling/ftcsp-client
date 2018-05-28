package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 信用证费用
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:52
 */
public class ExCreditFeeDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exCreditFeeId;
	//信用证主键
	private Long exCreditId;
	//费用类型
	private String feeType;
	//币别
	private String currency;
	//收费单位
	private String chargeUnit;
	//费用金额
	private String feeAmount;
	//费用日期
	private Date feeDate;
	//备注
	private String remark;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExCreditFeeId(Long exCreditFeeId) {
		this.exCreditFeeId = exCreditFeeId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExCreditFeeId() {
		return exCreditFeeId;
	}
	/**
	 * 设置：信用证主键
	 */
	public void setExCreditId(Long exCreditId) {
		this.exCreditId = exCreditId;
	}
	/**
	 * 获取：信用证主键
	 */
	public Long getExCreditId() {
		return exCreditId;
	}
	/**
	 * 设置：费用类型
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	/**
	 * 获取：费用类型
	 */
	public String getFeeType() {
		return feeType;
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
	 * 设置：收费单位
	 */
	public void setChargeUnit(String chargeUnit) {
		this.chargeUnit = chargeUnit;
	}
	/**
	 * 获取：收费单位
	 */
	public String getChargeUnit() {
		return chargeUnit;
	}
	/**
	 * 设置：费用金额
	 */
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}
	/**
	 * 获取：费用金额
	 */
	public String getFeeAmount() {
		return feeAmount;
	}
	/**
	 * 设置：费用日期
	 */
	public void setFeeDate(Date feeDate) {
		this.feeDate = feeDate;
	}
	/**
	 * 获取：费用日期
	 */
	public Date getFeeDate() {
		return feeDate;
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
