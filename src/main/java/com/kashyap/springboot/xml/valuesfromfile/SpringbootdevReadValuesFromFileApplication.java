package com.kashyap.springboot.xml.valuesfromfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.kashyap.springboot.xml.valuesfromfile")
@PropertySource("classpath:values.properties")
public class SpringbootdevReadValuesFromFileApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringbootdevReadValuesFromFileApplication.class);) {
			VariableEntity veInstance = context.getBean(VariableEntity.class);
			System.out.println(veInstance);
			System.out.println(veInstance.getValue());

		}
	}
}
