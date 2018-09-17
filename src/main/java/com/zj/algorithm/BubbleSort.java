package com.zj.algorithm;

public class BubbleSort{
    public<T extends Comparable> void sort(T[] array){
        int arrayIndex = array.length-1;
        for (int  i = arrayIndex;  i >= 0;  i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j+1])>0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}