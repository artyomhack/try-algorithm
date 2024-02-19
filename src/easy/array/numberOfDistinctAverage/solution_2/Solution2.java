package easy.array.numberOfDistinctAverage.solution_2;

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

import java.util.Arrays;
import java.util.HashSet;

public class Solution2 {
    public static int distinctAverages(int[] nums) {
        //В задаче сказано про уникальные значения, чтобы оптимизировать код до O(n), нужно использовать Set
        HashSet<Double> averages = new HashSet<>();
        int i = 0;
        for (int j = nums.length - 1; j >= i; j--) {
            Arrays.sort(nums);
            int max = nums[j];
            int min = nums[i];
            double average = (max + min) / 2.0;
            averages.add(average);
            i++;
        }
        return averages.size();
    }
}
