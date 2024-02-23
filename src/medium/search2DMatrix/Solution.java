package medium.search2DMatrix;

class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (searchTarget(matrix[i], target))
                return true;
        }
        return false;
    }

    public static boolean searchTarget(int[] array, int target) {
        int l = 0, r = array.length - 1, m = 0;

        while (l <= r) {
            m = (r + l) / 2;
            if (array[m] == target)
                break;
            else if (array[m] > target)
                r = m - 1;
            else
                l = m + 1;
        }

        return array[m] == target;
    }

    public static void main(String[] args) {
        int[][] testMatrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        System.out.println(searchMatrix(testMatrix, 11));

    }
}
