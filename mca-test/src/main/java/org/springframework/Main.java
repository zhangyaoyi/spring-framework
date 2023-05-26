package org.springframework;

import org.springframework.bean.HelloWorldBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		applicationContext.getBean("helloWorldBean", HelloWorldBean.class).sayMessage();
	}
}