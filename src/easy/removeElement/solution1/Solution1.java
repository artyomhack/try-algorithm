package easy.removeElement.solution1;

/*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements
    in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k,
    to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements
    which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public static int removeElement(int[] nums, int val) {
        //3 2 2 3 -> 2 2 3 3
        //Перемещаем значение в конец массива, считаем кол-во неодинаковых элементов
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (val == nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        int k = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) k++;
            else break;
        }

        return k;
    }
}
