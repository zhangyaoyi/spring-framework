package org.springframework.bean;

public class PrototypeBean {

	private String name;

	public PrototypeBean() {
		name = "PrototypeBean constructor called";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
