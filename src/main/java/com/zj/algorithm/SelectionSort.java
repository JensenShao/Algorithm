package com.zj.algorithm;

import com.zj.algorithm.helper.AlgorithmHelper;

/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-09-12-9:21
 **/
public class SelectionSort {
    public  void sort(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            int iPos = i;
            Integer temp = array[i];
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[i]){
                    iPos = j;
                    array[i] = array[j];
                }
            }
            array[iPos] = temp;
        }
    }
}
