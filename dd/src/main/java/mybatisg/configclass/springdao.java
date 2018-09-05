package mybatisg.configclass;

import java.sql.Driver;

import org.apache.commons.dbcp2.BasicDataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.guigu.server.myServer;
import mybatisg.model.Employee;

@Configuration
@ImportResource("classpath:/content.xml")
public class springdao {
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	
	
	@Bean
	BasicDataSource datasource() {
		BasicDataSource a = new BasicDataSource();
		a.setDriverClassName(driver);
		a.setUrl(url);
		a.setUsername(username);
		a.setPassword(password);
		return a;		
	}
	@Bean
	BasicDataSource datasource1() {
		return  new BasicDataSource() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString()+"派生类";
			}

			{
				setDriverClassName(driver);
				setUrl(url);
				setUsername(username);
				setPassword(password);
			}						
		};
	}
	@Bean
	SqlSessionFactoryBean sqlSessionFactory() {
		return new SqlSessionFactoryBean(){
			{
				setDataSource(datasource1());
				//setConfigLocation(new re"classpath:mybatis/mybatis_config.xml");
			}
	};
	}
	@Override
	public String toString() {
		return "springdao [driver=" + driver + ", url=" + url + ", user=" + username + ", password=" + password + "]";
	}
//	@Test
//	public void tt() {
//		ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring/content.xml");
//		myServer mm=(myServer) co.getBean("myServer");
//		for(Employee m:mm.select())
//			System.out.println(m);
//			
//	}
}
