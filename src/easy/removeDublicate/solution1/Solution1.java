package easy.removeDublicate.solution1;

import java.util.Arrays;
import java.util.HashSet;

/*
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 each unique element appears only once. The relative order of the elements should be kept the same.
 Then return the number of unique elements in nums.

 Consider the number of unique elements of nums to be k,
 to get accepted, you need to do the following things:

 Change the array nums such that the first k elements of nums contain the unique elements
 in the order they were present in nums initially. The remaining elements of nums
 are not important as well as the size of nums.

 Return k.
 */
public class Solution1 {
    public static int removeDuplicates(int[] nums) {
        //Решение, которое является долгим и не оптимальным. Первое, что пришло в голову
        int[] newArray = new int[nums.length];
        int count, k = 0;
        for (int i = 0; i < nums.length;) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if (count == 1)
                        newArray[k++] = nums[i];
                }
            }
            i += count;
        }

        for (int i = 0; i < newArray.length; i++) {
            nums[i] = newArray[i];
        }

        return k;
    }
}
