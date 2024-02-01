package easy.numberOfDistinctAverage;

import easy.numberOfDistinctAverage.solution_1.Solution1;
import easy.numberOfDistinctAverage.solution_2.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class MyTest {

    @Nested
    class SolutionTest1 {
        @Test
        public void checkTest_1() {
            int[] testArray = {9, 5, 7, 8, 7, 9, 8, 2, 0, 7};
            Assertions.assertEquals(5, Solution1.distinctAverages(testArray));
        }

        @Test
        public void checkTest_2() {
            int[] testArray = {10, 6, 2, 10, 2, 7, 9, 5};
            Assertions.assertEquals(3, Solution1.distinctAverages(testArray));
        }

        @Test
        public void checkTest_3() {
            int[] testArray = {15, 77, 97, 26, 53, 41, 26, 13, 12, 18, 17, 42, 13, 33, 34, 70, 48, 65, 62, 78, 33, 60, 96, 53, 23, 14, 60, 70, 57, 41, 29, 12, 79, 65, 52, 30};
            Assertions.assertEquals(10, Solution1.distinctAverages(testArray));
        }

        @Test
        public void checkTest_4() {
            int[] testArray = {1,100};
            Assertions.assertEquals(1, Solution1.distinctAverages(testArray));
        }
    }

    @Nested
    class SolutionTest2 {
        @Test
        public void checkTest2_1() {
            int[] testArray = {9, 5, 7, 8, 7, 9, 8, 2, 0, 7};
            Assertions.assertEquals(5, Solution2.distinctAverages(testArray));
        }

        @Test
        public void checkTest2_2() {
            int[] testArray = {10, 6, 2, 10, 2, 7, 9, 5};
            Assertions.assertEquals(3, Solution2.distinctAverages(testArray));
        }

        @Test
        public void checkTest2_3() {
            int[] testArray = {15, 77, 97, 26, 53, 41, 26, 13, 12, 18, 17, 42, 13, 33, 34, 70, 48, 65, 62, 78, 33, 60, 96, 53, 23, 14, 60, 70, 57, 41, 29, 12, 79, 65, 52, 30};
            Assertions.assertEquals(10, Solution2.distinctAverages(testArray));
        }

        @Test
        public void checkTest2_4() {
            int[] testArray = {1,100};
            Assertions.assertEquals(1, Solution2.distinctAverages(testArray));
        }
    }

}
