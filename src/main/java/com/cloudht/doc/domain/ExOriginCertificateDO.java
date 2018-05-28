package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 产地证信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
public class ExOriginCertificateDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exOriginCertificateId;
	//证书类型
	private String certificateType;
	//证书编号
	private String certificateNo;
	//发票号
	private String invoiceNo;
	//发票日期
	private Date invoiceDate;
	//出口商名称地址
	private String exporterNameAddress;
	//收货人名称地址
	private String consigneeNameAddress;
	//出运日期
	private Date shipDate;
	//起运港
	private String departurePort;
	//转运港
	private String transitPort;
	//目的港
	private String destinationPort;
	//币别
	private String currency;
	//目的国
	private String destinationCountry;
	//价格条款
	private String priceClause;
	//唛头信息
	private String shipMarkInfo;
	//船名航次/特殊条款
	private String vesselVoyageTerms;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExOriginCertificateId(Long exOriginCertificateId) {
		this.exOriginCertificateId = exOriginCertificateId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExOriginCertificateId() {
		return exOriginCertificateId;
	}
	/**
	 * 设置：证书类型
	 */
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	/**
	 * 获取：证书类型
	 */
	public String getCertificateType() {
		return certificateType;
	}
	/**
	 * 设置：证书编号
	 */
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}
	/**
	 * 获取：证书编号
	 */
	public String getCertificateNo() {
		return certificateNo;
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
	 * 设置：发票日期
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	/**
	 * 获取：发票日期
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	/**
	 * 设置：出口商名称地址
	 */
	public void setExporterNameAddress(String exporterNameAddress) {
		this.exporterNameAddress = exporterNameAddress;
	}
	/**
	 * 获取：出口商名称地址
	 */
	public String getExporterNameAddress() {
		return exporterNameAddress;
	}
	/**
	 * 设置：收货人名称地址
	 */
	public void setConsigneeNameAddress(String consigneeNameAddress) {
		this.consigneeNameAddress = consigneeNameAddress;
	}
	/**
	 * 获取：收货人名称地址
	 */
	public String getConsigneeNameAddress() {
		return consigneeNameAddress;
	}
	/**
	 * 设置：出运日期
	 */
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	/**
	 * 获取：出运日期
	 */
	public Date getShipDate() {
		return shipDate;
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
	 * 设置：目的国
	 */
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	/**
	 * 获取：目的国
	 */
	public String getDestinationCountry() {
		return destinationCountry;
	}
	/**
	 * 设置：价格条款
	 */
	public void setPriceClause(String priceClause) {
		this.priceClause = priceClause;
	}
	/**
	 * 获取：价格条款
	 */
	public String getPriceClause() {
		return priceClause;
	}
	/**
	 * 设置：唛头信息
	 */
	public void setShipMarkInfo(String shipMarkInfo) {
		this.shipMarkInfo = shipMarkInfo;
	}
	/**
	 * 获取：唛头信息
	 */
	public String getShipMarkInfo() {
		return shipMarkInfo;
	}
	/**
	 * 设置：船名航次/特殊条款
	 */
	public void setVesselVoyageTerms(String vesselVoyageTerms) {
		this.vesselVoyageTerms = vesselVoyageTerms;
	}
	/**
	 * 获取：船名航次/特殊条款
	 */
	public String getVesselVoyageTerms() {
		return vesselVoyageTerms;
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
