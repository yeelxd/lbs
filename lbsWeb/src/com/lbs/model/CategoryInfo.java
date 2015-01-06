package com.lbs.model;

import java.io.Serializable;

/**
 * 文章分类信息表
 * 
 * Project: lbsWeb  
 * Class: CategoryInfo  
 * Author: <Administrator@>  
 * Date: <2014-9-10 下午4:47:35>  
 * Remark: 
 * @version
 */
public class CategoryInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int categoryId;
	
	private String categoryName;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {

		return "categoryId:"+categoryId+"; categoryName:"+categoryName;
	}
}
