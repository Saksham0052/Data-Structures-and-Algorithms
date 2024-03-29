public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums , k));

    }
    static int splitArray(int[] nums , int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i <= nums.length-1; i++){
            start = Math.max(start , nums[i]);
            end = end + nums[i];
        }

        while(start < end ){
            int mid = start + (end - start)/2;


//            Calculating how many pieces we can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum = sum + num;
                }
            }
            if(pieces > m){
                start = mid +1;
            }
            else{
                end = mid ;
            }
        }
        return end;
    }
}
