package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 国内外客户银行信息表
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public class FtCustBankDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//国内外客户银行信息表id
	private Integer ftCustBankId;
	//客户编码
	private Integer ftCustId;
	//银行名称
	private String bankName;
	//银行账号
	private String bankAccount;
	//银行类型
	private String bankType;
	//使用状态
	private Integer status;
	//备注
	private String remarks;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;
	//是否删除：0-否，1-是
	private Integer isDelete;

	/**
	 * 设置：国内外客户银行信息表id
	 */
	public void setFtCustBankId(Integer ftCustBankId) {
		this.ftCustBankId = ftCustBankId;
	}
	/**
	 * 获取：国内外客户银行信息表id
	 */
	public Integer getFtCustBankId() {
		return ftCustBankId;
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
	 * 设置：银行名称
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * 获取：银行名称
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * 设置：银行账号
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	/**
	 * 获取：银行账号
	 */
	public String getBankAccount() {
		return bankAccount;
	}
	/**
	 * 设置：银行类型
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	/**
	 * 获取：银行类型
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * 设置：使用状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：使用状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
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
