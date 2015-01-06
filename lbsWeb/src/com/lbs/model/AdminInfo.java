package com.lbs.model;

import java.io.Serializable;

/**
 * 管理员信息表
 * 
 * Project: lbsWeb  
 * Class: AdminInfo  
 * Author: <Administrator@>  
 * Date: <2014-9-10 下午3:49:01>  
 * Remark: 
 * @version
 */
public class AdminInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String adminId;
	
	private String password;
	
	private String adminName;
	
	private String email;
	
	private String phone;
	
	private int typer;
	
	private String rights;
	
	private int status;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
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

		return "adminId:"+adminId+"; typer:"+typer+"; rights:"+rights+"; status:"+status;
	}
}
