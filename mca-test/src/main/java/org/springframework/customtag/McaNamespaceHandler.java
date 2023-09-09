package org.springframework.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class McaNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
