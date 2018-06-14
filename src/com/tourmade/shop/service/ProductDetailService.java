/**
 * 
 */
package com.tourmade.shop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourmade.shop.common.framework.BaseService;
import com.tourmade.shop.entity.ProductDetail;
import com.tourmade.shop.mapper.productDetail.ProductDetailMapper;

/**
 * @author zyy
 *
 */
@Service
@Transactional(readOnly = false)
public class ProductDetailService extends BaseService {

	@Autowired
	private ProductDetailMapper mapper;
	
	/**
	 * 
	 * @date 2018年6月14日 下午5:04:46
	 * @author liuhan
	 * @todo 查询所有商品
	 */
	public List<ProductDetail> getProductDetail(){
		List<ProductDetail> result = new ArrayList<ProductDetail>();
		try {
			result = mapper.selectProductDetail();
		} catch (Exception e) {
			logger.error("-----查询所有商品失败-----" + "\n" + "-----ProductDetailService.getProductDetail-----"
					+ "\n" + "-----" + e.getMessage() + "-----");
		}
		return result;
	}
}
