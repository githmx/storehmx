package com.atzhizuobiao.store.service;

import java.sql.SQLException;

import com.atzhizuobiao.store.domain.User;

public interface UserService {

	void userRegist(User user)throws SQLException ;

	boolean userActive(String code)throws SQLException ;

	User userLogin(User user)throws SQLException;

}
