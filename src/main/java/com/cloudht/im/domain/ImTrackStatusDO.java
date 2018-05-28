package com.cloudht.im.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 通关跟踪状态
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 10:53:43
 */
public class ImTrackStatusDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long imTrackStatusId;
	//跟踪单主键
	private Long imTrackBaseId;
	//所处环节
	private String link;
	//环节状态
	private String linkStatus;
	//环节时间
	private Date linkDate;
	//备注
	private String remark;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：主键
	 */
	public void setImTrackStatusId(Long imTrackStatusId) {
		this.imTrackStatusId = imTrackStatusId;
	}
	/**
	 * 获取：主键
	 */
	public Long getImTrackStatusId() {
		return imTrackStatusId;
	}
	/**
	 * 设置：跟踪单主键
	 */
	public void setImTrackBaseId(Long imTrackBaseId) {
		this.imTrackBaseId = imTrackBaseId;
	}
	/**
	 * 获取：跟踪单主键
	 */
	public Long getImTrackBaseId() {
		return imTrackBaseId;
	}
	/**
	 * 设置：所处环节
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * 获取：所处环节
	 */
	public String getLink() {
		return link;
	}
	/**
	 * 设置：环节状态
	 */
	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}
	/**
	 * 获取：环节状态
	 */
	public String getLinkStatus() {
		return linkStatus;
	}
	/**
	 * 设置：环节时间
	 */
	public void setLinkDate(Date linkDate) {
		this.linkDate = linkDate;
	}
	/**
	 * 获取：环节时间
	 */
	public Date getLinkDate() {
		return linkDate;
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
