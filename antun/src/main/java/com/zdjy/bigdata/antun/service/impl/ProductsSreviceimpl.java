package com.zdjy.bigdata.antun.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdjy.bigdata.antun.dao.ProductsMapper;
import com.zdjy.bigdata.antun.entity.Products;
import com.zdjy.bigdata.antun.entity.ProductsExample;
import com.zdjy.bigdata.antun.entity.ProductsExample.Criteria;
import com.zdjy.bigdata.antun.service.ProductsSrevice;
@Service
public class ProductsSreviceimpl implements ProductsSrevice{
	@Autowired
	private ProductsMapper productsMapper;
	@Override
	public boolean isValidProduct(String id) {
		if(StringUtils.isBlank(id))
			return false;
			//select * from products where id = id and status1=1;
			ProductsExample example = new ProductsExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andIdEqualTo(id);
			createCriteria.andStatus1EqualTo(1);
			List<Products> selectByExample = productsMapper.selectByExample(example);
			if(selectByExample.size()>0)
				return true;
		return false;
	}

	
}
