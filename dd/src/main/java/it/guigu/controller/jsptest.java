package it.guigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jsptest {

	@GetMapping("/jsp")
	String kkk() {
		
		return "11";
	}
	
}