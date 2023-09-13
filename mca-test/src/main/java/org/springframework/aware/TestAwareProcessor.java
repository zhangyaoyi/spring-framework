package org.springframework.aware;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestAwareProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		if (bean instanceof TestAware) {
			Test test = new Test();
			test.setId("1");
			test.setName("TestAware");
			((TestAware) bean).setTest(test);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		return bean;
	}
}
