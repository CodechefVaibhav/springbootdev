package com.kashyap.springboot.springbootdev.search;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kashyap.springboot.springbootdev.sorting.SortingAlgorithm;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	/**
	 * This is a situation where the autowiring is done by name
	 * if you carefully notice both the sorting algorithm 
	 * implementations doesn't have @Primary annotation but
	 * in the result we could see bubble sort being used as result of
	 * the injected name. However the if both name injection and @Primary
	 * injection is used, @Primary will have precedence over name injection
	 * method.
	 * */
	@Qualifier("bubble")
	private SortingAlgorithm sortingAlgo /*bubbleSort*/;
	
	/*public BinarySearch(SortingAlgorithm sortingAlgo){
		super();
		this.sortingAlgo = sortingAlgo;
	}*/
	
	/*public void setSortingAlgo(SortingAlgorithm sortingAlgo) {
		this.sortingAlgo = sortingAlgo;
	}*/
	
	/**
	 * injection can be done either by constructor or by setter method.
	 * Now out of these two approaches, you should be clear with the intent
	 * in order to select one.
	 * 
	 * 1) All mandatory injection should be done by setter injection.
	 * 2) For optional dependencies use setter injection.
	 * */

	public int binarySearch(int prt[], int key) {
		prt = sortingAlgo.sort(prt);
		return Arrays.binarySearch(prt, key);
	}
	
	@PostConstruct
	public void postConstruct(){
		logger.debug("post construct called in binary search");
	}
	
	@PreDestroy
	public void preDestroy(){
		logger.debug("pre-destroy called in binary search");
	}
}
