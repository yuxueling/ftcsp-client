package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public class FtCustDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//客户编码
	private Integer ftCustId;
	//委托方
	private Long ftClientId;
	//客户国籍:0-国内客户、1-国外客户
	private Integer custNationality;
	//客户名称
	private String custName;
	//电话
	private String phone;
	//传真
	private String faxes;
	//邮箱
	private String email;
	//详细地址
	private String address;
	//邮编
	private String postcode;
	//类型
	private String type;
	//网址
	private String url;
	//等级：0-一星级
	private Integer rank;
	//状态：0-有效 1-暂停
	private Integer status;
	//主要产品
	private String mainProducts;
	//总经理
	private String generalManager;
	//产品类型
	private String productType;
	//工商登记号
	private String businessRegistrationNo;
	//税号
	private String dutyParagraph;
	//备注
	private String remarks;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;
	//是否删除：0-否，1-是
	private Integer isDelete;

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
	 * 设置：客户国籍:0-国内客户、1-国外客户
	 */
	public void setCustNationality(Integer custNationality) {
		this.custNationality = custNationality;
	}
	/**
	 * 获取：客户国籍:0-国内客户、1-国外客户
	 */
	public Integer getCustNationality() {
		return custNationality;
	}
	/**
	 * 设置：客户名称
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * 获取：客户名称
	 */
	public String getCustName() {
		return custName;
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
	 * 设置：详细地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：详细地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：邮编
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * 获取：邮编
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * 设置：类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：网址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：网址
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：等级：0-一星级
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	/**
	 * 获取：等级：0-一星级
	 */
	public Integer getRank() {
		return rank;
	}
	/**
	 * 设置：状态：0-有效 1-暂停
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态：0-有效 1-暂停
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：主要产品
	 */
	public void setMainProducts(String mainProducts) {
		this.mainProducts = mainProducts;
	}
	/**
	 * 获取：主要产品
	 */
	public String getMainProducts() {
		return mainProducts;
	}
	/**
	 * 设置：总经理
	 */
	public void setGeneralManager(String generalManager) {
		this.generalManager = generalManager;
	}
	/**
	 * 获取：总经理
	 */
	public String getGeneralManager() {
		return generalManager;
	}
	/**
	 * 设置：产品类型
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * 获取：产品类型
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * 设置：工商登记号
	 */
	public void setBusinessRegistrationNo(String businessRegistrationNo) {
		this.businessRegistrationNo = businessRegistrationNo;
	}
	/**
	 * 获取：工商登记号
	 */
	public String getBusinessRegistrationNo() {
		return businessRegistrationNo;
	}
	/**
	 * 设置：税号
	 */
	public void setDutyParagraph(String dutyParagraph) {
		this.dutyParagraph = dutyParagraph;
	}
	/**
	 * 获取：税号
	 */
	public String getDutyParagraph() {
		return dutyParagraph;
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
