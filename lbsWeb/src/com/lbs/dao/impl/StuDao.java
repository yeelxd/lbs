package com.lbs.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lbs.dao.IStuDao;
import com.lbs.mapper.StuMapper;
import com.lbs.model.Stu;

/**
 * 学生信息的数据库操作接口实现
 * 
 * Project: lbsWeb  
 * Class: StuDao  
 * Author: <Administrator@>  
 * Date: <2014-8-28 下午2:57:14>  
 * Remark: 
 * @version
 */
@Repository("stuDao")
public class StuDao implements IStuDao {
	
	@Autowired
	private StuMapper stuMapper;

	public Stu findByStuId(String stuId) {
		Stu stu=stuMapper.findByStuId(stuId);
		return stu;
	}

}
