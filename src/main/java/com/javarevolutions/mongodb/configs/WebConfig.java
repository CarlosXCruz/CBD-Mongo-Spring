package com.javarevolutions.mongodb.configs;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/inicio").setViewName("forward:/index");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
	
}
