import java.util.Arrays;

// Here the matrix is sorted in row and column  manner
public class RowColMatrix {
    public static void main(String[] args){
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(rowColMatrix(matrix , 39)));
    }
    static int[] rowColMatrix(int [][] matrix , int target){
        int r = 0;
        int c = matrix.length-1;
        while(r <= matrix.length-1 && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            else if(target < matrix[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}
