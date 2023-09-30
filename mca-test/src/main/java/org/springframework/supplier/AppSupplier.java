package org.springframework.supplier;

public class AppSupplier {

	public static App createApp() {
		return new App("AppSupplier::createApp Hello App");
	}
}
