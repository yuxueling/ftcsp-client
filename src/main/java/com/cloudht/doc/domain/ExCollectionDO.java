package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 托收收汇
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:52
 */
public class ExCollectionDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exCollectionId;
	//发票号
	private String invoiceNo;
	//托收日期
	private Date collectionDate;
	//托收金额
	private Long collectionAmount;
	//收汇日期
	private Date foreignExchangeDate;
	//收汇金额
	private Long foreignExchangeAmount;
	//备注
	private String remark;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExCollectionId(Long exCollectionId) {
		this.exCollectionId = exCollectionId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExCollectionId() {
		return exCollectionId;
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
	 * 设置：托收日期
	 */
	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}
	/**
	 * 获取：托收日期
	 */
	public Date getCollectionDate() {
		return collectionDate;
	}
	/**
	 * 设置：托收金额
	 */
	public void setCollectionAmount(Long collectionAmount) {
		this.collectionAmount = collectionAmount;
	}
	/**
	 * 获取：托收金额
	 */
	public Long getCollectionAmount() {
		return collectionAmount;
	}
	/**
	 * 设置：收汇日期
	 */
	public void setForeignExchangeDate(Date foreignExchangeDate) {
		this.foreignExchangeDate = foreignExchangeDate;
	}
	/**
	 * 获取：收汇日期
	 */
	public Date getForeignExchangeDate() {
		return foreignExchangeDate;
	}
	/**
	 * 设置：收汇金额
	 */
	public void setForeignExchangeAmount(Long foreignExchangeAmount) {
		this.foreignExchangeAmount = foreignExchangeAmount;
	}
	/**
	 * 获取：收汇金额
	 */
	public Long getForeignExchangeAmount() {
		return foreignExchangeAmount;
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
