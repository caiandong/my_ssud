package myssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import myssm.dao.Dao;
import myssm.user.User;

@Service
public class MyService {
	@Autowired
	private Dao mydao;
	//@Transactional
	public List<User> select() {
		return (List<User>) mydao.selectall();
	}
}
