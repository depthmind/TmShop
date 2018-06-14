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
public class AwardCode extends BaseBean<AwardCode> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4244601820819333850L;

	private Integer awardId;
	
	private String awardCode;
	
	private String mobilephone;
	
	private Integer status;
	
	private Date drawTime;
	
	private Date exchangeTime;
	
	private Date createTime;
	
	private Date updateTime;
	
	private Integer isdel;
	
	private Integer maxAwardNumber;

	public Integer getMaxAwardNumber() {
		return maxAwardNumber;
	}

	public void setMaxAwardNumber(Integer maxAwardNumber) {
		this.maxAwardNumber = maxAwardNumber;
	}

	public Integer getAwardId() {
		return awardId;
	}

	public void setAwardId(Integer awardId) {
		this.awardId = awardId;
	}

	public String getAwardCode() {
		return awardCode;
	}

	public void setAwardCode(String awardCode) {
		this.awardCode = awardCode;
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

	public Date getDrawTime() {
		return drawTime;
	}

	public void setDrawTime(Date drawTime) {
		this.drawTime = drawTime;
	}

	public Date getExchangeTime() {
		return exchangeTime;
	}

	public void setExchangeTime(Date exchangeTime) {
		this.exchangeTime = exchangeTime;
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
	
}
