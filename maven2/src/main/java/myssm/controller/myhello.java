package myssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myssm.service.MyService;
import myssm.user.User;

@RestController
public class myhello {
	@Autowired
	private MyService se;
	@RequestMapping("/hello")
	public String haha() {
		return "hello world";
	}
	@RequestMapping("/selectall")
	public List<User> hasha() {
		return se.select();
	}
}
