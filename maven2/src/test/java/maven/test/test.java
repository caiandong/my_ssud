package maven.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ContextRootConfig;
import myssm.user.User;

public class test {
	@SuppressWarnings("resource")
	@Test
public void aa() {
	AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(myuser.class);
	User mm=con.getBean(User.class);
	System.out.println(mm);
	}
}
