package com.atzhizuobiao.store.service;

import java.util.List;

import com.atzhizuobiao.store.domain.PageModel;
import com.atzhizuobiao.store.domain.Product;

public interface ProductService {

	List<Product> findHots()throws Exception;

	List<Product> findNews()throws Exception;

	Product findProductByPid(String pid)throws Exception;

	PageModel findProductsByCidWithPage(String cid, int curNum)throws Exception;

	PageModel findAllProductsWithPage(int curNum)throws Exception;

	void saveProduct(Product product)throws Exception;;

}