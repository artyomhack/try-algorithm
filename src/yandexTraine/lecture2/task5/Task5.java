package yandexTraine.lecture2.task5;

/*
Найти минимальное чётное число последовательно или вывести
 -1 если такого числа нет
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5 {

    public static int fetchMinEvenNum(int[] array) {
        boolean isMeet = false;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && (!isMeet || min > array[i])) {
                min = array[i];
                isMeet = true;
            }
        }
        return min;
    }

    static class Test {

        @org.junit.jupiter.api.Test
        public void check_fetchMinEvenNum() {
            int[] test = {2,4,6,3,1,0};
            Assertions.assertEquals(0, fetchMinEvenNum(test));
        }
    }

}
