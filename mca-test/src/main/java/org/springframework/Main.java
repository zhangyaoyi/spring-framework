package org.springframework;

import org.springframework.aware.Test;
import org.springframework.aware.TestApp;
import org.springframework.bean.HelloWorldBean;
import org.springframework.annotation.TestAnnotationBean;
import org.springframework.bean.PrototypeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;
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

		Test test = ((TestApp) applicationContext.getBean("testApp")).getTest();
		System.out.println("TestAware Name: " + test.getName());

		String name = applicationContext.getBean("testAnnotationBean", TestAnnotationBean.class).getName();
		System.out.println("TestAnnotationBean Name: " + name);

		applicationContext.getBean("helloWorldBeanForConfigurationClassA", HelloWorldBean.class).sayMessage();
		applicationContext.getBean("helloWorldBeanForConfigurationClassB", HelloWorldBean.class).sayMessage();


		ConversionService conversionService = (ConversionService) applicationContext.getBean("conversionService");
		String temp = conversionService.convert(8888888, String.class);
		System.out.println("conversionService: " + temp);


		System.out.println(applicationContext.getBean("prototypeBean", PrototypeBean.class));
		System.out.println(applicationContext.getBean("prototypeBean", PrototypeBean.class));



	}
}