package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan(basePackages= {"myssm"},useDefaultFilters=false,
	includeFilters= {@Filter(type=FilterType.ANNOTATION,classes= {Controller.class})}
		)
@EnableWebMvc
@Configuration
public class ContextWebMvcConfig implements WebMvcConfigurer{
	//配置默认servlet处理映射
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	//配置视图解析器
		@Override
		public void configureViewResolvers(ViewResolverRegistry registry) {
			registry.jsp();
		}
		
}
