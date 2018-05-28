package com.cloudht.doc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 托单商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
public class ExShipOrderCommodityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exShipOrderCommodityId;
	//托单主键
	private Long exShipOrderId;
	//唛头信息
	private String shipMarkInfo;
	//中文品名
	private String chineseName;
	//英文品名
	private String englishName;
	//包装数量
	private Integer pkgs;
	//包装数量单位
	private String pkgsUnit;
	//总数量
	private Integer totalQuantity;
	//总数量单位
	private String totalQuantityUnit;
	//包装尺寸-长mm
	private Integer packSizeLength;
	//包装尺寸-宽mm
	private Integer packSizeWidth;
	//包装尺寸-高mm
	private Integer packSizeHeight;
	//总体积m*m*m
	private Float totalVolume;
	//单位毛重kg
	private Float unitRoughWeight;
	//总毛重kg
	private Float totalRoughWeight;
	//单位净重kg
	private Float unitNetWeight;
	//总净重kg
	private Float totalNetWeight;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setExShipOrderCommodityId(Long exShipOrderCommodityId) {
		this.exShipOrderCommodityId = exShipOrderCommodityId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExShipOrderCommodityId() {
		return exShipOrderCommodityId;
	}
	/**
	 * 设置：托单主键
	 */
	public void setExShipOrderId(Long exShipOrderId) {
		this.exShipOrderId = exShipOrderId;
	}
	/**
	 * 获取：托单主键
	 */
	public Long getExShipOrderId() {
		return exShipOrderId;
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
	 * 设置：总数量
	 */
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	/**
	 * 获取：总数量
	 */
	public Integer getTotalQuantity() {
		return totalQuantity;
	}
	/**
	 * 设置：总数量单位
	 */
	public void setTotalQuantityUnit(String totalQuantityUnit) {
		this.totalQuantityUnit = totalQuantityUnit;
	}
	/**
	 * 获取：总数量单位
	 */
	public String getTotalQuantityUnit() {
		return totalQuantityUnit;
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
	 * 设置：总体积m*m*m
	 */
	public void setTotalVolume(Float totalVolume) {
		this.totalVolume = totalVolume;
	}
	/**
	 * 获取：总体积m*m*m
	 */
	public Float getTotalVolume() {
		return totalVolume;
	}
	/**
	 * 设置：单位毛重kg
	 */
	public void setUnitRoughWeight(Float unitRoughWeight) {
		this.unitRoughWeight = unitRoughWeight;
	}
	/**
	 * 获取：单位毛重kg
	 */
	public Float getUnitRoughWeight() {
		return unitRoughWeight;
	}
	/**
	 * 设置：总毛重kg
	 */
	public void setTotalRoughWeight(Float totalRoughWeight) {
		this.totalRoughWeight = totalRoughWeight;
	}
	/**
	 * 获取：总毛重kg
	 */
	public Float getTotalRoughWeight() {
		return totalRoughWeight;
	}
	/**
	 * 设置：单位净重kg
	 */
	public void setUnitNetWeight(Float unitNetWeight) {
		this.unitNetWeight = unitNetWeight;
	}
	/**
	 * 获取：单位净重kg
	 */
	public Float getUnitNetWeight() {
		return unitNetWeight;
	}
	/**
	 * 设置：总净重kg
	 */
	public void setTotalNetWeight(Float totalNetWeight) {
		this.totalNetWeight = totalNetWeight;
	}
	/**
	 * 获取：总净重kg
	 */
	public Float getTotalNetWeight() {
		return totalNetWeight;
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
