package com.lbs.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章信息表
 * 
 * Project: lbsWeb  
 * Class: ArticleInfo  
 * Author: <Administrator@>  
 * Date: <2014-9-10 下午4:30:05>  
 * Remark: 
 * @version
 */
public class ArticleInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String aId;
	
	private String author;
	
	private String categoryId;
	
	private String title;
	
	private Date addTime;
	
	private String content;
	
	private int makeTop;
	
	private int status;

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getMakeTop() {
		return makeTop;
	}

	public void setMakeTop(int makeTop) {
		this.makeTop = makeTop;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {

		return "aId:"+aId+"; author:"+author+"; categoryId:"+categoryId+"; title:"+title;
	}
	
}
