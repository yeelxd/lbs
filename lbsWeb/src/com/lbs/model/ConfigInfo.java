package com.lbs.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 配置信息表
 * 
 * Project: lbsWeb  
 * Class: ConfigInfo  
 * Author: <Administrator@>  
 * Date: <2014-9-10 下午4:50:56>  
 * Remark: 
 * @version
 */
public class ConfigInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String keyer;
	
	private String valuer;
	
	private Date addTime;
	
	private String remark;
	
	private int status;

	public String getKeyer() {
		return keyer;
	}

	public void setKeyer(String keyer) {
		this.keyer = keyer;
	}

	public String getValuer() {
		return valuer;
	}

	public void setValuer(String valuer) {
		this.valuer = valuer;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {

		return "keyer:"+keyer+"; status:"+status;
	}
}
