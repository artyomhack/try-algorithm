package easy.array.removeElement;

import easy.array.removeElement.solution1.Solution1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MyTest {
    @Nested
    class SolutionTest1 {

        @Test
        public void checkRemoveElement1_success() {
            int[] testArray = {3,2,2,3};
            Assertions.assertEquals(2, Solution1.removeElement(testArray, 2));
        }
    }
}
