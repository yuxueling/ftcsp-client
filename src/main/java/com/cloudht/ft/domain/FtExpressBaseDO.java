package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 快件信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:04:18
 */
public class FtExpressBaseDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long ftExpressBaseId;
	//快件类型
	private String shipmentType;
	//收寄日期
	private Date postDate;
	//经手人
	private String handlerName;
	//寄件人
	private String senderName;
	//寄件人电话
	private String senderTelephone;
	//订单号
	private String orderNo;
	//委托方
	private Long ftClientId;
	//客户名称
	private String customerName;
	//客户ID
	private Long customerId;
	//详细地址
	private String detailedAddress;
	//联系人
	private String contact;
	//联系人电话
	private String contactTelephone;
	//联系人手机
	private String contactPhone;
	//国别
	private String country;
	//省
	private String province;
	//城市
	private String city;
	//邮政编码
	private String postcode;
	//区号
	private String areaCode;
	//到付账号
	private String courierAccount;
	//快递公司
	private String expressCompany;
	//快递单号
	private String expressNo;
	//付款方式：0-到付，1-预付
	private Integer paymentType;
	//快递运费
	private Integer expressFee;
	//快件描述
	private String expressDesc;
	//附件路径
	private String filePath;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setFtExpressBaseId(Long ftExpressBaseId) {
		this.ftExpressBaseId = ftExpressBaseId;
	}
	/**
	 * 获取：主键
	 */
	public Long getFtExpressBaseId() {
		return ftExpressBaseId;
	}
	/**
	 * 设置：快件类型
	 */
	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}
	/**
	 * 获取：快件类型
	 */
	public String getShipmentType() {
		return shipmentType;
	}
	/**
	 * 设置：收寄日期
	 */
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	/**
	 * 获取：收寄日期
	 */
	public Date getPostDate() {
		return postDate;
	}
	/**
	 * 设置：经手人
	 */
	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}
	/**
	 * 获取：经手人
	 */
	public String getHandlerName() {
		return handlerName;
	}
	/**
	 * 设置：寄件人
	 */
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	/**
	 * 获取：寄件人
	 */
	public String getSenderName() {
		return senderName;
	}
	/**
	 * 设置：寄件人电话
	 */
	public void setSenderTelephone(String senderTelephone) {
		this.senderTelephone = senderTelephone;
	}
	/**
	 * 获取：寄件人电话
	 */
	public String getSenderTelephone() {
		return senderTelephone;
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
	 * 设置：客户名称
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 获取：客户名称
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * 设置：客户ID
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	/**
	 * 获取：客户ID
	 */
	public Long getCustomerId() {
		return customerId;
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
	 * 设置：联系人
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * 获取：联系人
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * 设置：联系人电话
	 */
	public void setContactTelephone(String contactTelephone) {
		this.contactTelephone = contactTelephone;
	}
	/**
	 * 获取：联系人电话
	 */
	public String getContactTelephone() {
		return contactTelephone;
	}
	/**
	 * 设置：联系人手机
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	/**
	 * 获取：联系人手机
	 */
	public String getContactPhone() {
		return contactPhone;
	}
	/**
	 * 设置：国别
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * 获取：国别
	 */
	public String getCountry() {
		return country;
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
	 * 设置：城市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：城市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：邮政编码
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * 获取：邮政编码
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * 设置：区号
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * 获取：区号
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * 设置：到付账号
	 */
	public void setCourierAccount(String courierAccount) {
		this.courierAccount = courierAccount;
	}
	/**
	 * 获取：到付账号
	 */
	public String getCourierAccount() {
		return courierAccount;
	}
	/**
	 * 设置：快递公司
	 */
	public void setExpressCompany(String expressCompany) {
		this.expressCompany = expressCompany;
	}
	/**
	 * 获取：快递公司
	 */
	public String getExpressCompany() {
		return expressCompany;
	}
	/**
	 * 设置：快递单号
	 */
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}
	/**
	 * 获取：快递单号
	 */
	public String getExpressNo() {
		return expressNo;
	}
	/**
	 * 设置：付款方式：0-到付，1-预付
	 */
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * 获取：付款方式：0-到付，1-预付
	 */
	public Integer getPaymentType() {
		return paymentType;
	}
	/**
	 * 设置：快递运费
	 */
	public void setExpressFee(Integer expressFee) {
		this.expressFee = expressFee;
	}
	/**
	 * 获取：快递运费
	 */
	public Integer getExpressFee() {
		return expressFee;
	}
	/**
	 * 设置：快件描述
	 */
	public void setExpressDesc(String expressDesc) {
		this.expressDesc = expressDesc;
	}
	/**
	 * 获取：快件描述
	 */
	public String getExpressDesc() {
		return expressDesc;
	}
	/**
	 * 设置：附件路径
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	/**
	 * 获取：附件路径
	 */
	public String getFilePath() {
		return filePath;
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
