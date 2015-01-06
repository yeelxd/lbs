package com.lbs.service;

import com.lbs.model.Stu;

/**
 * 学生信息操作的接口
 * 
 * Project: lbsWeb  
 * Class: IStuService  
 * Author: <Administrator@>  
 * Date: <2014-8-28 下午2:50:32>  
 * Remark: 
 * @version
 */
public interface IStuService {

	public Stu findByStuId(String stuId);
	
}
