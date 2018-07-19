package mybatis;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybatisg.dao.EmployeeMapper;
import mybatisg.model.Employee;

public class dasd {
	@Test
	public void saas() {
		ClassPathXmlApplicationContext co=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		EmployeeMapper emp=co.getBean(EmployeeMapper.class);
		
		emp.insertSelective(new Employee(null, "daddAsdasd 撒旦", "M", "addsad",2,null));
		
	}
}
