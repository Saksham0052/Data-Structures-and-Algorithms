package cyclicQues;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNum(arr));

    }
    static int missingNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
        return element(arr);
    }

    static int element(int[] arr){
        for(int i = 0; i < arr.length; i ++ ){
            if(i != arr[i]){
                return i;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
