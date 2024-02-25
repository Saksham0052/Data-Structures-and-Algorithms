package cyclicQues;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class NumsDisappeared {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 1};
        System.out.println(findDisappeared(arr));

    }
    private static List<Integer> findDisappeared(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length ; index++){
            if (nums[index] != index +1){
                ans.add(index+1);
            }
        }
        return ans;

    }
    private static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
