package com.cognizant.demo.demoapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main application class for spring boot demo
 * 
 * @author mitu
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan("com.cognizant.demo")
public class DemoAppApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoAppApplication.class);
	}

}
