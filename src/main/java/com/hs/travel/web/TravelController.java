package com.hs.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TravelController {
	
	@RequestMapping("/")
	public String list() {
		return "travel/main";
	}

}