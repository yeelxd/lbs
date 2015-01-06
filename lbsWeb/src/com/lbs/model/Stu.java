package com.lbs.model;

import java.io.Serializable;

/**
 * 实体类与数据库表对应
 * 
 * Project: lbsWeb Class: Stu Author: <Administrator@> Date: <2014-8-27
 * 下午3:44:08> Remark:
 * 
 * @version
 */
public class Stu implements Serializable{

	private static final long serialVersionUID = 1L;

	private String stuId;

	private String stuName;

	private int sturAge;

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getSturAge() {
		return sturAge;
	}

	public void setSturAge(int sturAge) {
		this.sturAge = sturAge;
	}

	@Override
	public String toString() {		
		return "stuId:"+stuId+"; stuName:"+stuName+"; sturAge:"+sturAge;
	}
}
