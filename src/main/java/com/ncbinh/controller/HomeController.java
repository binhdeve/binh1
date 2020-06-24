package com.ncbinh.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	@ResponseBody
	public String homePage() {
		//ModelAndView mav = new ModelAndView("find2");
		return "Hello to spring MVC";
	}
}
