package yandexTraine.lecture2.task1;

/*
   Дана последовательность чисел длинной N
   Найти первое(левое) вхождение положительного числа Х
   Если числ оне встречалось, то вывести -1
 */

import org.junit.jupiter.api.Assertions;

public class Task1 {

    public static int findXInArray(int[] array, int x) {
        var answer = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x && answer == -1)
                answer = i;
        }
        return answer;
    }

    static class Test {
        @org.junit.jupiter.api.Test
        public void check_findX() {
            int[] testArray = {1,2,1,2,3};
            Assertions.assertEquals(1, findXInArray(testArray, 2));
            Assertions.assertEquals(-1, findXInArray(testArray, 4));
        }

    }
}
