package easy.array.minimumCommonValue;

/*
 Given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 return the minimum integer common to both arrays.
 If there is no common integer amongst nums1 and nums2, return -1.

 Note that an integer is said to be common to nums1 and nums2
 if both arrays have at least one occurrence of that integer.

 Ru____________________
 Учитывая два целочисленных массива nums1и nums2, отсортированные в порядке неубывания,
 верните минимальное целое число, общее для обоих массивов .
 nums1Если среди и нет общего целого числа nums2, верните -1.

 Обратите внимание, что целое число считается общим для nums1и nums2,
 если оба массива имеют хотя бы одно вхождение этого целого числа.
 */

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class Solution {

    public static int getCommonToUseTwoPointer(int[] nums1, int[] nums2) {
        int fallExit = -1;
        if (nums1.length == 0 && nums2.length == 0)
            return fallExit;

        for(int i = 0; i < nums1.length; i++) {
            if (nums1[i] >= nums2[0]) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums2[j] == nums1[i])
                        return nums2[j];
                }
            }
        }
        return fallExit;
    }

    //Will make with HashSet

    public static int getCommonToUseSet(int[] nums1, int[] nums2) {
        return -1;
    }


    static class MyTest {

        @Test
        public void checkTime() {
            var start = System.currentTimeMillis();
            checkAlgorithm();
            var end = System.currentTimeMillis();
            System.out.println("Spend time O(n2): " + (end - start) + "s.");
        }

        public void checkAlgorithm() {
            System.out.println("Start getCommon(...) method");
            int result = getCommonToUseTwoPointer(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,14,17,20}, new int[] {14,15,17,19});
            System.out.println("End getCommon(...) method. Result: " + Objects.equals(14, result));
        }
    }

}
