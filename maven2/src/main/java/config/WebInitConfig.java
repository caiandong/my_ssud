package config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class<?>[] {ContextRootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {ContextWebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"/"};
	}
	@Override
	protected Filter[] getServletFilters() {
		//可以发送delete和put请求
		 HiddenHttpMethodFilter hidden = new HiddenHttpMethodFilter();
		 //让tomcat封装put请求体内数据（默认情况下不封装put数据到map中）
		 HttpPutFormContentFilter putfilter=new HttpPutFormContentFilter();
		 //编码过滤器
		 CharacterEncodingFilter encode=new CharacterEncodingFilter("utf-8",true,true);	 
		 //这些过滤器默认情况下自动映射到dispatchservlet路径上
		return new Filter[] {hidden,putfilter,encode};
	}
}
