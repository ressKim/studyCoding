package com.company.level1;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    //K번째 수

    public int[] solution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = new int[3];

        for (int j = 0; j < commands.length; j++) {
            ArrayList<Integer> arrays = new ArrayList<>();
            for (int a = commands[j][0]; a <= commands[j][1]; a++) {
                arrays.add(array[a-1]);
            }
            Collections.sort(arrays);
            result[j] = arrays.get(commands[j][2]-1);
        }

        int[] answer = result;
        return answer;
    }
}
