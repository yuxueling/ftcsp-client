package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户联系人信息表
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public class FtCustContactDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//客户联系人信息表id
	private Integer ftCustContactId;
	//客户编码
	private Integer ftCustId;
	//姓名
	private String contactName;
	//手机
	private String cellphone;
	//邮箱
	private String email;
	//电话
	private String phone;
	//传真
	private String faxes;
	//备注
	private String remarks;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;
	//是否删除：0-否，1-是
	private Integer isDelete;

	/**
	 * 设置：客户联系人信息表id
	 */
	public void setFtCustContactId(Integer ftCustContactId) {
		this.ftCustContactId = ftCustContactId;
	}
	/**
	 * 获取：客户联系人信息表id
	 */
	public Integer getFtCustContactId() {
		return ftCustContactId;
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
	 * 设置：姓名
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * 获取：姓名
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * 设置：手机
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	/**
	 * 获取：手机
	 */
	public String getCellphone() {
		return cellphone;
	}
	/**
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：传真
	 */
	public void setFaxes(String faxes) {
		this.faxes = faxes;
	}
	/**
	 * 获取：传真
	 */
	public String getFaxes() {
		return faxes;
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
