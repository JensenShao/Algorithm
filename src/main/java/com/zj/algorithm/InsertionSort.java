package com.zj.algorithm;

/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-09-12-11:01
 **/
public class InsertionSort {
    public <T extends Comparable> void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            int iPos = i;
            for (int j = i - 1; j >= 0 && (array[j].compareTo(temp) > 0); j--) {
                iPos = j;
                array[j + 1] = array[j];
            }
            array[iPos] = temp;
        }
    }
}
