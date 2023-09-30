package org.springframework.supplier;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class AppSupplierBeanFactoryPostPrcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("app");
		genericBeanDefinition.setInstanceSupplier(AppSupplier::createApp);
		genericBeanDefinition.setBeanClass(App.class);
	}
}
