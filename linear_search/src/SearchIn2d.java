import java.util.Arrays;

public class SearchIn2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 23, 45, 21},
            {39, 40},
                {9, 25, 2},
                {3, 30, 4, 31}
        };
        int[] indexArr = search(arr, 0);
        System.out.println(Arrays.toString(indexArr));
        System.out.println(maxxValue(arr));

    }

    private static int[] search(int[][] arr, int target) {
        for (int row = 0 ; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target ){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1 , -1};
    }

//    Finding max value in 2d array
private static int maxxValue(int[][] arr) {
    int maxx = Integer.MIN_VALUE;
        for (int row = 0 ; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > maxx ){
                    maxx = arr[row][col];
                }
            }
        }
        return maxx;
    }
}
