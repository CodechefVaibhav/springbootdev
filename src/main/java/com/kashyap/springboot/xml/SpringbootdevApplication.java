package com.kashyap.springboot.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringbootdevApplication {

	// What are the beans ?
	// What are the dependencies of a bean ?
	// where to search for beans ?

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			PrototypeXMLDAO pdCDIOne = context.getBean(PrototypeXMLDAO.class);
			PrototypeXMLDAO pdCDITwo = context.getBean(PrototypeXMLDAO.class);
			System.out.println(pdCDIOne);
			System.out.println(pdCDIOne.getConnection());
			System.out.println(pdCDITwo);
			System.out.println(pdCDITwo.getConnection());

		}
	}
}
