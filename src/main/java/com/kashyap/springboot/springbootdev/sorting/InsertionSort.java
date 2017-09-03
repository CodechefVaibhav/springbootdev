package com.kashyap.springboot.springbootdev.sorting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("insertion")
public class InsertionSort implements SortingAlgorithm{

	/*public static void main(String... q) {
		int[] a = new InsertionSort().insertionSort(new int[] { 5, 8, 1, 0, 2, 6, 3 });
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}*/

	public int[] sort(int[] arry) {
		System.out.println("InsertionSort in Use");
		int n = arry.length;
		for (int j = 1; j < n; j++) {
			int key = arry[j];
			int i = j - 1;
			while ((i > -1) && (arry[i] > key)) {
				arry[i + 1] = arry[i];
				i--;
			}
			arry[i + 1] = key;
		}

		return arry;
	}
}
