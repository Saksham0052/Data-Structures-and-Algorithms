package cyclicQues;

public class MissingPositivr {
    public static void main(String[] args) {

    }
    static int firstMissingPositive(int[] nums){
        int i = 0;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] < nums.length && i != nums[i]){
                swap(nums , i , nums[i]);

            }
            else{
                i++;
            }
        }
        return element(nums);
    }

    static int element(int[] arr){
        for(int i = 0; i < arr.length; i ++ ){
            if(i != arr[i +1 ]){
                return i +1;
            }
        }
        return arr.length +1;
    }

    private static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
