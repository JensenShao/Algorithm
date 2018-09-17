package com.zj.algorithm;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.zj.algorithm.helper.AlgorithmHelper;
import com.zj.algorithm.helper.CglibProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmApplication.class, args);
		Integer[] array = AlgorithmHelper.generateArray(100, 1, 100);
//		selectionSort(array);
//		insertSort(array);

		bubbleSort(array);
	}

	public static void selectionSort(Integer[] array){
		CglibProxy proxy = new CglibProxy();
		SelectionSort selectionSort = new SelectionSort();
		SelectionSort selectionSortProxy = (SelectionSort) proxy.getInstance(selectionSort);

		AlgorithmHelper.printArray(array);
		selectionSortProxy.sort(array);
		AlgorithmHelper.printArray(array);

	}

	static void insertSort(Integer[] array){
		CglibProxy proxy = new CglibProxy();
		InsertionSort insertionSort = new InsertionSort();
		InsertionSort insertionSortProxy = (InsertionSort)proxy.getInstance(insertionSort);

		AlgorithmHelper.printArray(array);
		insertionSortProxy.sort(array);
		AlgorithmHelper.printArray(array);
	}

	static void bubbleSort(Integer[] array){
		CglibProxy proxy = new CglibProxy();
		BubbleSort bubbleSort = new BubbleSort();
		BubbleSort bubbleSortProxy = (BubbleSort)proxy.getInstance(bubbleSort);
		AlgorithmHelper.printArray(array);
		bubbleSortProxy.sort(array);
		AlgorithmHelper.printArray(array);
	}
}
