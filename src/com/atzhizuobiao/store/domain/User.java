package com.atzhizuobiao.store.domain;

import java.util.Date;

public class User {
	private String uid;// 用户编号
	private String username;// 用户账户
	private String password;//用户密码
	private String name;//用户昵称
	private String email;// 用户邮箱
	private String telephone;//用户电话
	private Date birthday;//用户生日
	private String Sex;//用户性别
	private int State;//用户状态   1:激活   0:未激活
	private String code;//激活码
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date bitrhday) {
		this.birthday = bitrhday;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public User(String uid, String username, String password, String name, String email, String telephone,
			Date bitrhday, String sex, int state, String code) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.birthday = bitrhday;
		Sex = sex;
		State = state;
		this.code = code;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", name=" + name + ", email="
				+ email + ", telephone=" + telephone + ", birthday=" + birthday + ", Sex=" + Sex + ", State=" + State
				+ ", code=" + code + "]";
	}

	
}
