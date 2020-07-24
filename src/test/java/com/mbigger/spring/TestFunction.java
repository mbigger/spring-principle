package com.mbigger.spring;

import java.util.Arrays;
import java.util.List;

public class TestFunction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int sum = numbers.stream().reduce(0, (i,j) -> i+ j);
        System.out.println(sum);

        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        int result = numList.stream().reduce((a,b) -> a + b ).get();
        System.out.println(result);
    }
}
