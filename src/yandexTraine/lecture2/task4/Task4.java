package yandexTraine.lecture2.task4;

/*
Найти Max число в последовательности и второе по величине число
(если вычеркнуть одно максимальное число, то второе будем максимальным)
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4 {

    //2 1 3 2 1
    //
    public static int[] fetchTwoMaximalNums(int[] array) {
        int[] result = new int[2];
        int max_1 = Math.max(array[0], array[1]);
        int max_2 = Math.min(array[0], array[2]);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_1) {
                max_2 = max_1;
                max_1 = array[i];
            }
            else if (array[i] > max_2) {
                max_2 = array[i];
            }
        }
        result[0] = max_1;
        result[1] = max_2;
        return result;
    }

    static class Test {

        @org.junit.jupiter.api.Test
        public void check_fetchTwoMaximalNums() {
            int[] test = {2,1,3,1,3,0};
            int[] answer = fetchTwoMaximalNums(test);
            Assertions.assertArrayEquals(new int[]{3,3}, answer);
        }

    }
}
