package com.cloudht.ex.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 出口订单基本信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
public class ExOrderBaseDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exOrderBaseId;
	//出口订单头主键
	private Long exOrderHeaderId;
	//贸易国别
	private String tradeCountry;
	//贸易方式
	private String tradeWay;
	//价格条款
	private String priceTerms;
	//运费
	private Integer freight;
	//运抵国
	private String destinationCountry;
	//币别
	private String currency;
	//装运期限
	private Date shipmentDeadline;
	//运输方式
	private String transportMode;
	//起运港
	private String departurePort;
	//转运港
	private String transitPort;
	//目的港
	private String destinationPort;
	//境内货源地
	private String territorySourcePlace;
	//生产厂家
	private String manufactureFactory;
	//联系人
	private String contact;
	//联系电话
	private String contactPhone;
	//结汇方式
	private String settlementWay;
	//信用证号码
	private String creditNo;
	//是否有结汇单证：0-否，1-是
	private Integer isSettleExg;
	//提单
	private Integer billLadingNum;
	//发票
	private Integer invoiceNum;
	//装箱单
	private Integer packingListNum;
	//汇票
	private Integer draftNum;
	//品质证
	private Integer qualityCertificateNum;
	//重量单
	private Integer weightListNum;
	//产地证
	private Integer certificateOriginNum;
	//检疫证
	private Integer certificateQuarantineNum;
	//保险单
	private Integer insurancePolicyNum;
	//其它
	private String others;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExOrderBaseId(Long exOrderBaseId) {
		this.exOrderBaseId = exOrderBaseId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExOrderBaseId() {
		return exOrderBaseId;
	}
	/**
	 * 设置：出口订单头主键
	 */
	public void setExOrderHeaderId(Long exOrderHeaderId) {
		this.exOrderHeaderId = exOrderHeaderId;
	}
	/**
	 * 获取：出口订单头主键
	 */
	public Long getExOrderHeaderId() {
		return exOrderHeaderId;
	}
	/**
	 * 设置：贸易国别
	 */
	public void setTradeCountry(String tradeCountry) {
		this.tradeCountry = tradeCountry;
	}
	/**
	 * 获取：贸易国别
	 */
	public String getTradeCountry() {
		return tradeCountry;
	}
	/**
	 * 设置：贸易方式
	 */
	public void setTradeWay(String tradeWay) {
		this.tradeWay = tradeWay;
	}
	/**
	 * 获取：贸易方式
	 */
	public String getTradeWay() {
		return tradeWay;
	}
	/**
	 * 设置：价格条款
	 */
	public void setPriceTerms(String priceTerms) {
		this.priceTerms = priceTerms;
	}
	/**
	 * 获取：价格条款
	 */
	public String getPriceTerms() {
		return priceTerms;
	}
	/**
	 * 设置：运费
	 */
	public void setFreight(Integer freight) {
		this.freight = freight;
	}
	/**
	 * 获取：运费
	 */
	public Integer getFreight() {
		return freight;
	}
	/**
	 * 设置：运抵国
	 */
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	/**
	 * 获取：运抵国
	 */
	public String getDestinationCountry() {
		return destinationCountry;
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
	 * 设置：装运期限
	 */
	public void setShipmentDeadline(Date shipmentDeadline) {
		this.shipmentDeadline = shipmentDeadline;
	}
	/**
	 * 获取：装运期限
	 */
	public Date getShipmentDeadline() {
		return shipmentDeadline;
	}
	/**
	 * 设置：运输方式
	 */
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	/**
	 * 获取：运输方式
	 */
	public String getTransportMode() {
		return transportMode;
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
	 * 设置：境内货源地
	 */
	public void setTerritorySourcePlace(String territorySourcePlace) {
		this.territorySourcePlace = territorySourcePlace;
	}
	/**
	 * 获取：境内货源地
	 */
	public String getTerritorySourcePlace() {
		return territorySourcePlace;
	}
	/**
	 * 设置：生产厂家
	 */
	public void setManufactureFactory(String manufactureFactory) {
		this.manufactureFactory = manufactureFactory;
	}
	/**
	 * 获取：生产厂家
	 */
	public String getManufactureFactory() {
		return manufactureFactory;
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
	 * 设置：联系电话
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getContactPhone() {
		return contactPhone;
	}
	/**
	 * 设置：结汇方式
	 */
	public void setSettlementWay(String settlementWay) {
		this.settlementWay = settlementWay;
	}
	/**
	 * 获取：结汇方式
	 */
	public String getSettlementWay() {
		return settlementWay;
	}
	/**
	 * 设置：信用证号码
	 */
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	/**
	 * 获取：信用证号码
	 */
	public String getCreditNo() {
		return creditNo;
	}
	/**
	 * 设置：是否有结汇单证：0-否，1-是
	 */
	public void setIsSettleExg(Integer isSettleExg) {
		this.isSettleExg = isSettleExg;
	}
	/**
	 * 获取：是否有结汇单证：0-否，1-是
	 */
	public Integer getIsSettleExg() {
		return isSettleExg;
	}
	/**
	 * 设置：提单
	 */
	public void setBillLadingNum(Integer billLadingNum) {
		this.billLadingNum = billLadingNum;
	}
	/**
	 * 获取：提单
	 */
	public Integer getBillLadingNum() {
		return billLadingNum;
	}
	/**
	 * 设置：发票
	 */
	public void setInvoiceNum(Integer invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	/**
	 * 获取：发票
	 */
	public Integer getInvoiceNum() {
		return invoiceNum;
	}
	/**
	 * 设置：装箱单
	 */
	public void setPackingListNum(Integer packingListNum) {
		this.packingListNum = packingListNum;
	}
	/**
	 * 获取：装箱单
	 */
	public Integer getPackingListNum() {
		return packingListNum;
	}
	/**
	 * 设置：汇票
	 */
	public void setDraftNum(Integer draftNum) {
		this.draftNum = draftNum;
	}
	/**
	 * 获取：汇票
	 */
	public Integer getDraftNum() {
		return draftNum;
	}
	/**
	 * 设置：品质证
	 */
	public void setQualityCertificateNum(Integer qualityCertificateNum) {
		this.qualityCertificateNum = qualityCertificateNum;
	}
	/**
	 * 获取：品质证
	 */
	public Integer getQualityCertificateNum() {
		return qualityCertificateNum;
	}
	/**
	 * 设置：重量单
	 */
	public void setWeightListNum(Integer weightListNum) {
		this.weightListNum = weightListNum;
	}
	/**
	 * 获取：重量单
	 */
	public Integer getWeightListNum() {
		return weightListNum;
	}
	/**
	 * 设置：产地证
	 */
	public void setCertificateOriginNum(Integer certificateOriginNum) {
		this.certificateOriginNum = certificateOriginNum;
	}
	/**
	 * 获取：产地证
	 */
	public Integer getCertificateOriginNum() {
		return certificateOriginNum;
	}
	/**
	 * 设置：检疫证
	 */
	public void setCertificateQuarantineNum(Integer certificateQuarantineNum) {
		this.certificateQuarantineNum = certificateQuarantineNum;
	}
	/**
	 * 获取：检疫证
	 */
	public Integer getCertificateQuarantineNum() {
		return certificateQuarantineNum;
	}
	/**
	 * 设置：保险单
	 */
	public void setInsurancePolicyNum(Integer insurancePolicyNum) {
		this.insurancePolicyNum = insurancePolicyNum;
	}
	/**
	 * 获取：保险单
	 */
	public Integer getInsurancePolicyNum() {
		return insurancePolicyNum;
	}
	/**
	 * 设置：其它
	 */
	public void setOthers(String others) {
		this.others = others;
	}
	/**
	 * 获取：其它
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
