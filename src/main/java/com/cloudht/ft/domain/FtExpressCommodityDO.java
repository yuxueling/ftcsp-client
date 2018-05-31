package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 快件商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:04:18
 */
public class FtExpressCommodityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long ftExpressCommodityId;
	//快件信息ID
	private Long ftExpressBaseId;
	//中文品名
	private String chineseName;
	//英文品名
	private String englishName;
	//数量
	private Integer quantity;
	//数量单位
	private String quantityUnit;
	//单价
	private Integer unitPrice;
	//金额
	private Long amount;
	//备注
	private String remark;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setFtExpressCommodityId(Long ftExpressCommodityId) {
		this.ftExpressCommodityId = ftExpressCommodityId;
	}
	/**
	 * 获取：主键
	 */
	public Long getFtExpressCommodityId() {
		return ftExpressCommodityId;
	}
	/**
	 * 设置：快件信息ID
	 */
	public void setFtExpressBaseId(Long ftExpressBaseId) {
		this.ftExpressBaseId = ftExpressBaseId;
	}
	/**
	 * 获取：快件信息ID
	 */
	public Long getFtExpressBaseId() {
		return ftExpressBaseId;
	}
	/**
	 * 设置：中文品名
	 */
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	/**
	 * 获取：中文品名
	 */
	public String getChineseName() {
		return chineseName;
	}
	/**
	 * 设置：英文品名
	 */
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	/**
	 * 获取：英文品名
	 */
	public String getEnglishName() {
		return englishName;
	}
	/**
	 * 设置：数量
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * 获取：数量
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * 设置：数量单位
	 */
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	/**
	 * 获取：数量单位
	 */
	public String getQuantityUnit() {
		return quantityUnit;
	}
	/**
	 * 设置：单价
	 */
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * 获取：单价
	 */
	public Integer getUnitPrice() {
		return unitPrice;
	}
	/**
	 * 设置：金额
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	/**
	 * 获取：金额
	 */
	public Long getAmount() {
		return amount;
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
