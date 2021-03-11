package com.company.level1;

import java.util.Arrays;

public class Sorting {
    //K번째 수

    public int[] solution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];

        //내가 한거
//        for (int j = 0; j < commands.length; j++) {
//            ArrayList<Integer> temp = new ArrayList<>();
//            int[] test = new int[commands[j][1] - commands[j][0] + 1];
//            for (int a = commands[j][0]; a <= commands[j][1]; a++) {
//                test[commands[j][1] - a] = array[a - 1];
//            }
//            Arrays.sort(test);
//
//            result[j] = test[commands[j][2] - 1];
//        }

        //좋은 답변1
        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        // 좋은답변 2
        int a = 0;
        for (int[] info : commands) {
            int i = info[0];
            int j = info[1];
            int k = info[2];

            int[] buf = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(buf);
            answer[a] = buf[k - 1];
            a++;
        }

        return answer;
    }
}
