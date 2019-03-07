package com.atzhizuobiao.store.service;

import java.util.List;

import com.atzhizuobiao.store.domain.Category;

public interface CategoryService {

	List<Category> getAllCats()throws Exception;

	void addCategory(Category c)throws Exception;

}
