package config;




import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import myssm.aspect.myaspect;
import myssm.user.User;

@EnableAspectJAutoProxy //开启aop功能
@PropertySource(value = { "classpath:db.properties" }) //加载配置文件
@EnableTransactionManagement //启动事务管理
@Configuration 
@ComponentScan(value="myssm",excludeFilters= {
		@Filter(type=FilterType.ANNOTATION,value= {Controller.class})})
public class ContextRootConfig {
	@Bean
	public myaspect aspec() {
		return new myaspect();
	}
	@Bean
	public DataSource datasource(@Value("${jdbc.username}")String name,
			@Value("${jdbc.password}")String passwrod,
			@Value("${jdbc.url}")String url,
			@Value("${jdbc.driver}")String driver) {
		 DriverManagerDataSource data = new DriverManagerDataSource();
		data.setUsername(name);
		data.setPassword(passwrod);
		data.setUrl(url);
		data.setDriverClassName(driver);
		return data;
	}
	@Bean
	public JdbcTemplate template(@Autowired DataSource data) {
		return new JdbcTemplate(data);
	}
	@Bean
	public PlatformTransactionManager transaction(@Autowired DataSource data) {
		return new DataSourceTransactionManager(data);
	}
	
}
