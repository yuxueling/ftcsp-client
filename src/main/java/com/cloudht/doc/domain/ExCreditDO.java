package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 信用证
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:52
 */
public class ExCreditDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exCreditId;
	//信用证号
	private String creditNo;
	//通知银行
	private String advisingBank;
	//通知日期
	private Date noticeDate;
	//币别
	private String currency;
	//信用证金额
	private Long creditAmount;
	//开证人
	private String opener;
	//开证日期
	private Date issueDate;
	//开证国家
	private String issueCountry;
	//委托方
	private Long ftClientId;
	//装运日期
	private Date shipDate;
	//有效期限
	private Date expirationDate;
	//是否转让：0-否，1-是
	private Integer isTransfer;
	//是否承兑：0-否，1-是
	private Integer isAcceptance;
	//制单日期
	private Date vouchingDate;
	//货品名称
	private String commodityName;
	//其它事项
	private String others;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExCreditId(Long exCreditId) {
		this.exCreditId = exCreditId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExCreditId() {
		return exCreditId;
	}
	/**
	 * 设置：信用证号
	 */
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	/**
	 * 获取：信用证号
	 */
	public String getCreditNo() {
		return creditNo;
	}
	/**
	 * 设置：通知银行
	 */
	public void setAdvisingBank(String advisingBank) {
		this.advisingBank = advisingBank;
	}
	/**
	 * 获取：通知银行
	 */
	public String getAdvisingBank() {
		return advisingBank;
	}
	/**
	 * 设置：通知日期
	 */
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	/**
	 * 获取：通知日期
	 */
	public Date getNoticeDate() {
		return noticeDate;
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
	 * 设置：信用证金额
	 */
	public void setCreditAmount(Long creditAmount) {
		this.creditAmount = creditAmount;
	}
	/**
	 * 获取：信用证金额
	 */
	public Long getCreditAmount() {
		return creditAmount;
	}
	/**
	 * 设置：开证人
	 */
	public void setOpener(String opener) {
		this.opener = opener;
	}
	/**
	 * 获取：开证人
	 */
	public String getOpener() {
		return opener;
	}
	/**
	 * 设置：开证日期
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	/**
	 * 获取：开证日期
	 */
	public Date getIssueDate() {
		return issueDate;
	}
	/**
	 * 设置：开证国家
	 */
	public void setIssueCountry(String issueCountry) {
		this.issueCountry = issueCountry;
	}
	/**
	 * 获取：开证国家
	 */
	public String getIssueCountry() {
		return issueCountry;
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
	 * 设置：装运日期
	 */
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	/**
	 * 获取：装运日期
	 */
	public Date getShipDate() {
		return shipDate;
	}
	/**
	 * 设置：有效期限
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	/**
	 * 获取：有效期限
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}
	/**
	 * 设置：是否转让：0-否，1-是
	 */
	public void setIsTransfer(Integer isTransfer) {
		this.isTransfer = isTransfer;
	}
	/**
	 * 获取：是否转让：0-否，1-是
	 */
	public Integer getIsTransfer() {
		return isTransfer;
	}
	/**
	 * 设置：是否承兑：0-否，1-是
	 */
	public void setIsAcceptance(Integer isAcceptance) {
		this.isAcceptance = isAcceptance;
	}
	/**
	 * 获取：是否承兑：0-否，1-是
	 */
	public Integer getIsAcceptance() {
		return isAcceptance;
	}
	/**
	 * 设置：制单日期
	 */
	public void setVouchingDate(Date vouchingDate) {
		this.vouchingDate = vouchingDate;
	}
	/**
	 * 获取：制单日期
	 */
	public Date getVouchingDate() {
		return vouchingDate;
	}
	/**
	 * 设置：货品名称
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	/**
	 * 获取：货品名称
	 */
	public String getCommodityName() {
		return commodityName;
	}
	/**
	 * 设置：其它事项
	 */
	public void setOthers(String others) {
		this.others = others;
	}
	/**
	 * 获取：其它事项
	 */
	public String getOthers() {
		return others;
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
