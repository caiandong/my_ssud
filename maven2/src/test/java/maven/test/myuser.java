package maven.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import myssm.user.User;

@Configuration
public class myuser {
	@Bean 
	public User user() {
		return new User();
	}
}
