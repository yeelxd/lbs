package com.lbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lbs.model.Stu;
import com.lbs.service.IStuService;

/**
 * 学生信息操作的调用处理
 * 
 * Project: lbsWeb  
 * Class: StuController  
 * Author: <Administrator@>  
 * Date: <2014-8-28 下午2:54:29>  
 * Remark: 
 * @version
 */
@Controller
@RequestMapping("/stu")
public class StuController {

	//加载Log日志
	private Logger log=LoggerFactory.getLogger(getClass());
	
	@Autowired
	private IStuService stuService;
	
	@ResponseBody
	@RequestMapping(value="{stuId}", method=RequestMethod.GET)
	public ModelAndView findByStuId(@PathVariable String stuId){
		Stu stu=null;
		try {
			stu =stuService.findByStuId(stuId);
			log.info("Stu:"+stu);
		} catch (Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("stu", stu);
		mav.setViewName("stuInfo");
		return mav;
	}
}
