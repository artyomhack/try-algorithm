package easy.removeDublicate;

import easy.removeDublicate.solution1.Solution1;
import easy.removeDublicate.solution2.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MyTest {
    @Nested
    class SolutionTest1 {

        @Test
        public void checkRemoveElement1_success() {
            int[] testArray = {1,1,2};
            Assertions.assertEquals(2, Solution1.removeDuplicates(testArray));
        }

        @Test
        public void checkRemoveElement2_success() {
            int[] testArray = {0,0,1,1,1,2,2,3,3,4};
            Assertions.assertEquals(5, Solution1.removeDuplicates(testArray));
        }
    }

    @Nested
    class SolutionTest2 {
        @Test
        public void checkRemoveElement1_success() {
            int[] testArray = {1,1,2};
            Assertions.assertEquals(2, Solution2.removeDuplicates(testArray));
        }

        @Test
        public void checkRemoveElement2_success() {
            int[] testArray = {0,0,1,1,1,2,2,3,3,4};
            Assertions.assertEquals(5, Solution2.removeDuplicates(testArray));
        }
    }
}
