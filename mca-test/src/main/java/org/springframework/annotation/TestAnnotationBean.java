package org.springframework.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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
