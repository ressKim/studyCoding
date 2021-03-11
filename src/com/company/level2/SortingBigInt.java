package com.company.level2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingBigInt {
    //가장 큰 수

    public String solution() {
        //[6, 10, 2]	"6210"
        //[3, 30, 34, 5, 9]	"9534330"
//        int[] numbers = {6, 10, 2};
        int[] numbers = {3, 30, 34, 5, 9};
        Map<Integer, Integer> mp = IntStream.range(0, numbers.length).boxed().collect(
                Collectors.toMap(i -> i, i -> numbers[i], (a, b) -> b));

        Map<Integer, Double> temp = new HashMap<>();
        int i = 0;
        while (i < numbers.length) {
            int value = numbers[i];
            double dValue = numbers[i];
            while (value / 10 != 0) {
                value = value / 10;
                dValue = dValue / 10;
            }
            temp.put(i, dValue);
            i++;
        }
        System.out.println("temp = " + temp);

//        Map.Entry<>
        String answer = "";
        return answer;
    }
}
