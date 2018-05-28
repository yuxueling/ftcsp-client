package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 查验商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 16:41:47
 */
public class FtInspectionCommodityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer ftInspectionCommodityId;
	//委托方
	private Long ftClientId;
	//发票号码
	private String invoiceNo;
	//查验日期
	private Date inspectionDate;
	//品名
	private String commodityName;
	//原HS编码
	private String originalHscode;
	//查验后HS编码
	private String afterHscode;
	//查验结果
	private String inspectionResult;
	//处罚结果
	private String punishmentResult;
	//备注
	private String remark;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setFtInspectionCommodityId(Integer ftInspectionCommodityId) {
		this.ftInspectionCommodityId = ftInspectionCommodityId;
	}
	/**
	 * 获取：主键
	 */
	public Integer getFtInspectionCommodityId() {
		return ftInspectionCommodityId;
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
	 * 设置：发票号码
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	/**
	 * 获取：发票号码
	 */
	public String getInvoiceNo() {
		return invoiceNo;
	}
	/**
	 * 设置：查验日期
	 */
	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	/**
	 * 获取：查验日期
	 */
	public Date getInspectionDate() {
		return inspectionDate;
	}
	/**
	 * 设置：品名
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	/**
	 * 获取：品名
	 */
	public String getCommodityName() {
		return commodityName;
	}
	/**
	 * 设置：原HS编码
	 */
	public void setOriginalHscode(String originalHscode) {
		this.originalHscode = originalHscode;
	}
	/**
	 * 获取：原HS编码
	 */
	public String getOriginalHscode() {
		return originalHscode;
	}
	/**
	 * 设置：查验后HS编码
	 */
	public void setAfterHscode(String afterHscode) {
		this.afterHscode = afterHscode;
	}
	/**
	 * 获取：查验后HS编码
	 */
	public String getAfterHscode() {
		return afterHscode;
	}
	/**
	 * 设置：查验结果
	 */
	public void setInspectionResult(String inspectionResult) {
		this.inspectionResult = inspectionResult;
	}
	/**
	 * 获取：查验结果
	 */
	public String getInspectionResult() {
		return inspectionResult;
	}
	/**
	 * 设置：处罚结果
	 */
	public void setPunishmentResult(String punishmentResult) {
		this.punishmentResult = punishmentResult;
	}
	/**
	 * 获取：处罚结果
	 */
	public String getPunishmentResult() {
		return punishmentResult;
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
