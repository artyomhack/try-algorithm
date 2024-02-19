package easy.array.numberOfDistinctAverage.solution_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class Solution1 {
    public static int distinctAverages(int[] nums) {
        //В задачи сказано про уникальные значения, это первый вид моего решения, буду писать на прямую используя циклы,
        // скорость будет составлять O(n2)

        int countDifAverages = 0;

        List<Double> averages = new ArrayList<>();
        while (nums.length != 0) {
            Arrays.sort(nums);
            int min = nums[0], max = nums[nums.length - 1];
            nums = deleteElement(deleteElement(nums, 0), nums.length - 1);
            double tempAverage = (min + max) / (2 * 1.0);
            if (isHasNotDuplicateAverage(averages, tempAverage)) {
                averages.add(tempAverage);
                countDifAverages++;
            }
        }

        return countDifAverages;
    }

    public static int[] deleteElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length && j < newArray.length; i++) {
            if (i == index) continue;
            newArray[j++] = array[i];
        }
        return newArray;
    }

    public static boolean isHasNotDuplicateAverage(List<Double> averages, double average) {
        for (Double d : averages) {
            if (d == average) {
                return false;
            }
        }
        return true;
    }
}
