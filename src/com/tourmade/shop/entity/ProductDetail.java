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
public class ProductDetail extends BaseBean<ProductDetail> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8893493790469587718L;
	
	private Integer productId;
	
	private String productCode;
	
	private String productName;
	
	private String productDescription;
	
	private Integer productPrice;
	
	private Integer productStock;
	
	private Date travelDate;
	
	private Date createTime;
	
	private Date updateTime;
	
	private Integer isdel;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
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
	public String toString() {
		return "ProductDetail[productId=" + productId + ",productCode=" + productCode
				+ ",productName=" + productName + ",productDescription=" + productDescription
				+ ",productPrice=" + productPrice + ",productStock=" + productStock
				+ ",travelDate=" + travelDate + ",createTime=" + createTime
				+ ",updateTime=" + updateTime + ",isdel=" + isdel + "]";
	}
}
