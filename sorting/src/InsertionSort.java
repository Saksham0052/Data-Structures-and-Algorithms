import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, -2, -29, 7, 1, 0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length-2; i++){
            for (int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// Why use insertion sort
// --> Adaptive - steps get reduced when array is sorted
// --> Stable -> insertion , bubble , cyclic
// --> Used for smaller value of arr.length
