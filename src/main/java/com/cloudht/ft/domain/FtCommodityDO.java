package com.cloudht.ft.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public class FtCommodityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer ftCommodityId;
	//委托方
	private Long ftClientId;
	//公司货号
	private String factoryArticleNo;
	//海关编码
	private String customsCode;
	//中文品名
	private String chineseName;
	//英文品名
	private String englishName;
	//包装尺寸-长mm
	private Integer packSizeLength;
	//包装尺寸-宽mm
	private Integer packSizeWidth;
	//包装尺寸-高mm
	private Integer packSizeHeight;
	//退税率%
	private Float taxRefundRate;
	//包装数量
	private Integer pkgs;
	//包装数量单位
	private String pkgsUnit;
	//唛头信息
	private String shipMarkInfo;
	//申报要素
	private String declareElement;
	//备注
	private String remark;

	/**
	 * 设置：主键
	 */
	public void setFtCommodityId(Integer ftCommodityId) {
		this.ftCommodityId = ftCommodityId;
	}
	/**
	 * 获取：主键
	 */
	public Integer getFtCommodityId() {
		return ftCommodityId;
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
	 * 设置：包装尺寸-长mm
	 */
	public void setPackSizeLength(Integer packSizeLength) {
		this.packSizeLength = packSizeLength;
	}
	/**
	 * 获取：包装尺寸-长mm
	 */
	public Integer getPackSizeLength() {
		return packSizeLength;
	}
	/**
	 * 设置：包装尺寸-宽mm
	 */
	public void setPackSizeWidth(Integer packSizeWidth) {
		this.packSizeWidth = packSizeWidth;
	}
	/**
	 * 获取：包装尺寸-宽mm
	 */
	public Integer getPackSizeWidth() {
		return packSizeWidth;
	}
	/**
	 * 设置：包装尺寸-高mm
	 */
	public void setPackSizeHeight(Integer packSizeHeight) {
		this.packSizeHeight = packSizeHeight;
	}
	/**
	 * 获取：包装尺寸-高mm
	 */
	public Integer getPackSizeHeight() {
		return packSizeHeight;
	}
	/**
	 * 设置：退税率%
	 */
	public void setTaxRefundRate(Float taxRefundRate) {
		this.taxRefundRate = taxRefundRate;
	}
	/**
	 * 获取：退税率%
	 */
	public Float getTaxRefundRate() {
		return taxRefundRate;
	}
	/**
	 * 设置：包装数量
	 */
	public void setPkgs(Integer pkgs) {
		this.pkgs = pkgs;
	}
	/**
	 * 获取：包装数量
	 */
	public Integer getPkgs() {
		return pkgs;
	}
	/**
	 * 设置：包装数量单位
	 */
	public void setPkgsUnit(String pkgsUnit) {
		this.pkgsUnit = pkgsUnit;
	}
	/**
	 * 获取：包装数量单位
	 */
	public String getPkgsUnit() {
		return pkgsUnit;
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
	 * 设置：申报要素
	 */
	public void setDeclareElement(String declareElement) {
		this.declareElement = declareElement;
	}
	/**
	 * 获取：申报要素
	 */
	public String getDeclareElement() {
		return declareElement;
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
}
