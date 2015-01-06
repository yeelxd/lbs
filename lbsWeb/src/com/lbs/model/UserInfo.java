package com.lbs.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表
 * 
 * Project: lbsWeb  
 * Class: UserInfo  
 * Author: <Administrator@>  
 * Date: <2014-9-10 下午4:56:51>  
 * Remark: 
 * @version
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	
	private String password;
	
	private String userName;
	
	private int sex;
	
	private int age;
	
	private String email;
	
	private String phone;
	
	private Date regTime;
	
	private String imgUrl;
	
	private int typer;
	
	private String rights;
	
	private int status;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getTyper() {
		return typer;
	}

	public void setTyper(int typer) {
		this.typer = typer;
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {

		return "userId:"+userId+"; typer:"+typer+"; rights:"+rights+"; status:"+status;
	}
	
}
