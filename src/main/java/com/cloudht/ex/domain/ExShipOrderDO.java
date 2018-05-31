package com.cloudht.ex.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 托单信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:00:23
 */
public class ExShipOrderDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exShipOrderId;
	//发货人
	private String shipper;
	//收货人
	private String consignee;
	//通知人
	private String notifyParty;
	//发票号
	private String invoiceNo;
	//合同号
	private String contractNo;
	//可否转船：0-否，1-是
	private Integer isTransship;
	//可否分批：0-否，1-是
	private Integer isPartialship;
	//装船期限
	private Date shipDate;
	//船公司名称
	private String shipCompanyName;
	//起运港
	private String departurePort;
	//转运港
	private String transitPort;
	//目的港
	private String destinationPort;
	//有效期限
	private Date expiryDate;
	//交货日期
	private Date deliveryDate;
	//装箱方式：0-拼箱，1-整柜，2-拼车？，3-整车？
	private Integer encasementType;
	//20'GP数量
	private Integer twentyGpNum;
	//40'GP数量
	private Integer fortyGpNum;
	//40'HQ数量
	private Integer fortyHqNum;
	//运费支付方式：0-预付，1-到付
	private Integer freightPayment;
	//联系人
	private String contact;
	//电话
	private String telephone;
	//传真
	private String fax;
	//正本提单份数
	private Integer nosOriginalBsl;
	//副本提单份数
	private Integer nosOriginalBslCopy;
	//报关金额
	private Long customsDeclaredValue;
	//币别
	private String currency;
	//注意事项
	private String announcement;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExShipOrderId(Long exShipOrderId) {
		this.exShipOrderId = exShipOrderId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExShipOrderId() {
		return exShipOrderId;
	}
	/**
	 * 设置：发货人
	 */
	public void setShipper(String shipper) {
		this.shipper = shipper;
	}
	/**
	 * 获取：发货人
	 */
	public String getShipper() {
		return shipper;
	}
	/**
	 * 设置：收货人
	 */
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	/**
	 * 获取：收货人
	 */
	public String getConsignee() {
		return consignee;
	}
	/**
	 * 设置：通知人
	 */
	public void setNotifyParty(String notifyParty) {
		this.notifyParty = notifyParty;
	}
	/**
	 * 获取：通知人
	 */
	public String getNotifyParty() {
		return notifyParty;
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
	 * 设置：合同号
	 */
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	/**
	 * 获取：合同号
	 */
	public String getContractNo() {
		return contractNo;
	}
	/**
	 * 设置：可否转船：0-否，1-是
	 */
	public void setIsTransship(Integer isTransship) {
		this.isTransship = isTransship;
	}
	/**
	 * 获取：可否转船：0-否，1-是
	 */
	public Integer getIsTransship() {
		return isTransship;
	}
	/**
	 * 设置：可否分批：0-否，1-是
	 */
	public void setIsPartialship(Integer isPartialship) {
		this.isPartialship = isPartialship;
	}
	/**
	 * 获取：可否分批：0-否，1-是
	 */
	public Integer getIsPartialship() {
		return isPartialship;
	}
	/**
	 * 设置：装船期限
	 */
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	/**
	 * 获取：装船期限
	 */
	public Date getShipDate() {
		return shipDate;
	}
	/**
	 * 设置：船公司名称
	 */
	public void setShipCompanyName(String shipCompanyName) {
		this.shipCompanyName = shipCompanyName;
	}
	/**
	 * 获取：船公司名称
	 */
	public String getShipCompanyName() {
		return shipCompanyName;
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
	 * 设置：有效期限
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * 获取：有效期限
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}
	/**
	 * 设置：交货日期
	 */
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	/**
	 * 获取：交货日期
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	/**
	 * 设置：装箱方式：0-拼箱，1-整柜，2-拼车？，3-整车？
	 */
	public void setEncasementType(Integer encasementType) {
		this.encasementType = encasementType;
	}
	/**
	 * 获取：装箱方式：0-拼箱，1-整柜，2-拼车？，3-整车？
	 */
	public Integer getEncasementType() {
		return encasementType;
	}
	/**
	 * 设置：20'GP数量
	 */
	public void setTwentyGpNum(Integer twentyGpNum) {
		this.twentyGpNum = twentyGpNum;
	}
	/**
	 * 获取：20'GP数量
	 */
	public Integer getTwentyGpNum() {
		return twentyGpNum;
	}
	/**
	 * 设置：40'GP数量
	 */
	public void setFortyGpNum(Integer fortyGpNum) {
		this.fortyGpNum = fortyGpNum;
	}
	/**
	 * 获取：40'GP数量
	 */
	public Integer getFortyGpNum() {
		return fortyGpNum;
	}
	/**
	 * 设置：40'HQ数量
	 */
	public void setFortyHqNum(Integer fortyHqNum) {
		this.fortyHqNum = fortyHqNum;
	}
	/**
	 * 获取：40'HQ数量
	 */
	public Integer getFortyHqNum() {
		return fortyHqNum;
	}
	/**
	 * 设置：运费支付方式：0-预付，1-到付
	 */
	public void setFreightPayment(Integer freightPayment) {
		this.freightPayment = freightPayment;
	}
	/**
	 * 获取：运费支付方式：0-预付，1-到付
	 */
	public Integer getFreightPayment() {
		return freightPayment;
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
	 * 设置：电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：电话
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 设置：传真
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * 获取：传真
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * 设置：正本提单份数
	 */
	public void setNosOriginalBsl(Integer nosOriginalBsl) {
		this.nosOriginalBsl = nosOriginalBsl;
	}
	/**
	 * 获取：正本提单份数
	 */
	public Integer getNosOriginalBsl() {
		return nosOriginalBsl;
	}
	/**
	 * 设置：副本提单份数
	 */
	public void setNosOriginalBslCopy(Integer nosOriginalBslCopy) {
		this.nosOriginalBslCopy = nosOriginalBslCopy;
	}
	/**
	 * 获取：副本提单份数
	 */
	public Integer getNosOriginalBslCopy() {
		return nosOriginalBslCopy;
	}
	/**
	 * 设置：报关金额
	 */
	public void setCustomsDeclaredValue(Long customsDeclaredValue) {
		this.customsDeclaredValue = customsDeclaredValue;
	}
	/**
	 * 获取：报关金额
	 */
	public Long getCustomsDeclaredValue() {
		return customsDeclaredValue;
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
	 * 设置：注意事项
	 */
	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}
	/**
	 * 获取：注意事项
	 */
	public String getAnnouncement() {
		return announcement;
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
