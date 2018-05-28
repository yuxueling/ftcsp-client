package com.cloudht.fi.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 汇率发布
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-23 23:00:36
 */
public class ReleaseRateDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer fiReleaseRateId;
	//发布日期
	private Date releaseDate;
	//折算价
	private Integer exchangeConversion;
	//现汇买入价
	private Integer buyingPrice;
	//现汇卖出价
	private Integer sellingPrice;
	//融资参考汇率
	private Integer financeReferenceRate;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setFiReleaseRateId(Integer fiReleaseRateId) {
		this.fiReleaseRateId = fiReleaseRateId;
	}
	/**
	 * 获取：主键
	 */
	public Integer getFiReleaseRateId() {
		return fiReleaseRateId;
	}
	/**
	 * 设置：发布日期
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * 设置：折算价
	 */
	public void setExchangeConversion(Integer exchangeConversion) {
		this.exchangeConversion = exchangeConversion;
	}
	/**
	 * 获取：折算价
	 */
	public Integer getExchangeConversion() {
		return exchangeConversion;
	}
	/**
	 * 设置：现汇买入价
	 */
	public void setBuyingPrice(Integer buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	/**
	 * 获取：现汇买入价
	 */
	public Integer getBuyingPrice() {
		return buyingPrice;
	}
	/**
	 * 设置：现汇卖出价
	 */
	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	/**
	 * 获取：现汇卖出价
	 */
	public Integer getSellingPrice() {
		return sellingPrice;
	}
	/**
	 * 设置：融资参考汇率
	 */
	public void setFinanceReferenceRate(Integer financeReferenceRate) {
		this.financeReferenceRate = financeReferenceRate;
	}
	/**
	 * 获取：融资参考汇率
	 */
	public Integer getFinanceReferenceRate() {
		return financeReferenceRate;
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
