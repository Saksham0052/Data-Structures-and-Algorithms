public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18};
        int target = 2;
        System.out.println(ceilingOfNumber2(arr , target));

    }

//    static int ceilingOfNumber(int[] arr , int target){
//        int start = 0;
//        int end = arr.length -1;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(arr[mid] == target || ((arr[mid] > target) && (arr[mid -1] < target))){
//                return arr[mid];
//            }
//            else if (target < arr[mid]){
//                end = mid -1;
//            }
//            else{
//                start = mid +1;
//            }
//        }
//        return -1;
//    }
//    Method 2
    static int ceilingOfNumber2(int[] arr , int target){
//        Condition for if the no is greater than the last number
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target ){
                return arr[mid];
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return arr[start];
    }

}
