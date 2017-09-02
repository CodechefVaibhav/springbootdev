package com.kashyap.springboot.springbootdev.search;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kashyap.springboot.springbootdev.sorting.SortingAlgorithm;

@Component
public class BinarySearch {

	@Autowired
	private SortingAlgorithm sortingAlgo;
	
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
}
