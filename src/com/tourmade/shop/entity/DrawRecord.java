/**
 * 
 */
package com.tourmade.shop.entity;

import java.sql.Date;

import com.tourmade.shop.common.framework.BaseBean;

/**
 * @author zyy
 *
 */
public class DrawRecord extends BaseBean<DrawRecord> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -947037489210798916L;

	private Integer recordId;
	
	private String mobilephone;
	
	private Integer status;
	
	private Date createTime;
	
	private Date updateTime;
	
	private Integer isdel;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}
	
	@Override
	public String toString () {
		return "[" + "recordId=" + recordId + ",mobilephone=" + mobilephone + ",status=" + status + ",createTime=" + createTime
				+ ",updateTime=" + updateTime + ",isdel=" + isdel
				+ "]";
	}
}
