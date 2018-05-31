package com.cloudht.ex.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 出口文件
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-31 11:12:11
 */
public class ExFileDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long exFileId;
	//委托方
	private Long ftClientId;
	//发票号码
	private String invoiceNo;
	//文件类型
	private String fileType;
	//创建人ID
	private String createBy;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;
	//文件路径
	private String filePath;

	/**
	 * 设置：主键
	 */
	public void setExFileId(Long exFileId) {
		this.exFileId = exFileId;
	}
	/**
	 * 获取：主键
	 */
	public Long getExFileId() {
		return exFileId;
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
	 * 设置：文件类型
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	/**
	 * 获取：文件类型
	 */
	public String getFileType() {
		return fileType;
	}
	/**
	 * 设置：创建人ID
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建人ID
	 */
	public String getCreateBy() {
		return createBy;
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
	/**
	 * 设置：文件路径
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	/**
	 * 获取：文件路径
	 */
	public String getFilePath() {
		return filePath;
	}
}
