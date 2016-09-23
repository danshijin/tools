package com.smm.tools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
* @author  zhaoyutao
* @version 2015年12月11日 上午11:30:32
* 跳转到主页
*/

@Controller
public class IndexController {
	@RequestMapping(value="index")
	public ModelAndView index(){
		return new ModelAndView("index");
	}
}
