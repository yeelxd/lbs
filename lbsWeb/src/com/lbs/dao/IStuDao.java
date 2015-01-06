package com.lbs.dao;

import com.lbs.model.Stu;

/**
 * 学生信息的数据库操作接口
 * 
 * Project: lbsWeb  
 * Class: IStuDao  
 * Author: <Administrator@>  
 * Date: <2014-8-28 下午2:56:56>  
 * Remark: 
 * @version
 */
public interface IStuDao {

	public Stu findByStuId(String stuId);
	
}
