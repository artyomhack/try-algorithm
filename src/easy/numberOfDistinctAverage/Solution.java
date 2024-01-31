package easy.numberOfDistinctAverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

/*
    You are given a 0-indexed integer array nums of even length.

    As long as nums is not empty, you must repetitively:

    * Find the minimum number in nums and remove it.
    * Find the maximum number in nums and remove it.
    * Calculate the average of the two removed numbers.

    The average of two numbers a and b is (a + b) / 2.

    * For example, the average of 2 and 3 is (2 + 3) / 2 = 2.5.

    Return the number of distinct averages calculated using the above process.

    Note that when there is a tie for a minimum or maximum number, any can be removed.

 */
public class Solution {
    public static int distinctAverages(int[] nums) {
        int average = 0;
        if (nums.length <= 2) return 1;
        while (true) {
            Arrays.sort(nums);
            int minN = nums[0];
            int maxN = nums[nums.length - 1];
            nums = deleteIndex(deleteIndex(nums, minN), maxN);

            if (nums.length == 0) return average;
            else average = (maxN + minN) / nums.length;
        }
    }

    public static int[] deleteIndex(int[] array, int number) {
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (array[j] == number) j++;
            newArray[i] = array[j++];
        }
        return newArray;
    }

    static class MyTest {

        @Test
        public void checkTime() {
            var start = System.currentTimeMillis();
            checkAlgorithm();
            var end = System.currentTimeMillis();
            System.out.println("Spend time O(n2): " + (end - start) + "s.");
        }

        @Test
        public void checkDistinctAverage() {
            Assertions.assertEquals(2, distinctAverages(new int[] {4,1,4,0,3,5}));
            Assertions.assertEquals(1, distinctAverages(new int[] {1,100}));
        }



        @Test
        public void checkDelete() {
            int[] nums = {1, 2, 3, 4, 5};
            Assertions.assertEquals(
                    Arrays.toString(new int[]{2, 3, 4, 5}),
                    Arrays.toString(deleteIndex(nums, 1))
            );
            Assertions.assertEquals(
                    Arrays.toString(new int[]{1, 2, 3, 4}),
                    Arrays.toString(deleteIndex(nums, 5))
            );
        }

        public void checkAlgorithm() {
            System.out.println("Start getCommon(...) method");
            int result = distinctAverages(new int[] {4,1,4,0,3,5});
            System.out.println("End getCommon(...) method. Result: " + Objects.equals(2, result));
        }
    }
}
