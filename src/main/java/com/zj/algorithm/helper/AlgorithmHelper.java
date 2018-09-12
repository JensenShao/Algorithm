package com.zj.algorithm.helper;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.util.Assert;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.Random;

/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-09-12-9:03
 **/
public class AlgorithmHelper {
    /**
     *
     * @param num
     * @param rangeL
     * @param rangeR
     * @return integers of range [rangeL, rangeR)
     */
    public static Integer[] generateArray(int num, int rangeL, int rangeR){
        Assert.isTrue(rangeL <= rangeR,"[rangeL] must less than [rangeR]");

        Random random = new Random(System.currentTimeMillis());
        Integer[] intArray = new Integer[num];
        for (int i = 0; i < num; i++) {
            intArray[i] = random.nextInt(rangeR - rangeL + 1) + rangeL;
        }

        return intArray;
    }

    public static<T> void printArray(T[] array){
        for (T t: array) {
            System.out.print(t.toString() + " ");
        }
        System.out.println();
    }


}
