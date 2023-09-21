package org.springframework.annotation;

import org.springframework.bean.HelloWorldBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigurationClassB {

	@Bean(name = "helloWorldBeanForConfigurationClassB")
	public HelloWorldBean helloWorldBean() {
		HelloWorldBean helloWorldBean = new HelloWorldBean();
		helloWorldBean.setMessage("helloWorldBeanForConfigurationClassB");
		return helloWorldBean;
	}
}
