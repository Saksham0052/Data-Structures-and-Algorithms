package cyclicQues;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 1};
        System.out.println(findDuplicate(arr));

    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] -1;
                if(nums[i] != nums[correct]){
                    swap(nums , i , correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] =temp;
    }
}
