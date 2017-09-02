package com.kashyap.springboot.springbootdev.sorting;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingAlgorithm {
	
	/*public static void main(String... q){
		int[] a = new BubbleSort().bubblesort(new int[]{5,8,1,0,2,6,3});
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}*/
	public int[] sort(int[] arry) {
		System.out.println("BubbleSort in Use");
		int n = arry.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arry[j - 1] > arry[j]) {
					temp = arry[j - 1];
					arry[j - 1] = arry[j];
					arry[j] = temp;
				}

			}
		}
		
		return arry;
	}
}
