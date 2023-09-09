package org.springframework;

import org.springframework.bean.HelloWorldBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.customtag.User;
import org.springframework.event.TestApplicationEvent;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		applicationContext.getBean("helloWorldBean", HelloWorldBean.class).sayMessage();

		User user = (User) applicationContext.getBean("testUser");
		System.out.println("User Name: " + user.getUserName());

		TestApplicationEvent testEvent = new TestApplicationEvent("Test Event");
		applicationContext.publishEvent(testEvent);
	}
}