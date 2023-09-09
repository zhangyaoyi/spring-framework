package org.springframework.event;

import org.springframework.context.ApplicationListener;

public class TestApplicationEventListener implements ApplicationListener<TestApplicationEvent> {
	@Override
	public void onApplicationEvent(TestApplicationEvent event) {
		System.out.println("TestEventListener.onApplicationEvent");
	}
}
