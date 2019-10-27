package com.nit.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.nit.user")
public class AppConfig {

	@Bean
	public InternalResourceViewResolver view() {
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/views/");
		irvr.setSuffix(".jsp");

		return irvr;
	}
	
}
