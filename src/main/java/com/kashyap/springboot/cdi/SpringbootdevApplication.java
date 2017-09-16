package com.kashyap.springboot.cdi;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kashyap.springboot.springbootdev.scope.PrototypeDAO;
import com.kashyap.springboot.springbootdev.search.BinarySearch;
import com.kashyap.springboot.springbootdev.sorting.BubbleSort;
import com.kashyap.springboot.springbootdev.sorting.InsertionSort;
import com.kashyap.springboot.springbootdevtwo.PrototypeCompDAO;

@SpringBootApplication
@ComponentScan("com.kashyap.springboot.cdi")
public class SpringbootdevApplication {

	// What are the beans ?
	// What are the dependencies of a bean ?
	// where to search for beans ?

	public static void main(String[] args) {
		// BinarySearch bn = new BinarySearch(new InsertionSort());

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootdevApplication.class, args);
		PrototypeCDIDAO pdCDIOne = context.getBean(PrototypeCDIDAO.class);
		PrototypeCDIDAO pdCDITwo = context.getBean(PrototypeCDIDAO.class);
		System.out.println(pdCDIOne);
		System.out.println(pdCDIOne.getConnection());
		System.out.println(pdCDITwo);
		System.out.println(pdCDITwo.getConnection());
	}
}
