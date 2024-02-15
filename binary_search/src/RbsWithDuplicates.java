public class RbsWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3};
        int target = 0;
        System.out.println(search(arr, target));

    }


    static int search(int[] nums , int target){
        int pivot = findPivotWithDuplicates(nums);


        if (pivot == -1){
            return binarySearch(nums, target , 0 , nums.length-1);
        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        else {
            return binarySearch(nums, target , pivot +1 , nums.length-1);
        }
    }
//    We will try to eliminate duplicates
    static int findPivotWithDuplicates(int[] arr ){
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
//                if so , then check weather start or end id  pivot if not
//                skip start and end
                if(start < end &&arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if (end > start && arr[end] < arr[end - 1]){
                    return end -1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[end]< arr[mid] ){
                start = mid + 1;
            }
            else {
                end  = mid-1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr , int target , int start, int end) {

        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
