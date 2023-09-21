package org.springframework.annotation;

import org.springframework.bean.HelloWorldBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigurationClassA {

	@Bean(name = "helloWorldBeanForConfigurationClassA")
	public HelloWorldBean helloWorldBean() {
		HelloWorldBean helloWorldBean = new HelloWorldBean();
		helloWorldBean.setMessage("helloWorldBeanForConfigurationClassA");
		return helloWorldBean;
	}
}
