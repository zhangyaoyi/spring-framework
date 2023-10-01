package org.springframework.supplier;

public class App {

	private String name;

	public App(String name) {
		this.name = name;
	}

	public App() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
