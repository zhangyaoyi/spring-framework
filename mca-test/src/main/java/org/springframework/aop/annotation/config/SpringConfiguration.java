package org.springframework.aop.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="org.springframework.aop.annotation")
@EnableAspectJAutoProxy
public class SpringConfiguration { }