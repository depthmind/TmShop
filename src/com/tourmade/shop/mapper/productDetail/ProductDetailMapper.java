package com.tourmade.shop.mapper.productDetail;

import java.util.List;

import com.tourmade.shop.common.framework.BaseMapper;
import com.tourmade.shop.entity.ProductDetail;

public interface ProductDetailMapper extends BaseMapper {
	List<ProductDetail> selectProductDetail();
}