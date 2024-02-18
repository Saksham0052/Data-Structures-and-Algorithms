import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, -2, -29, 7, 1, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int last = arr.length-i-1;
            int max = maxElement(arr , 0 , last);
            swap(arr , last , max);
        }
    }

    private static void swap(int [] arr ,int last, int max) {
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }

    private static int maxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
