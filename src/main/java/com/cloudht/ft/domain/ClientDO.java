package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 委托人信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-17 18:19:12
 */
public class ClientDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long ftClientId;
	//公司类型：0-境外公司，1-个人注册，2-境内公司
	private Integer registerType;
	//公司名称
	private String companyName;
	//省
	private String province;
	//市
	private String city;
	//详细地址
	private String detailedAddress;
	//姓名
	private String fullName;
	//性别：0-女，1-男
	private Integer sex;
	//联系电话
	private String telephone;
	//手机
	private String phone;
	//营销人员ID
	private Long marketerId;
	//审核状态:0-新注册，1-已分配营销，2-资质审核中，3-审核不通过，4-审核通过，5-已分配客服，6-已分配操作人员
	private Integer auditStatus;
	//客户代码
	private String clientNo;
	//服务合同号
	private String serviceContractNo;
	//客服人员ID
	private Long servicerId;
	//操作人员ID
	private Long operatorId;
	//客户类型：0-有效客户，1-暂停出货客户，2-未出货客户
	private Integer clientType;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setFtClientId(Long ftClientId) {
		this.ftClientId = ftClientId;
	}
	/**
	 * 获取：主键
	 */
	public Long getFtClientId() {
		return ftClientId;
	}
	/**
	 * 设置：公司类型：0-境外公司，1-个人注册，2-境内公司
	 */
	public void setRegisterType(Integer registerType) {
		this.registerType = registerType;
	}
	/**
	 * 获取：公司类型：0-境外公司，1-个人注册，2-境内公司
	 */
	public Integer getRegisterType() {
		return registerType;
	}
	/**
	 * 设置：公司名称
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 获取：公司名称
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 设置：省
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：省
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：详细地址
	 */
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}
	/**
	 * 获取：详细地址
	 */
	public String getDetailedAddress() {
		return detailedAddress;
	}
	/**
	 * 设置：姓名
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * 获取：姓名
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * 设置：性别：0-女，1-男
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别：0-女，1-男
	 */
	public Integer getSex() {
		return sex;
	}
	/**
	 * 设置：联系电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 设置：手机
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：营销人员ID
	 */
	public void setMarketerId(Long marketerId) {
		this.marketerId = marketerId;
	}
	/**
	 * 获取：营销人员ID
	 */
	public Long getMarketerId() {
		return marketerId;
	}
	/**
	 * 设置：审核状态:0-新注册，1-已分配营销，2-资质审核中，3-审核不通过，4-审核通过，5-已分配客服，6-已分配操作人员
	 */
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * 获取：审核状态:0-新注册，1-已分配营销，2-资质审核中，3-审核不通过，4-审核通过，5-已分配客服，6-已分配操作人员
	 */
	public Integer getAuditStatus() {
		return auditStatus;
	}
	/**
	 * 设置：客户代码
	 */
	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}
	/**
	 * 获取：客户代码
	 */
	public String getClientNo() {
		return clientNo;
	}
	/**
	 * 设置：服务合同号
	 */
	public void setServiceContractNo(String serviceContractNo) {
		this.serviceContractNo = serviceContractNo;
	}
	/**
	 * 获取：服务合同号
	 */
	public String getServiceContractNo() {
		return serviceContractNo;
	}
	/**
	 * 设置：客服人员ID
	 */
	public void setServicerId(Long servicerId) {
		this.servicerId = servicerId;
	}
	/**
	 * 获取：客服人员ID
	 */
	public Long getServicerId() {
		return servicerId;
	}
	/**
	 * 设置：操作人员ID
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 获取：操作人员ID
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * 设置：客户类型：0-有效客户，1-暂停出货客户，2-未出货客户
	 */
	public void setClientType(Integer clientType) {
		this.clientType = clientType;
	}
	/**
	 * 获取：客户类型：0-有效客户，1-暂停出货客户，2-未出货客户
	 */
	public Integer getClientType() {
		return clientType;
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
