package org.springframework.bean;

import org.springframework.beans.factory.FactoryBean;

public class TestFactoryBean implements FactoryBean<HelloWorldBean> {
	@Override
	public HelloWorldBean getObject() throws Exception {
		return new HelloWorldBean();
	}

	@Override
	public Class<?> getObjectType() {
		return HelloWorldBean.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
