package yandexTraine.lecture2.task3;

/*
Найти Max число в последовательности
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3 {

    public static int fetchMaxInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    static class Test {
        @org.junit.jupiter.api.Test
        public void check_fetchMax() {
            int[] testArray = {1,2,5,6,3,4,5};
            Assertions.assertEquals(6, fetchMaxInArray(testArray));
        }
    }

}
