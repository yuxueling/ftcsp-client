package com.cloudht.ex.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 出口订单服务
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
public class ExOrderServiceDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer exOrderServiceId;
	//出口订单头主键
	private Long exOrderHeaderId;
	//指定船公司
	private String specifyShipCompany;
	//指定货代类型:0-平台指定，1-自己指定
	private Integer appointForwarderType;
	//货代公司
	private String forwarderCompanyName;
	//联系人
	private String contact;
	//手机
	private String phone;
	//传真
	private String fax;
	//公司地址
	private String companyAddress;
	//报关行名称
	private String customsBrokerName;
	//报关行代码
	private String customsBrokerCode;
	//进仓通知书文件ID
	private Long entryNoticeFileId;
	//装箱方式：0-拼箱，1-整柜，2-拼车？，3-整车？
	private Integer encasementType;
	//保险或融资服务(多选“,”分隔):00-信用保险,01-退税融资,02-LC融资,03-其他融资
	private String insuranceFinanceService;
	//总包装数
	private Integer pkgs;
	//总体积
	private Float totalVolume;
	//总毛重
	private Float totalRoughWeight;
	//总净重
	private Float totalNetWeight;
	//总金额
	private Integer totalAmount;
	//换汇成本
	private Integer foreignExgCost;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：ID
	 */
	public void setExOrderServiceId(Integer exOrderServiceId) {
		this.exOrderServiceId = exOrderServiceId;
	}
	/**
	 * 获取：ID
	 */
	public Integer getExOrderServiceId() {
		return exOrderServiceId;
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
	 * 设置：指定船公司
	 */
	public void setSpecifyShipCompany(String specifyShipCompany) {
		this.specifyShipCompany = specifyShipCompany;
	}
	/**
	 * 获取：指定船公司
	 */
	public String getSpecifyShipCompany() {
		return specifyShipCompany;
	}
	/**
	 * 设置：指定货代类型:0-平台指定，1-自己指定
	 */
	public void setAppointForwarderType(Integer appointForwarderType) {
		this.appointForwarderType = appointForwarderType;
	}
	/**
	 * 获取：指定货代类型:0-平台指定，1-自己指定
	 */
	public Integer getAppointForwarderType() {
		return appointForwarderType;
	}
	/**
	 * 设置：货代公司
	 */
	public void setForwarderCompanyName(String forwarderCompanyName) {
		this.forwarderCompanyName = forwarderCompanyName;
	}
	/**
	 * 获取：货代公司
	 */
	public String getForwarderCompanyName() {
		return forwarderCompanyName;
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
	 * 设置：公司地址
	 */
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	/**
	 * 获取：公司地址
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}
	/**
	 * 设置：报关行名称
	 */
	public void setCustomsBrokerName(String customsBrokerName) {
		this.customsBrokerName = customsBrokerName;
	}
	/**
	 * 获取：报关行名称
	 */
	public String getCustomsBrokerName() {
		return customsBrokerName;
	}
	/**
	 * 设置：报关行代码
	 */
	public void setCustomsBrokerCode(String customsBrokerCode) {
		this.customsBrokerCode = customsBrokerCode;
	}
	/**
	 * 获取：报关行代码
	 */
	public String getCustomsBrokerCode() {
		return customsBrokerCode;
	}
	/**
	 * 设置：进仓通知书文件ID
	 */
	public void setEntryNoticeFileId(Long entryNoticeFileId) {
		this.entryNoticeFileId = entryNoticeFileId;
	}
	/**
	 * 获取：进仓通知书文件ID
	 */
	public Long getEntryNoticeFileId() {
		return entryNoticeFileId;
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
	 * 设置：保险或融资服务(多选“,”分隔):00-信用保险,01-退税融资,02-LC融资,03-其他融资
	 */
	public void setInsuranceFinanceService(String insuranceFinanceService) {
		this.insuranceFinanceService = insuranceFinanceService;
	}
	/**
	 * 获取：保险或融资服务(多选“,”分隔):00-信用保险,01-退税融资,02-LC融资,03-其他融资
	 */
	public String getInsuranceFinanceService() {
		return insuranceFinanceService;
	}
	/**
	 * 设置：总包装数
	 */
	public void setPkgs(Integer pkgs) {
		this.pkgs = pkgs;
	}
	/**
	 * 获取：总包装数
	 */
	public Integer getPkgs() {
		return pkgs;
	}
	/**
	 * 设置：总体积
	 */
	public void setTotalVolume(Float totalVolume) {
		this.totalVolume = totalVolume;
	}
	/**
	 * 获取：总体积
	 */
	public Float getTotalVolume() {
		return totalVolume;
	}
	/**
	 * 设置：总毛重
	 */
	public void setTotalRoughWeight(Float totalRoughWeight) {
		this.totalRoughWeight = totalRoughWeight;
	}
	/**
	 * 获取：总毛重
	 */
	public Float getTotalRoughWeight() {
		return totalRoughWeight;
	}
	/**
	 * 设置：总净重
	 */
	public void setTotalNetWeight(Float totalNetWeight) {
		this.totalNetWeight = totalNetWeight;
	}
	/**
	 * 获取：总净重
	 */
	public Float getTotalNetWeight() {
		return totalNetWeight;
	}
	/**
	 * 设置：总金额
	 */
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * 获取：总金额
	 */
	public Integer getTotalAmount() {
		return totalAmount;
	}
	/**
	 * 设置：换汇成本
	 */
	public void setForeignExgCost(Integer foreignExgCost) {
		this.foreignExgCost = foreignExgCost;
	}
	/**
	 * 获取：换汇成本
	 */
	public Integer getForeignExgCost() {
		return foreignExgCost;
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
