package org.springframework.bean;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean() {
		this.message = "Hello world!";
	}

	public void sayMessage() {
		System.out.println(message);
	}

}
