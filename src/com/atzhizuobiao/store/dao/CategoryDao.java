package com.atzhizuobiao.store.dao;

import java.util.List;

import com.atzhizuobiao.store.domain.Category;

public interface CategoryDao {

	List<Category> getAllCats() throws Exception;

	void addCategory(Category c) throws Exception;

}
