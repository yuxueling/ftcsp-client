package com.cloudht.im.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 通关跟踪单
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:47:36
 */
public class ImTrackBaseDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long imTrackBaseId;
	//代理合同号
	private String agencyContractNo;
	//委托方
	private Long ftClientId;
	//提单号
	private String billLadingNo;
	//	委托报关报检单位
	private String ecdiCompanyName;
	//联系人
	private String contact;
	//电话
	private String telephone;
	//装箱方式：0-拼箱，1-整柜，2-拼车？，3-整车？
	private Integer encasementType;
	//20'GP数量
	private Integer twentyGpNum;
	//40'GP数量
	private Integer fortyGpNum;
	//40'HQ数量
	private Integer fortyHqNum;
	//贸易方式
	private String tradeWay;
	//结汇方式
	private String settlementWay;
	//运输方式
	private String transportationMode;
	//是否木制包装
	private Integer isWoodPackage;
	//到港日期
	private Date arrivalDate;
	//进口港口
	private String importPort;
	//报关单号
	private String customsDeclarationNo;
	//报关金额
	private Long customsDeclarationAmount;
	//是否入库
	private Integer isStorage;
	//入库日期
	private Date storageDate;
	//是否货权转移
	private String isCargoPropertyTransfer;
	//是否违规
	private Integer isViolation;
	//处罚单位
	private String penaltyDepartment;
	//处罚金额
	private String penaltyAmount;
	//处罚日期
	private Date penaltyDate;
	//备注
	private String remark;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setImTrackBaseId(Long imTrackBaseId) {
		this.imTrackBaseId = imTrackBaseId;
	}
	/**
	 * 获取：主键
	 */
	public Long getImTrackBaseId() {
		return imTrackBaseId;
	}
	/**
	 * 设置：代理合同号
	 */
	public void setAgencyContractNo(String agencyContractNo) {
		this.agencyContractNo = agencyContractNo;
	}
	/**
	 * 获取：代理合同号
	 */
	public String getAgencyContractNo() {
		return agencyContractNo;
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
	 * 设置：提单号
	 */
	public void setBillLadingNo(String billLadingNo) {
		this.billLadingNo = billLadingNo;
	}
	/**
	 * 获取：提单号
	 */
	public String getBillLadingNo() {
		return billLadingNo;
	}
	/**
	 * 设置：	委托报关报检单位
	 */
	public void setEcdiCompanyName(String ecdiCompanyName) {
		this.ecdiCompanyName = ecdiCompanyName;
	}
	/**
	 * 获取：	委托报关报检单位
	 */
	public String getEcdiCompanyName() {
		return ecdiCompanyName;
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
	 * 设置：运输方式
	 */
	public void setTransportationMode(String transportationMode) {
		this.transportationMode = transportationMode;
	}
	/**
	 * 获取：运输方式
	 */
	public String getTransportationMode() {
		return transportationMode;
	}
	/**
	 * 设置：是否木制包装
	 */
	public void setIsWoodPackage(Integer isWoodPackage) {
		this.isWoodPackage = isWoodPackage;
	}
	/**
	 * 获取：是否木制包装
	 */
	public Integer getIsWoodPackage() {
		return isWoodPackage;
	}
	/**
	 * 设置：到港日期
	 */
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	/**
	 * 获取：到港日期
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}
	/**
	 * 设置：进口港口
	 */
	public void setImportPort(String importPort) {
		this.importPort = importPort;
	}
	/**
	 * 获取：进口港口
	 */
	public String getImportPort() {
		return importPort;
	}
	/**
	 * 设置：报关单号
	 */
	public void setCustomsDeclarationNo(String customsDeclarationNo) {
		this.customsDeclarationNo = customsDeclarationNo;
	}
	/**
	 * 获取：报关单号
	 */
	public String getCustomsDeclarationNo() {
		return customsDeclarationNo;
	}
	/**
	 * 设置：报关金额
	 */
	public void setCustomsDeclarationAmount(Long customsDeclarationAmount) {
		this.customsDeclarationAmount = customsDeclarationAmount;
	}
	/**
	 * 获取：报关金额
	 */
	public Long getCustomsDeclarationAmount() {
		return customsDeclarationAmount;
	}
	/**
	 * 设置：是否入库
	 */
	public void setIsStorage(Integer isStorage) {
		this.isStorage = isStorage;
	}
	/**
	 * 获取：是否入库
	 */
	public Integer getIsStorage() {
		return isStorage;
	}
	/**
	 * 设置：入库日期
	 */
	public void setStorageDate(Date storageDate) {
		this.storageDate = storageDate;
	}
	/**
	 * 获取：入库日期
	 */
	public Date getStorageDate() {
		return storageDate;
	}
	/**
	 * 设置：是否货权转移
	 */
	public void setIsCargoPropertyTransfer(String isCargoPropertyTransfer) {
		this.isCargoPropertyTransfer = isCargoPropertyTransfer;
	}
	/**
	 * 获取：是否货权转移
	 */
	public String getIsCargoPropertyTransfer() {
		return isCargoPropertyTransfer;
	}
	/**
	 * 设置：是否违规
	 */
	public void setIsViolation(Integer isViolation) {
		this.isViolation = isViolation;
	}
	/**
	 * 获取：是否违规
	 */
	public Integer getIsViolation() {
		return isViolation;
	}
	/**
	 * 设置：处罚单位
	 */
	public void setPenaltyDepartment(String penaltyDepartment) {
		this.penaltyDepartment = penaltyDepartment;
	}
	/**
	 * 获取：处罚单位
	 */
	public String getPenaltyDepartment() {
		return penaltyDepartment;
	}
	/**
	 * 设置：处罚金额
	 */
	public void setPenaltyAmount(String penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	/**
	 * 获取：处罚金额
	 */
	public String getPenaltyAmount() {
		return penaltyAmount;
	}
	/**
	 * 设置：处罚日期
	 */
	public void setPenaltyDate(Date penaltyDate) {
		this.penaltyDate = penaltyDate;
	}
	/**
	 * 获取：处罚日期
	 */
	public Date getPenaltyDate() {
		return penaltyDate;
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
