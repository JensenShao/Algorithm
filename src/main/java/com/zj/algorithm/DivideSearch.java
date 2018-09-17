package com.zj.algorithm;

/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-09-17-19:38
 **/
public class DivideSearch {
    public<T extends Comparable> int binarySearch(T[] array,int l, int r, T v){
        int mid = (r-l)/2 + l;

        if (v.compareTo(array[mid])==0){
            return mid;
        }

        else if (v.compareTo(array[mid])<0){
            return binarySearch(array, l, mid,v);
        }
            else {
            return binarySearch(array,mid+1,r,v);
        }

    }
}
