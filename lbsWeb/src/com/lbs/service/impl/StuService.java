package com.lbs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.dao.IStuDao;
import com.lbs.model.Stu;
import com.lbs.service.IStuService;

/**
 * 学生信息操作的接口实现
 * 
 * Project: lbsWeb  
 * Class: StuService  
 * Author: <Administrator@>  
 * Date: <2014-8-28 下午2:50:52>  
 * Remark: 
 * @version
 */
@Service("stuService")
public class StuService implements IStuService {

	@Autowired
	private IStuDao stuDao;
	
	public Stu findByStuId(String stuId) {
		Stu stu=stuDao.findByStuId(stuId);
		return stu;
	}

}
