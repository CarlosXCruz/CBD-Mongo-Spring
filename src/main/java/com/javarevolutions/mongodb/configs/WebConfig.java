package com.javarevolutions.mongodb.configs;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/inicio").setViewName("forward:/index");
		registry.addViewController("/inicio").setViewName("forward:/monitores");
		registry.addViewController("/semillas").setViewName("forward:/semillas");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
	
}
