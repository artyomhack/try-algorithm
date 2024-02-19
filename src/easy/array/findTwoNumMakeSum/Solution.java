package easy.array.findTwoNumMakeSum;

import org.junit.jupiter.api.Assertions;

public class Solution {

    public static boolean isMakeSumFromTwoNum(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            int num_1 = nums[i];
            for (int j = nums.length-1; j >= 0; j--) {
                int num_2 = nums[j];
                if (i != j && (num_1 + num_2) == x)
                    return true;
            }
        }
        return false;
    }

    static class Test {

        @org.junit.jupiter.api.Test
        public void test1() {
            int[] test = {1,2,0,2,3,5};
            Assertions.assertTrue(isMakeSumFromTwoNum(test, 4));
        }

        @org.junit.jupiter.api.Test
        public void test2() {
            int[] test = {-2, 4,-9,0,2,1,6};
            Assertions.assertTrue(isMakeSumFromTwoNum(test, 2));
        }

        @org.junit.jupiter.api.Test
        public void test3() {
            int[] test = {-3,-1,0,9,3,1};
            Assertions.assertFalse(isMakeSumFromTwoNum(test, 100));
        }

        @org.junit.jupiter.api.Test
        public void test4() {
            int[] test = {};
            Assertions.assertFalse(isMakeSumFromTwoNum(test, 1));
        }
    }

}
