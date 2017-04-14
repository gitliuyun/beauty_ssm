package com.yingjun.ssm.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value = "/setProgress", method = RequestMethod.POST)
	@ResponseBody
	public String setProgress(HttpSession session) throws InterruptedException{
		int total = 100;
		for (int i = 0; i < total; i ++) {
			session.setAttribute("dealProgress", i * 1.0 / total);
			Thread.sleep(100);
		}
		return "OK";
	}
	
	@RequestMapping(value = "/getProgress", method = RequestMethod.POST)
	@ResponseBody
	public Double getProgress(HttpSession session) {
		Double progress =  (Double) session.getAttribute("dealProgress");
		return progress;
	}

}
