package org.springframework.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component("testAnnotationBean")
public class TestAnnotationBean {

	private String name;

	public TestAnnotationBean() {
		this.name = "TestAnnotationBean";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
