import java.util.Arrays;

public class search_SortedArray_RowWise_ColumnWise {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,4,6},
                {3,5,8},
                {7,9,10}
        };
        int target = 5;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length-1;

        while (r < matrix.length-1 && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r,c};
            }
            if (matrix[r][c] < target) {
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
