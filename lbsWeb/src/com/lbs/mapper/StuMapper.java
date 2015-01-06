package com.lbs.mapper;

import org.springframework.dao.DataAccessException;

import com.lbs.model.Stu;

/**
 * 数据关系映射类
 * 
 * Project: lbsWeb  
 * Class: StuMapper  
 * Author: <Administrator@>  
 * Date: <2014-8-27 下午3:49:32>  
 * Remark: 
 * @version
 */
public interface StuMapper {

	/**
	 * 根据UserId查询学生信息
	 * @param stuId
	 * @return
	 * @throws DataAccessException
	 */
	public Stu findByStuId(String stuId) throws DataAccessException;
	
}
