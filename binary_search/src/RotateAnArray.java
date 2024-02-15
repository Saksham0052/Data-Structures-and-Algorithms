import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums , k);
        System.out.println(Arrays.toString(nums));

    }

    static void rotate(int[] nums, int k) {




            int start = 0;
            int end = nums.length-1;

            while(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                k--;

            }

    }

}

