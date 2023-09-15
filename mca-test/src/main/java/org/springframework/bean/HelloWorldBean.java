package org.springframework.bean;

public class HelloWorldBean {

	private String message;

	private String name;

	public HelloWorldBean() {
		this.message = "Hello world!";
	}

	public void sayMessage() {
		System.out.println(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
