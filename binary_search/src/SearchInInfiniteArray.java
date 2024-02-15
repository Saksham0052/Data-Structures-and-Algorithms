//This question is a doubt

public class SearchInInfiniteArray {
    public static void main(String[] args){
//        Basically we don't know the size of the array
//        , or we have to solve this problem without using arr.length
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 160;
        System.out.println(ans(arr, target));
    }


    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
//    For finding the range in which target lies
//    static int  range(int[] arr , int target){
//        int start = 0;
//        int end = 1; //  initially we made end at index 1 as we don't know the size of the array
////        we will be doubling the range in forward direction until target lies between start and end
//        while(target > arr[end]){
//            int temp = end +1;
//            end = end + (end - start + 1)*2;
//            start = temp;
//        }
//        return binarySearch(arr  , target , start , end);
//    }
//
//    private static int  binarySearch(int[] arr, int target, int start, int end) {
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if (arr[mid] == target){
//                return mid;
//            }
//            else if (target < arr[mid]){
//                end = mid -1;
//            }
//            else{
//                start = mid +1;
//            }
//        }
//        return -1;
//
//    }
}
