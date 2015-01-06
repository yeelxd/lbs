package com.lbs.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 短消息信息表
 * 
 * Project: lbsWeb  
 * Class: MessageInfo  
 * Author: <Administrator@>  
 * Date: <2014-9-10 下午4:53:48>  
 * Remark: 
 * @version
 */
public class MessageInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fromer;
	
	private String toer;
	
	private Date sendTime;
	
	private String title;
	
	private String content;
	
	private int status;

	public String getFromer() {
		return fromer;
	}

	public void setFromer(String fromer) {
		this.fromer = fromer;
	}

	public String getToer() {
		return toer;
	}

	public void setToer(String toer) {
		this.toer = toer;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {

		return "fromer"+fromer+"; toer:"+toer+"; title:"+title;
	}
}
