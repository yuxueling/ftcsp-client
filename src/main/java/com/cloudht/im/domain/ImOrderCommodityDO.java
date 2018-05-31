package com.cloudht.im.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 进口订单商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:47:36
 */
public class ImOrderCommodityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long imOrderCommodityId;
	//订单信息
	private Long imOrderBaseId;
	//公司货号
	private String factoryArticleNo;
	//海关编码
	private String customsCode;
	//中文品名
	private String chineseName;
	//英文品名
	private String englishName;
	//唛头信息
	private String shipMarkInfo;
	//规格
	private String specification;
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
	public void setImOrderCommodityId(Long imOrderCommodityId) {
		this.imOrderCommodityId = imOrderCommodityId;
	}
	/**
	 * 获取：主键
	 */
	public Long getImOrderCommodityId() {
		return imOrderCommodityId;
	}
	/**
	 * 设置：订单信息
	 */
	public void setImOrderBaseId(Long imOrderBaseId) {
		this.imOrderBaseId = imOrderBaseId;
	}
	/**
	 * 获取：订单信息
	 */
	public Long getImOrderBaseId() {
		return imOrderBaseId;
	}
	/**
	 * 设置：公司货号
	 */
	public void setFactoryArticleNo(String factoryArticleNo) {
		this.factoryArticleNo = factoryArticleNo;
	}
	/**
	 * 获取：公司货号
	 */
	public String getFactoryArticleNo() {
		return factoryArticleNo;
	}
	/**
	 * 设置：海关编码
	 */
	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}
	/**
	 * 获取：海关编码
	 */
	public String getCustomsCode() {
		return customsCode;
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
	 * 设置：规格
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	/**
	 * 获取：规格
	 */
	public String getSpecification() {
		return specification;
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
