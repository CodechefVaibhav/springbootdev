package com.kashyap.springboot.springbootdev;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kashyap.springboot.springbootdev.scope.PrototypeDAO;
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

		PrototypeDAO pd = context.getBean(PrototypeDAO.class);
		PrototypeDAO pd1 = context.getBean(PrototypeDAO.class);
		System.out.println(pd);
		System.out.println(pd.getConnection());
		System.out.println(pd1);
		System.out.println(pd1.getConnection());
		/**
		 * Case 1 :
		 * 
		 * @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) public class
		 *                                                 PrototypeDAO
		 * @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) public class
		 *                                                 JdbcConnection Output
		 *                                                 : com.kashyap.
		 *                                                 springboot.
		 *                                                 springbootdev.scope.
		 *                                                 PrototypeDAO@7ee55e70
		 *                                                 com.kashyap.
		 *                                                 springboot.
		 *                                                 springbootdev.scope.
		 *                                                 JdbcConnection@3fcdcf
		 *                                                 com.kashyap.
		 *                                                 springboot.
		 *                                                 springbootdev.scope.
		 *                                                 PrototypeDAO@7668d560
		 *                                                 com.kashyap.
		 *                                                 springboot.
		 *                                                 springbootdev.scope.
		 *                                                 JdbcConnection@3fcdcf
		 * 
		 *                                                 CASE : 2
		 * @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) public class
		 *                                                 PrototypeDAO
		 * @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) public class
		 *                                                 JdbcConnection
		 * 
		 * Output : 
		 * com.kashyap.springboot.springbootdev.scope.PrototypeDAO@6c44052e
		 * com.kashyap.springboot.springbootdev.scope.JdbcConnection@5c371e13
		 * com.kashyap.springboot.springbootdev.scope.PrototypeDAO@6c44052e
		 * com.kashyap.springboot.springbootdev.scope.JdbcConnection@5c371e13
		 * 
		 * If You carefully observe prototype is singleton therefore the object hascode
		 * is same for both the objects & in case of jdbc connection class, even though 
		 * being prototype as scope still the hashcode for JDBC class is same.
		 * 
		 * output after configuring the proxy note the difference, carefully observe now jdbc will have different
		 * hascode:-
		 * com.kashyap.springboot.springbootdev.scope.PrototypeDAO@76b0ae1b
		 * com.kashyap.springboot.springbootdev.scope.JdbcConnection@4e7095ac
         * com.kashyap.springboot.springbootdev.scope.PrototypeDAO@76b0ae1b
         * com.kashyap.springboot.springbootdev.scope.JdbcConnection@251ebf23                                                 
		 * 
		 */
	}
}
