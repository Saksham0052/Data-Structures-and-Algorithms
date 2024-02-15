import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},

        };
        System.out.println(Arrays.toString((search(matrix, 9))));
    }

    static int [] binarySearch(int [][] matrix , int row , int cStart , int cEnd , int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid] == target){
                return new int[] {row, mid};
            } else if (target < matrix[row][mid]) {
                cEnd = mid -1;
            }
            else{
                cStart = mid +1;
            }
        }
        return new int[]{-1, -1};
    }
    static int [] search(int [][] matrix , int target){
        int row = matrix.length;
        int col = matrix[0].length;  // If there is only one row

        if (row == 1){
            return binarySearch(matrix , row-1, 0 , col-1 , target);
        }
        int rStart = 0;
        int rEnd = row-1;
        int mcol = col/2;

//        This will run till there are only two rows left
        while(rStart < (rEnd -1)){
            int  mid = rStart + (rEnd - rStart)/2;
            if (matrix[mid][mcol] == target){
                return new int[] {mid , mcol};
            }
            if (matrix[mid][mcol] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }

        }

        //        Now we have two rows left
        if (matrix[rStart][mcol] == target){
            return new int[]{rStart , mcol};
        }
        if (matrix[rStart+1][mcol] == target){
            return new int[]{rStart+1 , mcol};
        }

        // Search in 1st half
        if (target <= matrix[rStart][mcol -1]){
                return binarySearch(matrix , rStart , 0, mcol-1 , target);
        }
        // Search in 2nd half
        if (target >= matrix[rStart][mcol +1] && target <=  matrix[rStart][col-1]){
            return binarySearch(matrix , rStart , mcol+1, col-1  , target);
        }
        // Search in 3rd half
        if (target <= matrix[rStart+1][mcol -1]){
            return binarySearch(matrix , rStart+1 , 0, mcol-1  , target);
        }
        // Search in 4th half
        else {
            return binarySearch(matrix , rStart+1 , mcol+1, col-1  , target);
        }
    }
}
