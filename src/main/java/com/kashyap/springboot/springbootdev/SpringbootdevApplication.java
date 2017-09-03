package com.kashyap.springboot.springbootdev;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kashyap.springboot.springbootdev.search.BinarySearch;
import com.kashyap.springboot.springbootdev.sorting.BubbleSort;
import com.kashyap.springboot.springbootdev.sorting.InsertionSort;

@SpringBootApplication
public class SpringbootdevApplication {

	// What are the beans ?
	// What are the dependencies of a bean ?
	// where to search for beans ?

	public static void main(String[] args) {
		// BinarySearch bn = new BinarySearch(new InsertionSort());

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootdevApplication.class, args);
		BinarySearch bn = context.getBean(BinarySearch.class);
		BinarySearch bn1 = context.getBean(BinarySearch.class);
		System.out.println(bn);
		System.out.println(bn1);
		/**
		 * Output when Singleton : default
		 * com.kashyap.springboot.springbootdev.search.BinarySearch@7ee55e70
		 * com.kashyap.springboot.springbootdev.search.BinarySearch@7ee55e70
		 * 
		 * Output when prototype
		 * com.kashyap.springboot.springbootdev.search.BinarySearch@131ff6fa
		 * com.kashyap.springboot.springbootdev.search.BinarySearch@43b40233
		 */
		System.out.println(bn.binarySearch(new int[] { 7, 3, 5, 2, 9, 1, 0 }, 9));
	}
}
