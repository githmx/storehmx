package com.atzhizuobiao.store.service.serviceImp;

import java.util.List;

import com.atzhizuobiao.store.dao.CategoryDao;
import com.atzhizuobiao.store.dao.daoImp.CategoryDaoImp;
import com.atzhizuobiao.store.domain.Category;
import com.atzhizuobiao.store.service.CategoryService;
import com.atzhizuobiao.store.utils.BeanFactory;
import com.atzhizuobiao.store.utils.JedisUtils;
import redis.clients.jedis.Jedis;

public class CategoryServiceImp implements CategoryService {

	CategoryDao CategoryDao=(CategoryDao)BeanFactory.createObject("CategoryDao");
	
	
	@Override
	public List<Category> getAllCats() throws Exception {
		return CategoryDao.getAllCats();
	}

	@Override
	public void addCategory(Category c) throws Exception {
		//本质是向MYSQL插入一条数据
		CategoryDao.addCategory(c);
		//更新redis缓存
		Jedis jedis = JedisUtils.getJedis();
		jedis.del("allCats");
		JedisUtils.closeJedis(jedis);
	}

}

